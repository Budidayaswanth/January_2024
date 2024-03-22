package org.Jan.jfs.java14features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AppointmentService {
    List<Appointment> appointments =new ArrayList<>();

    public AppointmentService(){
        Appointment appointment1 =Appointment.builder()
                .id(IdGenerator.generateId())
                .location("Bangalore")
                .doctor("Dr.krishna")
                .patient("mukesh")
                .date(LocalDate.now())
                .startTime(LocalDateTime.now())
                .endTime(LocalDateTime.now().plusHours(1))
                .status(Status.CONFIRM)
                .build();
        appointments.add(appointment1);

        Appointment appointment2 =Appointment.builder()
                .id(IdGenerator.generateId())
                .location("Hyderabad")
                .doctor("Dr.Murali")
                .patient("JayaKrishna")
                .date(LocalDate.now())
                .startTime(LocalDateTime.now())
                .endTime(LocalDateTime.now().plusMinutes(35))
                .status(Status.CONFIRM)
                .build();
        appointments.add(appointment2);

        Appointment appointment3 =Appointment.builder()
                .id(IdGenerator.generateId())
                .location("Nellore")
                .doctor("Dr.Arjun")
                .patient("K.Arun")
                .date(LocalDate.now())
                .startTime(LocalDateTime.now())
                .endTime(LocalDateTime.now().plusDays(1))
                .status(Status.COMPLETED)
                .build();
        appointments.add(appointment3);
    }

    public List<AppointmentDto> getAppointmentsof(String doctorName){
        List<AppointmentDto> list =new ArrayList<>();
        for (Appointment appointment:appointments){
            if(appointment.getDoctor().equals(doctorName)){
                list.add(new AppointmentDto(appointment.getPatient(),
                        appointment.getDate(),
                        appointment.getStartTime(),
                        appointment.getEndTime()));
            }
        }
        return list;
    }
}
