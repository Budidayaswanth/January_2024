package org.Jan.jfs.day7;

public class ShowNoOfDaysInGivenMonthAndYear {


    public static void main(String[] args) {
        int month =2;
        int year =2024;
        System.out.println(dayIn(year,month));
    }
    public static int dayIn(int year,int month){
        return switch (month){
            case 1,3,5,7,8,10,12->31;
            case 4,6,9,11->30;
            case 2->{
                System.out.println("Checking for the leap year");
                yield isLeapYear(year) ? 29:28;
            }
            default -> 0;
        };
    }
    public static boolean isLeapYear(int year){
        return  (year % 400 == 0 || year % 4==0 && year % 100 !=0 );
    }
}
