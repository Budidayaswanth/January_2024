package org.Java.di.lifecycle;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class S3Connection {
    public String getConnection(){
        return "S3Connection Version 1.0";
    }
    @PostConstruct
    public void init(){
        System.out.println("S3Connection connected is created");
    }

    @PostConstruct
    public void initOnceAgain(){
        System.out.println("S3Connection is created once again");
    }

    @PreDestroy
    public void clear(){
        System.out.println("S3Connection is closed ");
    }
}
