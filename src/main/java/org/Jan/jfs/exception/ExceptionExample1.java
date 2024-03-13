package org.Jan.jfs.exception;

import java.util.Scanner;

public class ExceptionExample1 {
    public static void main(String[] args) {
        System.out.println("Start the main method ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a=sc.nextInt();
        System.out.println("Enter the Second number :");
        int b =sc.nextInt();
        int res=Multi(a,b);
        System.out.println("Result :"+res);
        System.out.println("End the main Method ");
    }
    private  static int Multi(int a,int b){
        int res =0;
        try {
            if (a==0||b==0){
                throw new ArithmeticException("Your Multify by zeros !");
            }
           res=a*b;
        }catch (NumberFormatException e){
            System.out.println("Invalid input: Please provide valid integers.");
            e.printStackTrace();
        }
        return res;
    }
}
