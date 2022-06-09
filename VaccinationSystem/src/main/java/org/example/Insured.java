package org.example;

import java.time.LocalDate;
import java.util.Date;

public class Insured {

    private String afm;
    private String amka;
    private String name;
    private LocalDate date;
    private String surname;
    private String email;
    private Timeslot timeslot;

    //constructors
    public Insured(String afm, String amka, String name, LocalDate date, String surname, String email) {
        this.afm = afm;
        this.amka = amka;
        this.name = name;
        this.date = date;
        this.surname = surname;
        this.email = email;
        this.timeslot = null;
    }

    public Insured() {
        this.afm = null;
        this.amka = null;
        this.name = null;
        this.date = null;
        this.surname = null;
        this.email = null;
        this.timeslot = null;
    }

    //getters and setters
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
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

    public Timeslot getTimeslot() {
        return timeslot;
    }
    public void setTimeslot(Reservation r) {
        this.timeslot = r.getTimeslot();
    }

    //toString method
    @Override
    public String toString() {
        return "Insured{" +
                "afm='" + afm + '\'' +
                ", amka:'" + amka + '\'' +
                ", name:'" + name + '\'' +
                ", surname:'" + surname + '\'' +
                ", date:" + date.getDayOfMonth() + "/" + date.getMonth() + "/" + date.getYear() +
                ", email:'" + email + '\'' +
                '}' + "\n";
    }
}
