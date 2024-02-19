package org.Jan.jfs.oop.statickeyword;
import static org.Jan.jfs.oop.statickeyword.Outter.Inner.show;
class Outter{
    static class Inner{
        public static void show(){
            System.out.println("Inner Class Show Method ");
        }
    }
}
public class StaticInnerClassExample {
    public static void main(String[] args) {
        //Outter.Inner.show();
        show();
    }
}
