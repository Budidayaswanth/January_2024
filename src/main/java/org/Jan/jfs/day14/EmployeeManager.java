package org.Jan.jfs.day14;

import java.util.Scanner;

public class EmployeeManager {
    public static void main(String[] args) {
        EmployeeService ems =new EmployeeService();
        Scanner sc =new Scanner(System.in);
        while (true){
            System.out.println("----------Menu---------");
            System.out.println("1. Add Employee ");
            System.out.println("2. Show Employee ");
            System.out.println("3. Update Employee Salary ");
            System.out.println("4. Remove Employee ");
            System.out.println("5. show All Employee ");
            System.out.println("6. Show Max Paid Employee ");
            System.out.println("7. show Salary stats");
            System.out.println("8. Exits");
            System.out.println("Enter your choice : ");
            int ch =sc.nextInt();
            switch (ch){
                case 1:
                    System.out.println("Enter the empno :");
                    int empno =sc.nextInt();
                    System.out.println("Enter the ename :");
                    String ename =sc.next();
                    System.out.println("Enter the Salary :");
                    double salary =sc.nextDouble();
                    Employee emp =new Employee(empno,ename,salary);
                    ems.addEmployee(emp);
                    break;
                case 2:
                    System.out.println("Enter the empno : ");
                    int empno1 =sc.nextInt();
                    ems.showAAllEmployee();
                    break;
                case 3:
                    System.out.println("Enter the empno :");
                    int empno2 =sc.nextInt();
                    System.out.println("Enter the salary :");
                    double salary1 =sc.nextDouble();
                    ems.incrementSalary(empno2,salary1);
                    break;
                case 4:
                    System.out.println("Enter the empno :");
                    int empno3 =sc.nextInt();
                    ems.removeEmployee(empno3);
                    break;
                case 5:
                    ems.showAAllEmployee();
                    break;
                case 6:
                    ems.showMaxPaidEmployee();
                    break;
                case 7:
                    ems.showSalaryStats();
                    break;
                case 8:
                    System.out.println("Thanks for using these Application");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice ");
            }
        }
    }
}
