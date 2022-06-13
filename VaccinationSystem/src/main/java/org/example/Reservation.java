package org.example;

public class Reservation {
    private Insured insured;
    private Timeslot timeslot;

    //constructors
    public Reservation() {
        this.insured = new Insured();
        this.timeslot = new Timeslot();
    }

    public Reservation(Insured insured, Timeslot timeslot) {
        this.insured = insured;
        this.timeslot = timeslot;
    }

    public Insured getInsured() {
        return insured;
    }

    public void setInsured(Insured insured) {
        this.insured = insured;
    }

    public Timeslot getTimeslot() {
        return timeslot;
    }

    public void setTimeslot(Timeslot timeslot) {
        this.timeslot = timeslot;
    }

    //toString method
    @Override
    public String toString() {
        return "Reservation{" + "insured=" + insured + ", timeslot=" + timeslot + '}';
    }

}