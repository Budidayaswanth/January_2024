package org.Jan.jfs.day12;

import java.time.LocalDateTime;

public class MyMathOperators {
    public static int biggest(int a, int b, int c) {
        return a > b && a > c ? a : Math.max(b, c);
    }

    public int gcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -=b;
            }
            else {
                b -=a;
            }
        }
        return a;
    }

    public void showGreeting(String name){
        if(name == null || name.isEmpty()){
            name="Guest";
        }
        System.out.println("Hello "+name+" Good Morning !");
    }

    public static String getOsName(){
        return System.getProperty("os.name");
    }

    public static void showDateAndTime(){
        System.out.println("Current Date And Time is :"+ LocalDateTime.now());
    }
}
