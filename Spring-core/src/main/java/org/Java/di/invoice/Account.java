package org.Java.di.invoice;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Data
public class Account {
    private long accountNumber;
    private String name;
    private String city;
}
