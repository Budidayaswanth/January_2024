package org.Jan.jfs.oop.typecasting;

public class TypeCastingExample {
    public static void main(String[] args) {
        System.out.println("Implicit Typecasting or (Widening)");
        int a =10;
        double b=a;
        System.out.println(b);
        System.out.println("Explicit Typecasting or (Narrowing)");
        double c =10.5;
        int d =(int) c;
        System.out.println(d);

        String s ="23.45";
        double v =Double.parseDouble(s);
        System.out.println(s);

        // boxing and Unboxing
        int x =10;
        Integer obj =x;
        int y =obj;
        int z =20;
        int e =z;
        System.out.println(e);


    }
}
