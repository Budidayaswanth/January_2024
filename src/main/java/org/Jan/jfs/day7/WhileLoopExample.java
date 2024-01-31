package org.Jan.jfs.day7;

public class WhileLoopExample {
    public static void main(String[] args) {
        int n =19;
        showTable(n);
        int n1 =5;
        int res =factorial(n1);
        System.out.println("the factorial of "+n1+" is "+res);

    }
    public static void showTable(int n){
        int i =1;
        while ( i<= 10){
            System.out.println(n+" x "+" = "+n*i);
            i++;
        }
    }
    public static int factorial(int n){
        if(n ==0 || n ==1){
            return 1;
        }
        int res =1;
        int i=2;
        while (i <=n){
            res*=i;
            i++;
        }
        return res;
    }
}
