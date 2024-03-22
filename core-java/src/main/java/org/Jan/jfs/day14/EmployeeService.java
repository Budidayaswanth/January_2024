package org.Jan.jfs.day14;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee emp) {
        if (isExists(emp.getEmpno())) {
            System.out.println("Employee with empno : " + emp.getEmpno() + " already exists");
        } else {
            employees.add(emp);
            System.out.println("Employee wirth empno : " + emp.getEmpno() + " added Successfully");
        }
    }

    public void removeEmployee(int empno) {
        if (employees.isEmpty()) {
            System.out.println("No employee found ");
            return;
        }
        int index = indexOf(empno);
        if (index != -1) {
            employees.remove(index);
            System.out.println("Employee with empno : " + empno + " removed successfully");
        } else {
            System.out.println("Employee with empno : " + empno + " not exits ");
        }

    }

    public void incrementSalary(int empno, double UpdatePercentage) {
        if (employees.isEmpty()) {
            System.out.println(" no employee found ");
            return;
        }
        int index = indexOf(empno);
        if (index != -1) {
            Employee emp = employees.get(index);
            double updatedSalary = emp.getSalary() + (emp.getSalary() * UpdatePercentage / 100);
            emp.setSalary(updatedSalary);
        } else {
            System.out.println("Employee with empno :" + empno + " not exits ");
        }

    }

    public void showAAllEmployee() {
        if (employees.isEmpty()) {
            System.out.println(" no employee found ");
            return;
        }
        for (Employee emp : employees) {
            emp.showInfo();
            System.out.println("-".repeat(60));
        }
    }

    public void showMaxPaidEmployee() {
        if (employees.isEmpty()) {
            System.out.println(" no employee found ");
            return;
        }
        List<Employee> maxPaidEmployee = new ArrayList<>();
        double maxSalary = maxSalary();
        for (Employee emp : employees) {
            if (emp.getSalary() == maxSalary) {
                maxPaidEmployee.add(emp);
            }
        }
        for (Employee emp : maxPaidEmployee) {
            emp.showInfo();
            System.out.println("----------------------");
        }
    }

    public void showSalaryStats() {
        if (employees.isEmpty()) {
            System.out.println(" no Employee found");
            return;
        }
        double totalSalary = totalSalary();
        double minSalary = minSalary();
        double maxSalary = maxSalary();
        double avgSalary = totalSalary / employees.size();
        System.out.println("Total Salary : " + totalSalary);
        System.out.println("Minimum Salary : " + minSalary);
        System.out.println("Maximum Salary : " + maxSalary);
        System.out.println("Average Salary : " + avgSalary);
    }

    private boolean isExists(int empno) {
        for (Employee emp : employees) {
            if (emp.getEmpno() == empno) {
                return true;
            }
        }
        return false;
    }

    private int indexOf(int empno) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getEmpno() == empno) {
                return i;
            }
        }
        return -1;
    }

    private double maxSalary() {
        double max = employees.getFirst().getSalary();
        for (Employee emp : employees) {
            if (emp.getSalary() > max) {
                max = emp.getSalary();
            }
        }
        return max;
    }

    private double minSalary() {
        double min = employees.getFirst().getSalary();
        for (Employee emp : employees) {
            if (emp.getSalary() < min) {
                min = emp.getSalary();
            }
        }
        return min;
    }

    private double totalSalary() {
        double total = 0;
        for (Employee emp : employees) {
            total += emp.getSalary();
        }
        return total;
    }
}
