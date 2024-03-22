package org.Jan.jfs.stringsproblems;

import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name ");
        String Name = sc.nextLine();
        boolean check = true;
        System.out.println(Name.length());
        System.out.println(Name.toLowerCase());
        System.out.println(Name.toUpperCase());

        for (int i = 0; i < Name.length() / 2; i++) {
            if (Name.charAt(i) != Name.charAt(Name.length() - i - 1)) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("Given String Is Palindrome");
        } else {
            System.out.println("Given String Is Not Palindrome");

        }


    }
}
