package org.trans_hack.model;

import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import java.util.*;

/**
 * 
 */
public class Place {
        //  Declaration of parameters

    private  long id;
    protected String nom;
    protected String coordonnées;
    protected String salle;

    @Id
    @GeneratedValue
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCoordonnées() {
        return coordonnées;
    }

    public void setCoordonnées(String coordonnées) {
        this.coordonnées = coordonnées;
    }

    public String getSalle() {
        return salle;
    }

    public void setSalle(String salle) {
        this.salle = salle;
    }



}