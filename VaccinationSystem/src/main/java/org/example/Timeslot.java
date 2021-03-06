package org.example;

import java.time.LocalDate;

public class Timeslot {

    private int day;
    private int month;
    private int year;
    private int hour;
    private int minutes;
    private int startMinute;
    private int endMinute;
    private Doctor doctor;
    private boolean available;

    //constructors
    public Timeslot(int day, int month, int year, int hour, int minutes, int startMinute, int endMinute, Doctor doctor) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.minutes = minutes;
        this.startMinute = startMinute;
        this.endMinute = endMinute;
        this.doctor = doctor;
        this.available = true;
    }

    public Timeslot(){
        this.day = 0;
        this.month = 0;
        this.year = 0;
        this.hour = 0;
        this.minutes = 0;
        this.startMinute = 0;
        this.endMinute = 0;
        this.doctor = null;
        this.available = true;
    }

    //getters and setters
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getStartMinute() {
        return startMinute;
    }

    public void setStartMinute(int startMinute) {
        this.startMinute = startMinute;
    }

    public int getEndMinute() {
        return endMinute;
    }

    public void setEndMinute(int endMinute) {
        this.endMinute = endMinute;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }


    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    //returns date
    public LocalDate getDate(){
        return LocalDate.of(year,month,day);
    }


    @Override
    public String toString() {
        return "(" + day + "/" + month + "/" + year + "), " +
                hour + ":" + minutes +
                "(" + "startMinute: " + hour + ":" + startMinute + ", endMinute: " + hour + ":" + endMinute + ")" + ", " +
                "Doctor: " + doctor.getName()  + " " + doctor.getSurname();

    }
}
