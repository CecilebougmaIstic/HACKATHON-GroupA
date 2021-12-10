package org.trans_hack.model;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

public class Notification implements Serializable {

    /**
     * Declaration of Parameters
     */
    private  long id;
    protected String message;

   /*Constructors*/
    public Notification() {}

    public Notification(long id, String message) {
        this.id = id;
        this.message = message;
    }
    /*Getter & Setter*/

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    /*Metod toString*/

    @Override
    public String toString() {
        return "Notification{" +
                "id=" + id +
                ", message='" + message + '\'' +
                '}';
    }
}