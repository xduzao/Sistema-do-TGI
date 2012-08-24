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

    public void editaObjeto(Object obj);

    public void excluiObjeto(Object obj);

    public void salvaObjeto(Object obj);
}
