package org.example;

import java.time.LocalDate;

public class Vaccination {
    private Insured insured;
    private Doctor doctor;
    private LocalDate vaccinationDate;
    private LocalDate expirationDate;

    //constructors
    public Vaccination(){
        this.insured = new Insured();
        this.doctor = new Doctor();
        this.vaccinationDate = null;
        this.expirationDate = null;
    }
    public Vaccination(Insured insured, Doctor doctor, LocalDate vaccinationDate, LocalDate expirationDate) {
        this.insured = insured;
        this.doctor = doctor;
        this.vaccinationDate = vaccinationDate;
        this.expirationDate = expirationDate;
    }

    //getters and setters
    public Insured getInsured() {
        return insured;
    }

    public void setInsured(Insured insured) {
        this.insured = insured;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public LocalDate getVaccinationDate() {
        return vaccinationDate;
    }

    public void setVaccinationDate(LocalDate vaccinationDate) {
        this.vaccinationDate = vaccinationDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    //duration for vaccination
    public static LocalDate VaccDuration(LocalDate ld){
        return LocalDate.of(ld.getYear() + 2, ld.getMonth(), ld.getDayOfMonth());
    }

    //toString method
    @Override
    public String toString() {
        return "Vaccination{" +
                "insured=" + insured +
                ", doctor=" + doctor +
                ", vaccinationDate=" + vaccinationDate +
                ", expirationDate=" + expirationDate +
                '}';
    }
}
