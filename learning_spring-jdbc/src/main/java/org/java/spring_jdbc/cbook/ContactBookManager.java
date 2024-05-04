package org.java.spring_jdbc.cbook;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "org.java.spring_jdbc.cbook")
public class ContactBookManager {
    public static void main(String[] args) {
        ApplicationContext context =new AnnotationConfigApplicationContext(ContactBookManager.class);
        ContactService contactService =context.getBean(ContactServiceImpl.class);
        while (true){
            System.out.println("Add the Contact");
            System.out.println("Update the contact");
            System.out.println("");
        }
    }
}
