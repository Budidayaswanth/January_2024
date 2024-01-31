package org.Jan.jfs.oppproblems;

import java.util.Scanner;

public class PrimeOrNot {
    private static void Factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value for factorial  is");
        int n = sc.nextInt();
        System.out.println("Enter the z value for factorial is");
        int z = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            z *= i;
        }
        System.out.println("factorial number " + n + " is :" + z);
    }

    private static void Tables() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value for tables is");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i + "=" + n * i);
        }
    }

    private static void Prime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value for prime is");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(n + "is a Prime");
        } else {
            System.out.println(n + "is a not prime");
        }
    }

    public static void main(String[] args) {
        Factorial();
        Prime();
        Tables();
    }
}
