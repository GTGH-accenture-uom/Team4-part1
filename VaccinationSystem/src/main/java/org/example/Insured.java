package org.example;

import java.util.Date;

public class Insured {

    private String afm;
    private String amka;
    private String name;
    private Date date;
    private String surname;
    private String email;

    public Insured(String afm, String amka, String name, Date date, String surname, String email) {
        this.afm = afm;
        this.amka = amka;
        this.name = name;
        this.date = date;
        this.surname = surname;
        this.email = email;
    }

    public Insured() {
        this.afm = null;
        this.amka = null;
        this.name = null;
        this.date = null;
        this.surname = null;
        this.email = null;
    }

    public String getAfm() {
        return afm;
    }

    public void setAfm(String afm) {
        this.afm = afm;
    }

    public String getAmka() {
        return amka;
    }

    public void setAmka(String amka) {
        this.amka = amka;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Insured{" +
                "afm='" + afm + '\'' +
                ", amka:'" + amka + '\'' +
                ", name:'" + name + '\'' +
                ", date:" + date.getDate() + "/" + date.getMonth() + "/" + date.getYear() +
                ", surname:'" + surname + '\'' +
                ", email:'" + email + '\'' +
                '}' + "\n";
    }
}
