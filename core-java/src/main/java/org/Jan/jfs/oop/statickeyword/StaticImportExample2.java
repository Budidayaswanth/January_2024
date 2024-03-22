package org.Jan.jfs.oop.statickeyword;

import static org.Jan.jfs.oop.statickeyword.SimpleClsOne.show1;
import static org.Jan.jfs.oop.statickeyword.SimpleClsTwo.show4;
class SimpleClsOne{
    public static void show1(){
        System.out.println("show Method Called");
    }
    public static void show2(){
        System.out.println("show Method Called");
    }

}
class SimpleClsTwo {
    public static void show2() {
        System.out.println("Show Method is Called ");
    }

    public static void show4() {
        System.out.println("Show Method is called");
    }
}

public class StaticImportExample2 {

        public static void main(String[] args) {
            show1();
           SimpleClsOne.show2();
            SimpleClsTwo.show2();
            show4();
        }
    }

