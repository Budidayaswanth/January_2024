package org.Jan.jfs.oop.inheritance;
class cls1{
    int a =10;
    public cls1(){
        System.out.println("1");
    }
    public void show1(){
        System.out.println("1-show");
    }
}
class cls2 extends cls1{
    int a =100;
    public cls2(){
        System.out.println("2");
    }
    public void show1(){
        System.out.println("2-show");
    }
}
class cls3 extends cls2{
    int a =1000;
    public cls3(){
        System.out.println("3");
    }
    public void show1(){
        System.out.println("3-show");
        System.out.println(a);
        System.out.println(super.a);
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        cls1 obj =new cls2();
        obj.show1();
        cls1 obj1 =new cls3();
        obj1.show1();
        System.out.println(obj1.a);
    }

}
