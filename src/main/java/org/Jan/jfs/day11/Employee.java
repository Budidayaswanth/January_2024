package org.Jan.jfs.day11;

public class Employee {
    private int empno;
    private String ename;
    private String location;
    private double salary;

    public Employee(int empno,String ename,double salary,String location){
        this.empno =empno;
        this.ename=ename;
        this.salary=salary;
        this.location=location;
    }

    public int getEmpno() {
        return empno;
    }
    public String getEname(){
        return ename;
    }
    public String getLocation(){
        return location;
    }
    public double getSalary(){
        return salary;
    }
    public void setEmpno(int empno){
        this.empno=empno;
    }
    public void setEname(String ename){
        this.ename=ename;
    }
    public void setLocation(String location){
        this.location=location;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }

}
