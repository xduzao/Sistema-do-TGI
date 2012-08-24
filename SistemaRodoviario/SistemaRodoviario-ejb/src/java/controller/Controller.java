/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author 30926076
 */
@Remote
public interface Controller {

public List exibeLista();

}
