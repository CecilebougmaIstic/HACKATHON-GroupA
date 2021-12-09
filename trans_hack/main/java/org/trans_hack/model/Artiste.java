package org.trans_hack.model;

import java.util.ArrayList;
import java.util.List;

public class Artiste {
    private String id;
    String nomGroupe;
    String nomSpectacle;
    String dateConcert;
    String edition;
    List<Double>lieuCoordonnee=new ArrayList<Double>();
    protected  String adresseConcert;
    protected float prix;
    String paysOrigine;
    private Notation notation;
    private boolean annuler;
    public Artiste() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomGroupe() {
        return nomGroupe;
    }

    public void setNomGroupe(String nomGroupe) {
        this.nomGroupe = nomGroupe;
    }

    public List<Double> getLieuCoordonnee() {
        return lieuCoordonnee;
    }

    public void setLieuCoordonnee(List<Double> lieuCoordonnee) {
        this.lieuCoordonnee = lieuCoordonnee;
    }


    public String getDateConcert() {
        return dateConcert;
    }

    public void setDateConcert(String dateConcert) {
        this.dateConcert = dateConcert;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getPaysOrigine() {
        return paysOrigine;
    }

    public void setPaysOrigine(String paysOrigine) {
        this.paysOrigine = paysOrigine;
    }

    public String getNomSpectacle() {
        return nomSpectacle;
    }

    public void setNomSpectacle(String nomSpectacle) {
        this.nomSpectacle = nomSpectacle;
    }

    public Notation getNotation() {
        return notation;
    }

    public void setNotation(Notation notation) {
        this.notation = notation;
    }

    public boolean isAnnuler() {
        return annuler;
    }

    public void setAnnuler(boolean annuler) {
        this.annuler = annuler;
    }

    public String getAdresseConcert() {
        return adresseConcert;
    }

    public void setAdresseConcert(String adresseConcert) {
        this.adresseConcert = adresseConcert;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Artiste{" +
                "nomGroupe='" + nomGroupe + '\'' +
                ", nomSpectacle='" + nomSpectacle + '\'' +
                ", dateConcert='" + dateConcert + '\'' +
                ", edition='" + edition + '\'' +
                ", lieuCoordonnee=" + lieuCoordonnee +
                ", paysOrigine='" + paysOrigine + '\'' +
                '}';
    }
}
