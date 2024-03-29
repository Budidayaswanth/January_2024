package org.Jan.jfs.day10;

public class EmployeesDetails {
    public static void main(String[] args) {
        String data = "EMP1001,Krish,2500000,Hyderabad-EMP1002,Manoj,3500000,Bangalore-EMP1003,Charan,4500000,Chennai-EMP1004,Rajesh,5500000,Hyderabad-EMP1005,Ramesh,6500000,Bangalore";
        String city = "Bangalore";
        String[][] arr = new String[data.split("-").length][4];
        int index = 0;
        for (String ele : data.split("-")) {
            arr[index++] = ele.split(",");
        }
        showEmployeeNames(arr, city);
        showEmployeesDetails(arr);
        showEmployeeNameIfStartWith(arr, "ra");
    }

    public static void showEmployeeNames(String[][] arr, String city) {
        for (String[] emp : arr) {
            if (emp[3].equalsIgnoreCase(city)) {
                System.out.println(emp[1]);
            }
        }
    }

    public static void showEmployeesDetails(String[][] arr) {
        for (String[] emp : arr) {
            System.out.println("Id : " + emp[0]);
            System.out.println("Name : " + emp[1]);
            System.out.println("Salary : " + emp[2]);
            System.out.println("City : " + emp[3]);
            System.out.println("-".repeat(100));
        }
    }

    public static void showEmployeeNameIfStartWith(String[][] arr, String start) {//String start
        for (String[] emp : arr) {
            if (emp[1].toLowerCase().contains(start.toLowerCase())) {  //  .startsWith("ra")
                System.out.println(emp[1]);
            }
        }
    }
}
