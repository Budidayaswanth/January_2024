package org.Jan.jfs.stringsproblems;

import java.util.Scanner;

public class DisplayIngAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the FirstName :");
        String FirstName = sc.nextLine();
        System.out.println("Enter the MiddleName :");
        String MiddleName = sc.nextLine();
        System.out.println("Enter the LastName :");
        String LastName = sc.nextLine();
        System.out.println(FirstName + "-" + MiddleName + "-" + LastName);


    }
}
