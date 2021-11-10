package com.keyin.domain.donor;

import java.time.LocalDate;

public class BloodDonor {

    private int id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String bloodType;
    private LocalDate nextAppointmentDate;
    private LocalDate lastDonationDate;

    public BloodDonor(int id, String firstName, String lastName, LocalDate dateOfBirth, String bloodType,
                      LocalDate nextAppointmentDate, LocalDate lastDonationDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.bloodType = bloodType;
        this.nextAppointmentDate = nextAppointmentDate;
        this.lastDonationDate = lastDonationDate;
    }
//Setters for blood donor
    public void setId(int id) {
        this.id = id;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }
    public void setNextAppointmentDate(LocalDate nextAppointmentDate) {
        this.nextAppointmentDate = nextAppointmentDate;
    }
    public void setLastDonationDate(LocalDate lastDonationDate) {
        this.lastDonationDate = lastDonationDate;
    }
//Getters for blood donor
    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public String getBloodType() {
        return bloodType;
    }
    public LocalDate getNextAppointmentDate() {
        return nextAppointmentDate;
    }
    public LocalDate getLastDonationDate() {
        return lastDonationDate;
    }

}