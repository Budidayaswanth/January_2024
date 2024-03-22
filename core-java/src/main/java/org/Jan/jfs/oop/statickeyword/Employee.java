package org.Jan.jfs.oop.statickeyword;

public class Employee {
    private int empno;
    private String ename;
    private String salary;
    private String email;
    private String mobile;
    private static int count = 0;

    public Employee(int empno, String ename, String salary) {
        this(empno, ename, salary, "N/A", "N/A");
    }

    public Employee(int empno, String ename, String salary, String email, String mobile) {
        this.empno = empno;
        this.ename = ename;
        this.salary = salary;
        this.email = email;
        this.mobile = mobile;
    }

    {
        System.out.println("Message IIB ");
        count++;
    }
    static {
        System.out.println("Message from block ");
    }
    public static void showCount(){
        System.out.println("Employee count "+count);
    }
    public static void main(String[] args){
     Employee.showCount();
     Employee obj =new Employee(121,"Yash","2432.5");
     Employee obj1=new Employee(122,"King","3456.89","king@email.com","78654321");
     Employee.showCount();
    }
}
