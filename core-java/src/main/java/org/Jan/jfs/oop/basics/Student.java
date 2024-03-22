package org.Jan.jfs.oop.basics;

public class Student {
    private String name;
    private static String collegeName ="Narayana";

    public void show(){
        String info ="Name : "+name+"College :"+collegeName;
        System.out.println(info);
    }
}
