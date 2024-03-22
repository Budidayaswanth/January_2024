package org.Jan.jfs.oop.typecasting;
class d{
    public void show(){
        System.out.println("show d");
    }
}
class d1 extends d{

    @Override
    public void show(){
        System.out.println("show d1");
    }
    public void show1(){
        System.out.println("show1 d1");
    }
}
public class TypeCastingClass {
    public static void main(String[] args) {
        d obj =new d1();
        if(obj instanceof d1 obj2){
            obj2.show1();
            obj2.show();
        }
    }
}
