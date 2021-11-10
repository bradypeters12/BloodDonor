package com.keyin.domain.appointment;

import java.time.LocalDate;
import java.time.LocalTime;

public class BloodDonationAppointment {
    private int appointmentId;
    private LocalDate appointmentDate;
    private LocalTime appointmentTime;
    private int duration;
    private String location;
    private String bloodType;
    private boolean firstTimeDonor;
    private int donorID;
//Setters for Appointment
    public void setAppointmentId(int appointmentId) { this.appointmentId = appointmentId; }
    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }
    public void setAppointmentTime(LocalTime appointmentTime) {
        this.appointmentTime = appointmentTime;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setBloodType(String bloodType)
    { this.bloodType = bloodType;
    }
    public void setFirstTimeDonor(boolean firstTimeDonor) {
        this.firstTimeDonor = firstTimeDonor;
    }
    public void setDonorID(int donorID) {
        this.donorID = donorID;
    }
    public void setAppointmentInfo(int appointmentId, LocalDate appointmentDate, LocalTime appointmentTime,int duration, String location,
                                   String bloodType, boolean firstTimeDonor, int donorID) {
        this.appointmentId = appointmentId;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.duration = duration;
        this.location = location;
        this.bloodType = bloodType;
        this.firstTimeDonor = firstTimeDonor;
        this.donorID = donorID;
    }
//Getters for Appointment
    public int getAppointmentId() {
        return appointmentId;
    }
    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }
    public LocalTime getAppointmentTime() {
        return appointmentTime;
    }
    public int getDuration() {
        return duration;
    }
    public String getLocation() {
        return location;
    }
    public String getBloodType() {
        return bloodType;
    }
    public boolean isFirstTimeDonor() {
        return firstTimeDonor;
    }
    public int getDonorID() {
        return donorID;
    }
}