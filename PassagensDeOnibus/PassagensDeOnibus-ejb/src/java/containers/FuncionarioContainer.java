/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package containers;

import entity.Funcionario;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author 30926076
 */
public class FuncionarioContainer {
    private static FuncionarioContainer instance;
    private List<Funcionario> listaDeFuncionarios;

    private FuncionarioContainer() {
    }

    public static FuncionarioContainer getInstance() {
        if (instance == null) {
            instance = new FuncionarioContainer();
        }
        return instance;
    }

    public List<Funcionario> getListaDeFuncionario() {
        preencherLista();
        return listaDeFuncionarios;
    }

    public void setListaDeFuncionario(List<Funcionario> listaDeFuncionario) {
        this.listaDeFuncionarios = listaDeFuncionario;
    }
     public void preencherLista(){
        FabricaEntityManager.createEntityManager();
        Query q = FabricaEntityManager.getEm().createQuery("select f from Funcionario f");
        listaDeFuncionarios = q.getResultList();
        FabricaEntityManager.closeEntityManager();
    }
     public void excluiObjeto(Funcionario c){
       // Funcionario cx = FabricaEntityManager.getEm().find(Funcionario.class, c.getCpf());
       FabricaEntityManager.createTransactionalEntityManager();
       c= FabricaEntityManager.getEm().merge(c);
       FabricaEntityManager.getEm().remove(c);
       FabricaEntityManager.closeTransactionalEntityManager();
     }
     
     public void adicionaObjeto(Funcionario c){
         FabricaEntityManager.createTransactionalEntityManager();
        FabricaEntityManager.getEm().persist(c);
        FabricaEntityManager.closeTransactionalEntityManager();
     }
     public void alteraObjeto(Funcionario c){
         FabricaEntityManager.createTransactionalEntityManager();
         FabricaEntityManager.getEm().merge(c);
         FabricaEntityManager.closeTransactionalEntityManager();

     }
}
