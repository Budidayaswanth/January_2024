package org.Jan.jfs.oop.Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@FunctionalInterface
interface MathOperations {
    int perform(int a, int b);
}

class InterMathOperations {
    private MathOperations mathOperations;

    public InterMathOperations(MathOperations mathOperations) {
        this.mathOperations = mathOperations;
    }

    public int performOperation(int a, int b) {
        return mathOperations.perform(a, b);
    }
}

interface TestCondition {
    boolean perform(int a);
}

interface ArithmeticOperation {
    int perform(int a, int b, int c);
}

public class InnerClassManager {
    public static void main(String[] args) {
        MathOperations obj1 = (a, b) -> a + b;
        InterMathOperations interMathOperation = new InterMathOperations(obj1);
        int res = interMathOperation.performOperation(10, 4);
        System.out.println(" result :" + res);

        TestCondition testCondition = (a)->a % 2 ==0;
        ArithmeticOperation arithmeticOperation =(a,b,c)->Math.max(Math.max(a,b),c);

        List<String> flist =filterName(List.of("Kish","Anush","Anish","yaswanth","Byaswanth"),(s)->s.contains("a"));
        System.out.println(flist);

    }
    private static List<String> filterName (List<String> list, Predicate<String> predicate){
        List<String> flist = new ArrayList<>();
        for(String name :list){
            if(predicate.test(name)){
                flist.add(name);
            }
        }
        return flist;
    }
}

