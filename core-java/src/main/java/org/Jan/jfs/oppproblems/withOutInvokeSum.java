package org.Jan.jfs.oppproblems;

class invoke {
    public int add(int... a) {
        int sum = 0;
        for (int i : a) {
            sum = sum + i;
        }
        return sum;
    }
}

public class withOutInvokeSum {

    public static void main(String[] args) {
        invoke obj = new invoke();
        System.out.println(obj.add(2, 3, 4));
        System.out.println(obj.add(2, 3));
    }
}
