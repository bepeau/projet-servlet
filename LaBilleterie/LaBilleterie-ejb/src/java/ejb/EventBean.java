/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entities.Event;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author bepereiraa
 */
@Stateless
@LocalBean
public class EventBean {
    
    @PersistenceContext(unitName="LaBilleterie-ejbPU")
    private EntityManager em;
    
    public void save(Event n) {
        em.persist(n);
    }
    
    public void remove(Event n) {
        em.remove(n);
    }

    public List<Event> getEvents() {
        List<Event> liste = em.createQuery("SELECT e FROM Event e").getResultList();
        return liste;
    }
    
    public Event getEvent(long id) {
        Event event = (Event)em.createQuery("SELECT e FROM Event e WHERE e.id = :id").setParameter("id", id).getSingleResult();
        return event;
    }
    
}
