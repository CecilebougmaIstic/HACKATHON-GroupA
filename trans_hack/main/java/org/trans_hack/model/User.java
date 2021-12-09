package org.trans_hack.model;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

public abstract class User implements Serializable {

    /**
     * declaration of parameters
     */
    private  long id;
    protected String lastName;
    protected String firstName;
    protected String email;
    protected String passWords;
    protected String typeUser;
        /*Constructor*/
    public User() {}

    public User(long id, String lastName, String firstName,
                String email, String passWords, String typeUser) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.passWords = passWords;
        this.typeUser = typeUser;
    }
            /*Getters & Setters*/
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassWords() {
        return passWords;
    }

    public void setPassWords(String passWords) {
        this.passWords = passWords;
    }

    public String getTypeUser() {
        return typeUser;
    }

    public void setTypeUser(String typeUser) {
        this.typeUser = typeUser;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", passWords='" + passWords + '\'' +
                ", typeUser='" + typeUser + '\'' +
                '}';
    }
}