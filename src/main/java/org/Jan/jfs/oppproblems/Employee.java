package org.Jan.jfs.oppproblems;

public class Employee {
    private int id;
    private String Name;
    private double salary;

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("miani");
        employee.setSalary(25000);
        System.out.println(employee.tostring());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String tostring() {
        return " Employee ID =" + id + "and Name =" + Name + " Salary = " + salary;
    }
}
