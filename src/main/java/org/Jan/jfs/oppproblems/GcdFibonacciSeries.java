package org.Jan.jfs.oppproblems;

public class GcdFibonacciSeries {
    public static void main(String[] args) {
        int Num = 10;
        int Num1 = 20;
        int gcd = calGcd(Num, Num1);
        System.out.println("GCD of " + Num + "and " + Num1 + "is " + gcd);
    }

    public static int calGcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return calGcd(b, a % b);
        }
    }

    public static int Fibonacci(int n) {
        if (n == 0) {
            return 1;
        } else {
            return Fibonacci(n - 1) + (n - 2);
        }
    }

    public static class Fibonacci {
        public static void main(String[] args) {
            int num = 10;
            for (int i = 0; i < num; i++) {
                System.out.println("FibonacciSeries of num :" + i + " ");
            }
        }
    }

    public static class SumOfNaturalNumbers {
        public static void main(String[] args) {
            int n = 5;
            int sum = calSumNumbers(n);
            System.out.println("Sum of First " + n + " Natural Numbers are :" + sum);
        }

        public static int calSumNumbers(int n) {
            if (n == 0) {
                return 1;
            } else {
                return n + calSumNumbers(n - 1);
            }
        }


    }
}
