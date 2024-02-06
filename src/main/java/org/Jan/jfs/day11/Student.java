package org.Jan.jfs.day11;

import org.Jan.jfs.day10.StingObjectCompare;

public class Student {
    private int rollno;
    private String name;
    private String email;
    private TShirtSize size;

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", size=" + size +
                '}';
    }

    public Student(int rollno, String name, String email, TShirtSize size){
        this.rollno=rollno;
        this.name=name;
        this.email=email;
        this.size=size;
    }

}
