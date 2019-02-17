/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entities.Event;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
@LocalBean
public class EventBean {
    
    @PersistenceContext(unitName="Billeterie-ejbPU")
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

    public void merge(Event e) {
        em.merge(e);
    }
}
