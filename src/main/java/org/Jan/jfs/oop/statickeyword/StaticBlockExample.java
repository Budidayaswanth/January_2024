package org.Jan.jfs.oop.statickeyword;

public class StaticBlockExample {

    static {
        System.out.println("Static block called -1");
    }
    static {
        System.out.println("static block called -2");
    }

    public static void main(String[] args) {
        System.out.println("main Method Called ");
    }
    static {
        System.out.println(" Static block callled -3");
    }
}
