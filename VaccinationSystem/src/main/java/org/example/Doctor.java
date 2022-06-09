package org.example;

import java.sql.Time;
import java.util.List;

public class Doctor {
    private String amka;
    private String name;
    private String surname;
    private List<Timeslot> timeslotList;

    //constructors
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

    //getters and setters
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

    //add timeslots to timeslotList
    public void addTimeslot(Timeslot t){
        timeslotList.add(t);
    }

    //prints vaccinations foreach doctor
    public String VaccinationPerDoctor(List<Vaccination> vaccinationList){
        String d="\n";
        d += ("Vaccinations for Doctor " + this.getName() + " " + this.getSurname() + ":");
        for(Vaccination v : vaccinationList)
        {
            if(v.getDoctor().equals(this))
            {
                d += ("\n" + v.getVaccinationDate() + " " + v.getInsured().getName() + " " + v.getInsured().getSurname());
            }
        }
        return d;
    }

    //toString method
    @Override
    public String toString() {
        return "Doctor{" +
                "amka='" + amka + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
