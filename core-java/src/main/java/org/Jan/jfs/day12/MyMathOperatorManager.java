package org.Jan.jfs.day12;
import static org.Jan.jfs.day12.MyMathOperators.*;
public class MyMathOperatorManager {
    public static void main(String[] args) {
        MyMathOperators math =new MyMathOperators();
        System.out.println(math.gcd(24,56));
        math.showGreeting(" ");
        math.showGreeting("Krishna");
        System.out.println(biggest(2,3,6));
        showDateAndTime();
        System.out.println(getOsName());

    }
}
