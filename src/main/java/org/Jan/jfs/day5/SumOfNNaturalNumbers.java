package org.Jan.jfs.day5;

import java.util.Scanner;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value is ");
        int n = sc.nextInt();
        int evenSum = sumOfFirstNEvenNumbers(n);
        System.out.println("Sum Of First N Even Numbers is : " + evenSum);
        int sum = sumOfFirstNNumbers(n);
        System.out.println("Sum of First N Number is : " + sum);
        int oddSum = sumOfFirstNOddNumbers(n);
        System.out.println("Sum of First N Odd Number is : " + oddSum);
    }

    public static int sumOfFirstNNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumOfFirstNEvenNumbers(int n) {
        int evenSum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            }
        }
        return evenSum;
    }

    public static int sumOfFirstNOddNumbers(int n) {
        int oddSum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                oddSum += i;
            }
        }
        return oddSum;
    }
}
