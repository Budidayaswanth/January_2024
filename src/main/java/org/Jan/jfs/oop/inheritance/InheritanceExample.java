package org.Jan.jfs.oop.inheritance;
class One{
    public void show(){
        System.out.println("Show Method Called from class one");
    }
}
class Two extends One{
    public void show1(){
        System.out.println("Show 1 Method Called From Class Two ");
    }
}
public class InheritanceExample {
    public static void main(String[] args) {
        One obj =new One();
        obj.show();
        obj.show();
        Two two =new Two();
        two.show1();
        two.show();
    }
}
