package org.Jan.jfs.oop.inheritance;

    class T1{
        public T1(int a){
            System.out.println("T1 constructor is called ");
        }
        public void show1(){
            System.out.println("Show1 method called ");
        }
    }
    class T2 extends  T1{
        public T2(){
            super(10);
            System.out.println("T2 constructor  is called ");
        }
        public void show2(){
            System.out.println("show2 Method called ");
        }
    }
public class InheritanceExample2 {
    public static  void main(String[] args) {
        T1 obj =new T2 ();

    }
}
