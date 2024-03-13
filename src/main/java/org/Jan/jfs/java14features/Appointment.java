package org.Jan.jfs.java14features;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Data
@Builder
@ToString
public class Appointment {
    private String id;
    private String location;
    private String doctor;
    private String patient;
    private LocalDate date;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Status status;

}
