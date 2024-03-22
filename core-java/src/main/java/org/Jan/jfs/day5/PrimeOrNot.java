package org.Jan.jfs.day5;

public class PrimeOrNot {
    public static void main(String[] args) {
        int lb = 1;
        int ub = 10;
        int count = countPrime(lb, ub);
        System.out.println("Count the Number from " + lb + " to " + ub + " is " + count);
        System.out.println("The prime Numbers range is " + lb + " to " + ub + " = ");
        showPrime(lb, ub);
        System.out.println(" nth First 10 Number prime are ");
        showNPrime(10);

    }

    public static int countPrime(int lb, int ub) {
        int count = 0;
        for (int i = lb; i <= ub; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public static void showPrime(int lb, int ub) {
        for (int i = lb; i <= ub; i++) {
            if (isPrime(i)) {
                System.out.print(i +" ");
            }
        }
    }

    public static void showNPrime(int n) {
        int count = 0;
        for (int i = 2; ; i++) {
            if (isPrime(i)) {
                System.out.print(i +" ");
                count++;
            }
            if (count == n) {
                break;
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        if (n % 2 == 0 && n != 2) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
