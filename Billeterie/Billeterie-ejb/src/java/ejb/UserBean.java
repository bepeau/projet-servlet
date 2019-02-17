/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entities.UserClient;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author mathieu
 */
@Stateless
@LocalBean
public class UserBean {

    @PersistenceContext(unitName="Billeterie-ejbPU")
    private EntityManager em;
    
    
    public void save(UserClient e) {
        em.persist(e);
    }
    
    public void remove(UserClient e) {
        em.remove(e);
    }
    
    public void merge(UserClient e) {
        em.merge(e);
    }
    
    public List<UserClient> getUsers() {
        List<UserClient> users = em.createQuery("select p from User_Client p").getResultList();
        return users;
    }
    
    
    
}
