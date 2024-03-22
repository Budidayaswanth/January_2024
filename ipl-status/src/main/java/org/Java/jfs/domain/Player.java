package org.Java.jfs.domain;

import lombok.Data;

@Data
public class Player {
    private  long id;
    private String name;
    private String role;
    private String teamName;
    private double amount;
    private int count;
}
