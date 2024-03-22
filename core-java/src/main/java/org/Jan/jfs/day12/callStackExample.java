package org.Jan.jfs.day12;

public class callStackExample {
    public void m1(){
        m2();
        System.out.println("m1 Method");
    }
    public void m2(){
        m3();
            System.out.println("m2 Method");
    }
    public void m3(){
        m4();
        System.out.println("M3 Method");
    }
    public void m4(){
        m5();
        System.out.println("m4 Method");
    }
    public void m5(){
        System.out.println("m5 Method");
    }

    public static void main(String[] args) {
        callStackExample obj =new callStackExample();
        obj.m1();
    }
}
