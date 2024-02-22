package org.Jan.jfs.oop.Interface;
interface c1{
    void m1();
}
interface c2{
    void m1();
    void m2();
}
interface c3 extends c1,c2{
    void m3();
}
class c4 implements c3{
    @Override
    public void m1(){
        System.out.println("Print M1");
    }
    public void m2(){
        System.out.println("Print M2");
    }
    public void m3(){
        System.out.println("Print M3");
    }
}
public class InterfaceWithMultipleInheritance {
    public static void main(String[] args) {
        c3 obj =new c4();
        obj.m2();
    }

}
