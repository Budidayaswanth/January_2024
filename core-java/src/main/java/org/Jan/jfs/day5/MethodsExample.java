package org.Jan.jfs.day5;

import java.time.LocalDateTime;

public class MethodsExample {
    public static void main(String[] args) {
showSystemInformation();
ShowGreetings("Yash raj");
int res = ShowAddition(2,4);
        System.out.println("Sum of a and b is "+res);
        System.out.println("Today is : "+getSystemDateTime());
    }
    //Method with No argument And no return type:
    public static void showSystemInformation(){
        System.out.println("Os Name "+System.getProperty("os.name"));
        System.out.println("Version "+System.getProperty("os.version"));
    }
    // Method With argument and no Return type
    public static void ShowGreetings(String Name){
        System.out.println("Hello "+Name+" Good Morning Have a Nice Day. ");
    }
    //Method with argument and return type
    public static int ShowAddition(int a, int b){
        return a +b;
    }

    public static LocalDateTime getSystemDateTime(){
        return LocalDateTime.now();
    }
}
