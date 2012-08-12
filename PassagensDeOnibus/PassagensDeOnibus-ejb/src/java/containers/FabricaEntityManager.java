/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package containers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author eduardosouza
 */
public class FabricaEntityManager {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("UnidadePersist");;
    private static EntityManager em;
    public static void createTransactionalEntityManager() {

        // Create a new EntityManager
        em = emf.createEntityManager();

        // Begin transaction
        em.getTransaction().begin();
    }

    public static void closeTransactionalEntityManager() {

        em.getTransaction().commit();

        em.close();
    }

    public static void createEntityManager() {
        em = emf.createEntityManager();
    }

   public static void closeEntityManager() {

        em.close();
    }

    public static EntityManager getEm() {
        return em;
    }

    public static void setEm(EntityManager em) {
        FabricaEntityManager.em = em;
    }

    public static EntityManagerFactory getEmf() {
        return emf;
    }

    public static void setEmf(EntityManagerFactory emf) {
        FabricaEntityManager.emf = emf;
    }

}
