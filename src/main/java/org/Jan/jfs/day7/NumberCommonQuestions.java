package org.Jan.jfs.day7;

public class NumberCommonQuestions {
    public static void main(String[] args) {
        int num = 11011;
        int count =countPrimeDigits(1,10);
        System.out.println("Count Prime Digits  are :"+count);
        System.out.println("The sum of " + num + " is " + sumDigits(num));
        System.out.println("The reverse of " + num + " is " + reverseOfNumber(num));
        System.out.println("The palindrome of " + num + " is " + palindrome(num));
    }

    public static int sumDigits(int n) {
        int sum = 0;
        while (n != 0) {
            int r = n % 10;
            sum += r;
            n /= 10;
        }
        return sum;
    }

    public static int reverseOfNumber(int n) {
        int rev = 0;
        while (n != 0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n /= 10;
        }
        return rev;
    }

    public static boolean palindrome(int n) {
        return n == reverseOfNumber(n);
    }
    public static int countPrimeDigits(int lb, int ub) {
        int count = 0;
        for (int i = lb; i <= ub; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }
    public static boolean isPrime(int n){
        if(n <2){
            return false;
        }
        if (n % 2==0 && n  !=2){
            return false;
        }
        for (int i =2;i <=n/2 ;i++){
            if(n % i ==0){
                return false;
            }
        }
        return true;
    }

}
