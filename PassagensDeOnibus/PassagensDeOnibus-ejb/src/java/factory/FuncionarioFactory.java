/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package factory;

import entity.Funcionario;

/**
 *
 * @author eduardosouza
 */
public class FuncionarioFactory extends Factory{

    private static FuncionarioFactory instance;

    private FuncionarioFactory(){
        
    }
    public static FuncionarioFactory getInstance(){
        if(instance == null){
            instance = new FuncionarioFactory();
        }
        return instance;

    }
    @Override
    public Object criaObjeto() {
        Funcionario funcionario = new Funcionario();
        return funcionario;
    }


}
