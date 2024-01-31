package org.Jan.jfs.day5;

import java.util.Scanner;

public class MultiplicationOfTables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N value is ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + n * i);
        }
        System.out.println("-------------------------");
        for (int i = 10; i >= 1; i--) {
            System.out.println(n + " X " + " = " + n * i);
        }
    }
}
