package org.trans_hack.model;


import java.time.LocalDateTime;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Concert {

    /*Declaration of parameters*/
    @Id
    @GeneratedValue
    private  long id;

    protected LocalDateTime datePrestation;
    protected String lieu;
    protected  List<String> listeArtistes = new ArrayList<String>();
    protected String description;
    protected long  prix;
    protected LocalDateTime debutConcert;
    protected LocalDateTime  finConcert;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getDatePrestation() {
        return datePrestation;
    }

    public void setDatePrestation(LocalDateTime datePrestation) {
        this.datePrestation = datePrestation;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public List<String> getListeArtistes() {
        return listeArtistes;
    }

    public void setListeArtistes(List<String> listeArtistes) {
        this.listeArtistes = listeArtistes;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getPrix() {
        return prix;
    }

    public void setPrix(long prix) {
        this.prix = prix;
    }

    public LocalDateTime getDebutConcert() {
        return debutConcert;
    }

    public void setDebutConcert(LocalDateTime debutConcert) {
        this.debutConcert = debutConcert;
    }

    public LocalDateTime getFinConcert() {
        return finConcert;
    }

    public void setFinConcert(LocalDateTime finConcert) {
        this.finConcert = finConcert;
    }
}
