/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entity.Usuario;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Eduardo
 */
@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> {
    @PersistenceContext(unitName = "SistemaRodoviario-warPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }
    
}
