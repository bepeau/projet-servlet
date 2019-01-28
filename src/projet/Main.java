/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import entity.UserClient;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author bepereiraa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistence");
        EntityManager em = emf.createEntityManager();
        
        //List<UserClient> clients = em.createQuery("SELECT * FROM USER_CLIENT").getResultList();
        //System.out.println(clients.toString());
    }
    
}
