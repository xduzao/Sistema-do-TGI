/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package factory;

import entity.Passagem;

/**
 *
 * @author eduardosouza
 */
public class PassagemFactory extends Factory{
      private static PassagemFactory instance;

    public static PassagemFactory getInstance(){
        if (instance == null){
            instance = new PassagemFactory();
        }
        return instance;
    }
    @Override
    public Object criaObjeto() {

        Passagem passagem = new Passagem();
        return passagem;
    }

}
