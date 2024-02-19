package org.Jan.jfs.oop.methods;

public class Manager {
    public static void main(String[] args) {
        int[] arr = {10, 12, 13, 14, 22, 34, 35, 45, 33, 46};
        int max = MethodExample.maxElement(arr);
        System.out.println("Max element in the array is : " + max);
        MethodExample.showGreetings("Yash");
        System.out.println("System date and Time : " + MethodExample.getSystemDateAndTime());
        MethodExample.showInfo();

        int num = 12;
        System.out.println("Square Root of " + num + " is " + Math.sqrt(num));
        MyMathUtil obj = new MyMathUtil();
        obj.showPrime(10, 100);
        int gcd = obj.gcd(12, 24, 36);
        System.out.println("\n GCD Of 10,20,30 is :" + gcd);

        MethodWithRecursion obj1 = new MethodWithRecursion();
        int res = obj1.sumOfNaturalNumbers(10);
        int res1 = obj1.factorial(5);
        int res2 = obj1.gcd(12, 36);
        obj1.showTable(12);
        System.out.println("Sum of Natural Number is : " + res);
        System.out.println("Factorial of 5 is : " + res1);
        System.out.println("Gcd od 12,36 is : " + res2);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);


    }
}
