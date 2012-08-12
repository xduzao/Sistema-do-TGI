/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.ejb.Remote;

/**
 *
 * @author 30926076
 */
@Remote
public interface InterfaceController {

    public abstract void editaObjeto(Object obj);

    public abstract void excluiObjeto(Object obj);

    public void salvaObjeto(Object obj);
}
