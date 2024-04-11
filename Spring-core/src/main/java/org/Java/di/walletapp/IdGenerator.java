package org.Java.di.walletapp;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
@Component
public class IdGenerator {
    public String generateID(){
        int year = LocalDate.now().getYear();
        String str =(""+System.currentTimeMillis()).substring(4);
        return year +"-"+str.substring(0,2)+"-"+str.substring(3);
    }
}
