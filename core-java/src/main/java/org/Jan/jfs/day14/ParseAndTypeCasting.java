package org.Jan.jfs.day14;

public class ParseAndTypeCasting {
    public static void main(String[] args) {
        String data = "2,yaswanth,5.10,Student,2023";
        String[] arr = data.split(",");
        int stno = Integer.parseInt(arr[0]);
        String name = arr[1];
        double height = Double.parseDouble(arr[2]);
        String deg = arr[3];
        double poy = Double.parseDouble(arr[4]);
        System.out.println("Student Number : " + stno);
        System.out.println("Student Name : " + name);
        System.out.println("Designation : " + deg);
        System.out.println("Student Height : " + height);
        System.out.println("Student Passing year :" + poy);

        int n = 23;
        System.out.println("INTEGER TO BINARY" + Integer.toBinaryString(n));
        System.out.println("INTEGER TO HEXADECIMAL " + Integer.toHexString(n));
        System.out.println("INTEGER TO OCTAL" + Integer.toOctalString(n));
        System.out.println("BYTE      MIN : " + Byte.MIN_VALUE + "      MAX : " + Byte.MAX_VALUE);
        System.out.println("SHORT     MIN : " + Short.MIN_VALUE + "     MAX : " + Short.MAX_VALUE);
        System.out.println("INTEGER   MIN : " + Integer.MIN_VALUE + "   MAX :" + Integer.MAX_VALUE);
        System.out.println("LONG      MIN : " + Long.MIN_VALUE + "      MAX : " + Long.MAX_VALUE);
        System.out.println("FLOAT     MIN : " + Float.MIN_EXPONENT + "  MAX : " + Float.MAX_EXPONENT);
        System.out.println("DOUBLE    MIN : " + Double.MIN_EXPONENT + " MAX : " + Double.MAX_EXPONENT);
        System.out.println("CHARACTER MIN : " + Character.MIN_RADIX + " MAX : " + Character.MAX_RADIX);
        System.out.println("BOOLEAN   TYPE " + Boolean.TRUE + "         OR " + Boolean.FALSE);


        byte a =5;
        short b=6;
        int  c=2;
        long d =10;
        float e =6.00f;
        double f =9.00d;
        System.out.println("byte  a: "+a);
        System.out.println("short  b: "+b);
        System.out.println("Integer c: "+c);
        System.out.println("Long d : "+d);
        System.out.println("Float e: "+e);
        System.out.println("Double f: "+f);

        System.out.println("-".repeat(100));
        System.out.println("Implicit type casting (widening)");
        b=a;
        System.out.println("a value to b "+b);
        d =c;
        System.out.println("c value to d "+d);
        f=e;
        System.out.println("e value to f "+f);

        System.out.println("-".repeat(100));
        System.out.println("Explicit type casting (Narrowing)");
        a=(byte)d;
        System.out.println("a byte to long d "+a);
        e =(int) c;
        System.out.println("c int to float e "+d);
        f =(short) b;
        System.out.println("f double to short b "+e);


    }
}
