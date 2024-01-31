package org.Jan.jfs.day5;

import java.util.Scanner;

public class FactorOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N value is ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i );
            }
        }
    }
}
