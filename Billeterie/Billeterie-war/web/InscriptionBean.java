/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import ejb.UserBean;
import entities.UserClient;
import java.io.Serializable;
import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;


@Named(value = "inscriptionBean")
@RequestScoped
public class InscriptionBean implements Serializable {
    
    private UserClient utilisateur;

    
    @EJB
    private UserBean userbean;
    
    private final String value = "toto";

    
    public InscriptionBean() {
        utilisateur = new UserClient();
        utilisateur.setId(159L);
        utilisateur.setName("mama");
    }

    
    public void inscrire() {
        userbean.save(utilisateur);
        FacesMessage message = new FacesMessage( "Succès de l'inscription !" );
        FacesContext.getCurrentInstance().addMessage( null, message );
    }

    public UserClient getUtilisateur() {
        return utilisateur;
    }

    public String getValue() {
        return value;
    }
       

}
