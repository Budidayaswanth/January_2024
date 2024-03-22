package org.Jan.jfs.oppproblems;

public class Employees {
    private int id;
    private String Name;
    private float salary;


    public Employees(int id, String Name, float sal) {
        this.id = id;
        this.Name = Name;
        this.salary = sal;
        Display();
    }

    public Employees(int id, String Name) {
        this.id = id;
        this.Name = Name;
        this.salary = 20000.0f;
        Display();
    }

    public static void main(String[] args) {
        System.out.println("two Parameters");
        Employees employees = new Employees(2, "Hemanth");
        Employees employees1 = new Employees(4, "king", 23456);

    }

    public void Display() {
        System.out.println("Employee id :" + id);
        System.out.println("Employee Name :" + Name);
        System.out.println("Employee salary :" + salary);
        System.out.println("--------------------------");
    }

}
