package org.Java.sc.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetingManager {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("/greethings.xml");
        GreetingService service =context.getBean("greeting",GreetingService.class);
        System.out.println(service.greet("Yaash"));
    }
}
