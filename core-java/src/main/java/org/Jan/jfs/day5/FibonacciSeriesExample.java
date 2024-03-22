package org.Jan.jfs.day5;

import java.util.Scanner;

public class FibonacciSeriesExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n value :");
        int n= sc.nextInt();
        int a =0;
        int b =1;
        if (n==1){
            System.out.println(a);
            return;
        }
        if (n==2){
            System.out.println(a+" "+b);
            return;
        }
        if (n>2) {
            for (int i = 3; i <= n; i++) {
                int c = a + b;
                System.out.println(" "+c);
                a=b;
                b=c;
            }
        }
        int s=fib(5);
        System.out.println(s);
    }

    public static int fib(int num){
        if (num<=1){
            return num;
        }
        return fib(num-1)+fib(num-2);
    }
}