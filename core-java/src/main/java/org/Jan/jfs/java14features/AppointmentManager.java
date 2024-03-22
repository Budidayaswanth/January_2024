package org.Jan.jfs.java14features;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AppointmentManager {
    public static void main(String[] args) {
        Appointment obj =Appointment.builder()
                .id(IdGenerator.generateId())
                .doctor("Dr.Krishna")
                .patient("lelaKrishna")
                .date(LocalDate.now())
                .startTime(LocalDateTime.now())
                .endTime(LocalDateTime.now().plusMinutes(23))
                .status(Status.CONFIRM)
                .location("Bangalore")
                .build();
        System.out.println(obj);
    }
}
