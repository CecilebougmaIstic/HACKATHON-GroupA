package org.trans_hack.model;

public class Concert {
    private String id;
    private Fields fields;
    private Geometry geometry;
    protected  String adresseConcert;
    protected float prix;
    private Notation notation;
    private boolean annuler;


    public Concert() {}


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Fields getFields() {
        return fields;
    }

    public void setFields(Fields fields) {
        this.fields = fields;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
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

    @Override
    public String toString() {
        return "Concert{" +
                "id='" + id + '\'' +
                ", fields=" + fields +
                ", geometry=" + geometry +
                ", adresseConcert='" + adresseConcert + '\'' +
                ", prix=" + prix +
                '}';
    }
}