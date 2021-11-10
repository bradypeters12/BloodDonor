package com.keyin.manager;

import com.keyin.domain.Database;
import com.keyin.domain.appointment.AppointmentSlot;
import com.keyin.domain.appointment.BloodDonationAppointment;
import com.keyin.domain.donor.BloodDonor;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class BloodDonationAppointmentManager {
    private Database database;

    public BloodDonationAppointmentManager(Database database) {
        this.database = database;
    }

    public BloodDonationAppointment bookAppointment(int bloodDonorId) throws InvalidDonationSchedulingException {
        BloodDonationAppointment bloodDonationAppointment = new BloodDonationAppointment();
        bloodDonationAppointment.setDonorID(bloodDonorId);

        BloodDonor bloodDonor = database.getDonor(bloodDonorId);

        LocalDate today = LocalDate.now();
        LocalDate tooYoungDate = today.minus(18, ChronoUnit.YEARS);
        LocalDate tooOldDate = today.minus(80, ChronoUnit.YEARS);
        LocalDate tooSoonDate = today.minus(56, ChronoUnit.DAYS);
        LocalDate AYearAgoDate = today.minus(1, ChronoUnit.YEARS);

        if (bloodDonor.getDateOfBirth().isAfter(tooYoungDate)) {
            throw new InvalidDonationSchedulingException("Donor Too Young");
        }
        if (bloodDonor.getDateOfBirth().isBefore(tooOldDate)) {
            throw new InvalidDonationSchedulingException("Donor Too Old");
        }
        if (bloodDonor.getLastDonationDate() == null) {
            bloodDonationAppointment.setFirstTimeDonor(true);
        }

        List<AppointmentSlot> appointmentSlotList = database.getAppointmentSlots();

        for (AppointmentSlot appointmentSlot: appointmentSlotList) {
            if (appointmentSlot.getBloodType().equalsIgnoreCase(bloodDonor.getBloodType())) {
                bloodDonationAppointment.setBloodType(bloodDonor.getBloodType());
            } else {
                throw new InvalidDonationSchedulingException("Invalid Blood Type");
            }
            if (appointmentSlot.getAppointmentDate().isBefore(tooSoonDate)) {
                bloodDonationAppointment.setAppointmentDate(appointmentSlot.getAppointmentDate());
                bloodDonationAppointment.setAppointmentTime(appointmentSlot.getStartTime());
                bloodDonationAppointment.setDuration(15);
            } else {
                throw new InvalidDonationSchedulingException("Too Soon, Within 56 Days");
            }
            if (appointmentSlot.getAppointmentDate().isAfter(today)) {

            } else {
                throw new InvalidDonationSchedulingException("Appointment Already Booked");
            }
            if (appointmentSlot.getAppointmentDate().isBefore(AYearAgoDate)) {

            } else {
                throw new InvalidDonationSchedulingException("Appointment More Than A Year Ago");
            }

        }

        return bloodDonationAppointment;
    }
}