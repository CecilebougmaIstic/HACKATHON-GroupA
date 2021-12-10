package org.trans_hack.model.spec;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import java.sql.Timestamp;
import java.time.LocalDate;

public class FieldsInString {

    protected String spotify;
    @JsonProperty("1ere_date_timestamp")
    protected Timestamp _1ere_date_timestamp;
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
    protected Timestamp _2eme_date_timestamp;
    @JsonProperty("3eme_projet")
    protected String _3eme_projet;


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
    protected Timestamp _3eme_date_timestamp;
    @JsonProperty("4eme_date_timestamp")
    protected Timestamp _4eme_date_timestamp;
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
    protected Timestamp _6eme_date_timestamp;
    protected String column_47;
    @JsonProperty("6eme_salle")
    protected String _6eme_salle;
    protected String column_46;
    @JsonProperty("5eme_date")
    protected String _5eme_date;
    @JsonProperty("5eme_date_timestamp")
    protected Timestamp _5eme_date_timestamp;
    @JsonProperty("5eme_salle")
    protected String _5eme_salle;
    protected String origine_ville2;
    protected String origine_pays2;
    protected String nom_spectacle_ou_soiree;
    @JsonProperty("4eme_projet")
    protected String _4eme_projet;
    protected String column_45;
    @JsonProperty("6eme_projet")
    protected String _6eme_projet;
    protected String origine_pays4;
    protected String origine_pays3;
    @JsonProperty("5eme_projet")
    protected String _5eme_projet;
    @JsonProperty("4eme_ville")
    protected String _4eme_ville;
    @JsonProperty("2eme_ville")
    protected String _2eme_ville;
    @JsonProperty("1ere_ville")
    protected String _1ere_ville;
    @JsonProperty("1eme_ville")
    protected String _1eme_ville;
    @JsonProperty("3eme_ville")
    protected String _3eme_ville;
    @JsonProperty("origine_ville4")
    protected String origine_ville4;
    @JsonProperty("origine_ville3")
    protected String origine_ville3;
    protected  String adresseConcert;
    protected float prix;
}
