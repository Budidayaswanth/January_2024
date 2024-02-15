package org.Jan.jfs.day2;

import java.util.Scanner;

public class EmiCalculator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the the Principal Loan Amount :");
        double p=sc.nextDouble();
        System.out.println("Enter the Rate of Interest : ");
        double ri =sc.nextDouble();
        System.out.println("Enter the Duration of in months :");
        double n=sc.nextDouble();

        double r =ri/12/100;
        double emi =p*r*(Math.pow(1+r,n)/(Math.pow(1+r,n)-1));

       double totalAmount =emi*n;
        double totalInterest =totalAmount-p;
        System.out.println("Principal Amount     :"+p);
        System.out.println("Rate of interest     :"+ri+"%");
        System.out.println("Duration in (Months) :"+n);
        System.out.println("----------------------------------");
        System.out.println("Emi amount     :"+Math.round(emi));
        System.out.println("Total Interest :"+Math.round(totalInterest));
        System.out.println("Total Amount   :"+Math.round(totalAmount));
    }
}
