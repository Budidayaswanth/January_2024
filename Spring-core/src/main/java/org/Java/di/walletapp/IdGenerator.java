package org.Java.di.walletapp;

import org.springframework.stereotype.Component;
@Component
public class IdGenerator {
    public String generateID(){

     return (""+System.currentTimeMillis()).substring(0,5);

    }
}
