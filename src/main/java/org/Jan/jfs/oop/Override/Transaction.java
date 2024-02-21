package org.Jan.jfs.oop.Override;

import lombok.*;

import java.time.LocalDateTime;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Transaction {
    private long transId;
    private String fromMobile;
    private String toMobile;
    private double amount;
    private TnxStatus status;
    private LocalDateTime dateTime;


}
