package org.example;

import java.util.List;

public class VaccinationCenter {
    private String code;
    private String address;
    private List<Timeslot> timeslotList;

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

    @Override
    public String toString() {
        return "VaccinationCenter{" +
                "code='" + code + '\'' +
                ", address='" + address + '\'' +
                ", timeslotList=" + timeslotList +
                '}';
    }
}
