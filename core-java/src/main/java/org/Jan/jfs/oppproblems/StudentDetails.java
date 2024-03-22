package org.Jan.jfs.oppproblems;


public class StudentDetails {
    private static int count = 0;
    private int id;
    private String name;
    private String subject;

    public StudentDetails(int id, String name) {
        this.id = id;
        this.name = name;
        count++;
    }

    public static void main(String[] args) {
        StudentDetails student1 = new StudentDetails(1, "king");
        student1.subject = "Telugu";

        StudentDetails student2 = new StudentDetails(2, "manoj");
        student2.subject = "English";

        StudentDetails student3 = new StudentDetails(3, "Krishna");
        student3.subject = "Maths";

        System.out.println("Details Of the Student1 :");
        student1.Display();
        System.out.println("Details Of the Student2 :");
        student2.Display();
        System.out.println("Details Of the Student3 :");
        student3.Display();

        int numberOfStudent = StudentDetails.getCount();
        System.out.println("Number of Students " + numberOfStudent);

    }

    private static int getCount() {
        return count;
    }

    public void Display() {
        System.out.println("Student id :" + id);
        System.out.println("Student Name :" + name);
        System.out.println("Student Subject :" + subject);
        System.out.println("----------------------------");
    }
}
