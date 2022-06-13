package org.example;

import java.time.LocalDate;
import java.util.List;

public class VaccinationCenter {
    private String code;
    private String address;
    private List<Timeslot> timeslotList;

    //constructors
    public VaccinationCenter(){
        this.code = null;
        this.address = null;
        this.timeslotList = null;
    }

    public VaccinationCenter(String code, String address, List<Timeslot> timeslotList) {
        this.code = code;
        this.address = address;
        this.timeslotList = timeslotList;
    }

    //getters and setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Timeslot> getTimeslotList() {
        return timeslotList;
    }

    public void setTimeslotList(List<Timeslot> timeslotList) {
        this.timeslotList = timeslotList;
    }


    public String CheckReservations(){
        String r = "\n";
        r += ("Reservations for Vaccination Center " + this.code + ":");
        for(Timeslot t : timeslotList){
            if (LocalDate.of(t.getYear(),t.getMonth(),t.getDay()).isAfter(LocalDate.now()) && !t.isAvailable())
            {
                r += ("\n" + t.toString());
            }
        }
        return r;
    }

    //prints the availabe appointmants foreach vaccination center
    public String CheckAvailableAppointments(){
        String s = "\n";
        s += ("Available Appointments for Vaccination Center " + this.code + ":");
        for(Timeslot t : timeslotList){
            if (LocalDate.of(t.getYear(),t.getMonth(),t.getDay()).isAfter(LocalDate.now()) && t.isAvailable())
            {
                s += ("\n" + t.toString());
            }
        }
        return s;
    }

    //toString method
    @Override
    public String toString() {
        return "VaccinationCenter{" +
                "code='" + code + '\'' +
                ", address='" + address + '\'' +
                ", timeslotList=" + timeslotList +
                '}';
    }
}
