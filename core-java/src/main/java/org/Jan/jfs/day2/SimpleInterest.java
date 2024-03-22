package org.Jan.jfs.day2;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of p :");
        int p=sc.nextInt();
        System.out.println("Ente the Value of T :");
        double t=sc.nextDouble();
        System.out.println("Enter the Value of R :");
        double r=sc.nextDouble();

        double si=(p*t*t)/100;

        double totalAmount =p+si;
        System.out.println("For Amount : "+p+" Duration"+t+" (Year) of rate of interest :"+r+" %");
        System.out.println("Interest of Amount :"+si);
        System.out.println("Total Amount :"+totalAmount);

    }
}
