package org.Jan.jfs.ymal;

import java.util.List;

public class SimpleTest {
    public static void main(String[] args) {
        List<Double> list =List.of(1.23,3.3,2.3,1.25,2.45,2.48);
        double amount =0.0;
        for (Double ele:list){
            amount +=ele;
        }
        System.out.println(amount);
    }
}
