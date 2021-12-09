package org.trans_hack.model.spec;

import org.trans_hack.model.Geometry;
import org.trans_hack.model.Notation;
import org.trans_hack.model.spec.FieldsInString;

public class ConcertInString {
    private String id;
    private FieldsInString fields;
    private Geometry geometry;
    private Notation notation;
    private boolean annuler;

    public ConcertInString() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FieldsInString getFields() {
        return fields;
    }

    public void setFields(FieldsInString fields) {
        this.fields = fields;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
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
}
