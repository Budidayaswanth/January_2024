package org.Java.di.invoice;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Builder
public class ServiceInfo {
    private long id;
    private String name;
    private double amount;
}
