package org.Jan.jfs.java14features;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record AppointmentDto(String name, LocalDate date, LocalDateTime startTime,LocalDateTime endTime){

}
