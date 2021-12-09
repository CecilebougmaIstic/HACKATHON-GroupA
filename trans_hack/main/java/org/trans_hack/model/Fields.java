package org.trans_hack.model;

import com.fasterxml.jackson.annotation.JsonProperty;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString), Root.class); */
public class Fields{
    protected String spotify;
    @JsonProperty("1ere_date_timestamp")
    protected int _1ere_date_timestamp;
    protected String artistes;
    @JsonProperty("1ere_salle")
    protected String _1ere_salle;
    protected String edition;
    @JsonProperty("1ere_date")
    protected String _1ere_date;
    protected String deezer;
    protected String origine_pays1;
    protected String origine_ville1;
    @JsonProperty("2eme_date_timestamp")
    protected int _2eme_date_timestamp;
    @JsonProperty("2eme_date")
    protected String _2eme_date;
    @JsonProperty("1er_projet_atm")
    protected String _1er_projet_atm;
    @JsonProperty("4eme_date")
    protected String _4eme_date;
    @JsonProperty("2eme_projet")
    protected String _2eme_projet;
    @JsonProperty("3eme_date")
    protected String _3eme_date;
    @JsonProperty("3eme_date_timestamp")
    protected int _3eme_date_timestamp;
    @JsonProperty("4eme_date_timestamp")
    protected int _4eme_date_timestamp;
    @JsonProperty("2eme_salle")
    protected String _2eme_salle;
    @JsonProperty("3eme_salle")
    protected String _3eme_salle;
    @JsonProperty("4eme_salle")
    protected String _4eme_salle;
    protected String column_48;
    @JsonProperty("6eme_date")
    protected String _6eme_date;
    @JsonProperty("6eme_date_timestamp")
    protected int _6eme_date_timestamp;
    protected String column_47;
    @JsonProperty("6eme_salle")
    protected String _6eme_salle;
    protected String column_46;
    @JsonProperty("5eme_date")
    protected String _5eme_date;
    @JsonProperty("5eme_date_timestamp")
    protected int _5eme_date_timestamp;
    @JsonProperty("5eme_salle")
    protected String _5eme_salle;
    protected String origine_ville2;
    protected String origine_pays2;
    protected String nom_spectacle_ou_soiree;
    protected String column_45;
    protected String origine_pays4;
    protected String origine_pays3;
    @JsonProperty("4eme_ville")
    protected String _4eme_ville;
    protected String origine_ville4;
    protected String origine_ville3;
    @JsonProperty("1ere_ville")
    protected String _1ere_ville;

    public Fields() {
    }

    public String getSpotify() {
        return spotify;
    }

    public void setSpotify(String spotify) {
        this.spotify = spotify;
    }

    public int get_1ere_date_timestamp() {
        return _1ere_date_timestamp;
    }

    public void set_1ere_date_timestamp(int _1ere_date_timestamp) {
        this._1ere_date_timestamp = _1ere_date_timestamp;
    }

    public String getArtistes() {
        return artistes;
    }

    public void setArtistes(String artistes) {
        this.artistes = artistes;
    }

    public String get_1ere_salle() {
        return _1ere_salle;
    }

    public void set_1ere_salle(String _1ere_salle) {
        this._1ere_salle = _1ere_salle;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String get_1ere_date() {
        return _1ere_date;
    }

    public void set_1ere_date(String _1ere_date) {
        this._1ere_date = _1ere_date;
    }

    public String getDeezer() {
        return deezer;
    }

    public void setDeezer(String deezer) {
        this.deezer = deezer;
    }

    public String getOrigine_pays1() {
        return origine_pays1;
    }

    public void setOrigine_pays1(String origine_pays1) {
        this.origine_pays1 = origine_pays1;
    }

    public String getOrigine_ville1() {
        return origine_ville1;
    }

    public void setOrigine_ville1(String origine_ville1) {
        this.origine_ville1 = origine_ville1;
    }

    public int get_2eme_date_timestamp() {
        return _2eme_date_timestamp;
    }

    public void set_2eme_date_timestamp(int _2eme_date_timestamp) {
        this._2eme_date_timestamp = _2eme_date_timestamp;
    }

    public String get_2eme_date() {
        return _2eme_date;
    }

    public void set_2eme_date(String _2eme_date) {
        this._2eme_date = _2eme_date;
    }

    public String get_1er_projet_atm() {
        return _1er_projet_atm;
    }

    public void set_1er_projet_atm(String _1er_projet_atm) {
        this._1er_projet_atm = _1er_projet_atm;
    }

    public String get_4eme_date() {
        return _4eme_date;
    }

    public void set_4eme_date(String _4eme_date) {
        this._4eme_date = _4eme_date;
    }

    public String get_2eme_projet() {
        return _2eme_projet;
    }

    public void set_2eme_projet(String _2eme_projet) {
        this._2eme_projet = _2eme_projet;
    }

    public String get_3eme_date() {
        return _3eme_date;
    }

    public void set_3eme_date(String _3eme_date) {
        this._3eme_date = _3eme_date;
    }

    public int get_3eme_date_timestamp() {
        return _3eme_date_timestamp;
    }

    public void set_3eme_date_timestamp(int _3eme_date_timestamp) {
        this._3eme_date_timestamp = _3eme_date_timestamp;
    }

    public int get_4eme_date_timestamp() {
        return _4eme_date_timestamp;
    }

    public void set_4eme_date_timestamp(int _4eme_date_timestamp) {
        this._4eme_date_timestamp = _4eme_date_timestamp;
    }

    public String get_2eme_salle() {
        return _2eme_salle;
    }

    public void set_2eme_salle(String _2eme_salle) {
        this._2eme_salle = _2eme_salle;
    }

    public String get_3eme_salle() {
        return _3eme_salle;
    }

    public void set_3eme_salle(String _3eme_salle) {
        this._3eme_salle = _3eme_salle;
    }

    public String get_4eme_salle() {
        return _4eme_salle;
    }

    public void set_4eme_salle(String _4eme_salle) {
        this._4eme_salle = _4eme_salle;
    }

    public String getColumn_48() {
        return column_48;
    }

    public void setColumn_48(String column_48) {
        this.column_48 = column_48;
    }

    public String get_6eme_date() {
        return _6eme_date;
    }

    public void set_6eme_date(String _6eme_date) {
        this._6eme_date = _6eme_date;
    }

    public int get_6eme_date_timestamp() {
        return _6eme_date_timestamp;
    }

    public void set_6eme_date_timestamp(int _6eme_date_timestamp) {
        this._6eme_date_timestamp = _6eme_date_timestamp;
    }

    public String getColumn_47() {
        return column_47;
    }

    public void setColumn_47(String column_47) {
        this.column_47 = column_47;
    }

    public String get_6eme_salle() {
        return _6eme_salle;
    }

    public void set_6eme_salle(String _6eme_salle) {
        this._6eme_salle = _6eme_salle;
    }

    public String getColumn_46() {
        return column_46;
    }

    public void setColumn_46(String column_46) {
        this.column_46 = column_46;
    }

    public String get_5eme_date() {
        return _5eme_date;
    }

    public void set_5eme_date(String _5eme_date) {
        this._5eme_date = _5eme_date;
    }

    public int get_5eme_date_timestamp() {
        return _5eme_date_timestamp;
    }

    public void set_5eme_date_timestamp(int _5eme_date_timestamp) {
        this._5eme_date_timestamp = _5eme_date_timestamp;
    }

    public String get_5eme_salle() {
        return _5eme_salle;
    }

    public void set_5eme_salle(String _5eme_salle) {
        this._5eme_salle = _5eme_salle;
    }

    public String getOrigine_ville2() {
        return origine_ville2;
    }

    public void setOrigine_ville2(String origine_ville2) {
        this.origine_ville2 = origine_ville2;
    }

    public String getOrigine_pays2() {
        return origine_pays2;
    }

    public void setOrigine_pays2(String origine_pays2) {
        this.origine_pays2 = origine_pays2;
    }

    public String getNom_spectacle_ou_soiree() {
        return nom_spectacle_ou_soiree;
    }

    public void setNom_spectacle_ou_soiree(String nom_spectacle_ou_soiree) {
        this.nom_spectacle_ou_soiree = nom_spectacle_ou_soiree;
    }

    public String getColumn_45() {
        return column_45;
    }

    public void setColumn_45(String column_45) {
        this.column_45 = column_45;
    }

    public String getOrigine_pays4() {
        return origine_pays4;
    }

    public void setOrigine_pays4(String origine_pays4) {
        this.origine_pays4 = origine_pays4;
    }

    public String getOrigine_pays3() {
        return origine_pays3;
    }

    public void setOrigine_pays3(String origine_pays3) {
        this.origine_pays3 = origine_pays3;
    }

    public String get_4eme_ville() {
        return _4eme_ville;
    }

    public void set_4eme_ville(String _4eme_ville) {
        this._4eme_ville = _4eme_ville;
    }

    public String getOrigine_ville4() {
        return origine_ville4;
    }

    public void setOrigine_ville4(String origine_ville4) {
        this.origine_ville4 = origine_ville4;
    }

    public String getOrigine_ville3() {
        return origine_ville3;
    }

    public void setOrigine_ville3(String origine_ville3) {
        this.origine_ville3 = origine_ville3;
    }

    public String get_1ere_ville() {
        return _1ere_ville;
    }

    public void set_1ere_ville(String _1ere_ville) {
        this._1ere_ville = _1ere_ville;
    }

    @Override
    public String toString() {
        return "Fields{" +
                "spotify='" + spotify + '\'' +
                ", _1ere_date_timestamp=" + _1ere_date_timestamp +
                ", artistes='" + artistes + '\'' +
                ", _1ere_salle='" + _1ere_salle + '\'' +
                ", edition='" + edition + '\'' +
                ", _1ere_date='" + _1ere_date + '\'' +
                ", deezer='" + deezer + '\'' +
                ", origine_pays1='" + origine_pays1 + '\'' +
                ", origine_ville1='" + origine_ville1 + '\'' +
                ", _2eme_date_timestamp=" + _2eme_date_timestamp +
                ", _2eme_date='" + _2eme_date + '\'' +
                ", _1er_projet_atm='" + _1er_projet_atm + '\'' +
                ", _4eme_date='" + _4eme_date + '\'' +
                ", _2eme_projet='" + _2eme_projet + '\'' +
                ", _3eme_date='" + _3eme_date + '\'' +
                ", _3eme_date_timestamp=" + _3eme_date_timestamp +
                ", _4eme_date_timestamp=" + _4eme_date_timestamp +
                ", _2eme_salle='" + _2eme_salle + '\'' +
                ", _3eme_salle='" + _3eme_salle + '\'' +
                ", _4eme_salle='" + _4eme_salle + '\'' +
                ", column_48='" + column_48 + '\'' +
                ", _6eme_date='" + _6eme_date + '\'' +
                ", _6eme_date_timestamp=" + _6eme_date_timestamp +
                ", column_47='" + column_47 + '\'' +
                ", _6eme_salle='" + _6eme_salle + '\'' +
                ", column_46='" + column_46 + '\'' +
                ", _5eme_date='" + _5eme_date + '\'' +
                ", _5eme_date_timestamp=" + _5eme_date_timestamp +
                ", _5eme_salle='" + _5eme_salle + '\'' +
                ", origine_ville2='" + origine_ville2 + '\'' +
                ", origine_pays2='" + origine_pays2 + '\'' +
                ", nom_spectacle_ou_soiree='" + nom_spectacle_ou_soiree + '\'' +
                ", column_45='" + column_45 + '\'' +
                ", origine_pays4='" + origine_pays4 + '\'' +
                ", origine_pays3='" + origine_pays3 + '\'' +
                ", _4eme_ville='" + _4eme_ville + '\'' +
                ", origine_ville4='" + origine_ville4 + '\'' +
                ", origine_ville3='" + origine_ville3 + '\'' +
                ", _1ere_ville='" + _1ere_ville + '\'' +
                '}';
    }
}




