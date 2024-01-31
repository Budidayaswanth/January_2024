package org.Jan.jfs.oppproblems;

public class FactorialOfRecursion {
    public static void main(String[] args) {
        int num = 5;
        long factorial = calfactroial(num);
        System.out.println("Factorial of " + num + "is " + factorial);
    }

    public static int calfactroial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calfactroial(n - 1);
        }
    }
}
