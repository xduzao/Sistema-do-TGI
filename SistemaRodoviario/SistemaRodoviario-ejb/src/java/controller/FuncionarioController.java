/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import containers.FuncionarioContainer;
import entity.Funcionario;
import factory.FuncionarioFactory;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateful;
import transferObject.FuncionarioTO;

/**
 *
 * @author 30926076
 */
@Stateful(mappedName="ejb/FuncionarioController")
public class FuncionarioController implements InterfaceController {
    FuncionarioFactory funcionarioFactory =  FuncionarioFactory.getInstance();
    FuncionarioContainer container= FuncionarioContainer.getInstance();
    List<FuncionarioTO> listacto = new ArrayList<FuncionarioTO>();


   

    @Override
    public void editaObjeto(Object obj) {
       container.alteraObjeto(retornaFuncionarioVO(obj));
    }

    @Override
    public void excluiObjeto(Object obj) {
        container.excluiObjeto(retornaFuncionarioVO(obj));
    }

    @Override
    public void salvaObjeto(Object obj) {
        container.adicionaObjeto(retornaFuncionarioVO(obj));
    }

    public List<FuncionarioTO> transfereVOPraTO(List<Funcionario> lista){
        
        for(Funcionario f : lista){
            FuncionarioTO fto = new FuncionarioTO();
        
            fto.setNome(f.getNome());
            fto.setCargo(f.getCargo());
            listacto.add(fto);
        }

        return listacto;

    }
    public Funcionario retornaFuncionarioVO (Object obj){
        Funcionario funcionario = ((Funcionario)funcionarioFactory.criaObjeto());
        funcionario.setCargo(((FuncionarioTO)obj).getCargo());
        funcionario.setNome(((FuncionarioTO)obj).getNome());
        return funcionario;
    }

    public FuncionarioTO retornaFuncionarioTO (Object obj){
        FuncionarioTO funcionario = new FuncionarioTO();
        funcionario.setCargo(((Funcionario)obj).getCargo());
        funcionario.setNome(((Funcionario)obj).getNome());
        return funcionario;
    }
}
