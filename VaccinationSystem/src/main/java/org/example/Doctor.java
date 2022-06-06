package org.example;

import java.util.List;

public class Doctor {
    private String amka;
    private String name;
    private String surname;
    private List<Timeslot> timeslotList;

    public Doctor(){
        this.amka = null;
        this.name = null;
        this.surname = null;
        this.timeslotList = null;
    }

    public Doctor(String amka, String name, String surname, List<Timeslot> timeslotList) {
        this.amka = amka;
        this.name = name;
        this.surname = surname;
        this.timeslotList = timeslotList;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Timeslot> getTimeslotList() {
        return timeslotList;
    }

    public void setTimeslotList(List<Timeslot> timeslotList) {
        this.timeslotList = timeslotList;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "amka='" + amka + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", timeslotList=" + timeslotList +
                '}';
    }
}
