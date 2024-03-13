package org.Jan.jfs.collections.sort;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Player {
    private String name;
    private String role;
    private String country;
    private String team;
    private double amount;
}
