package org.Jan.jfs.oppproblems;

public class Student {
    private static int count = 0;
    private int id;
    private String Name;
    private String Address;

    public Student(int id, String Name) {
        this.id = id;
        this.Name = Name;
        count++;
    }

    public static void main(String[] args) {
        Student student1 = new Student(1, "Krishna");
        student1.Address = "Krishna Reddy palem ";

        Student student2 = new Student(2, "Mohan");
        student2.Address = "Nellore city";

        Student student3 = new Student(3, "Ganesh");
        student3.Address = "Kakutur Nellore ";

        Student student4 = new Student(4, "vinod");
        student4.Address = "Venkatachalam Nellore ";

        System.out.println("Details of Student1 :");
        student1.display();

        System.out.println("Details of Student2 :");
        student2.display();

        System.out.println("Details of Student3 :");
        student3.display();

        System.out.println("Details of Student4 ");
        student4.display();

        int NumbersOfObjects = Student.getCount();
        System.out.println("Number of Students " + NumbersOfObjects);

    }

    public static int getCount() {
        return count;
    }

    public void display() {
        System.out.println("Student Id :" + id);
        System.out.println("Student Name :" + Name);
        System.out.println("Student Address :" + Address);
        System.out.println("-----------------------------");
    }
}
