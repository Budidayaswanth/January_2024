package org.Jan.jfs.oop.abstractexample;
abstract  class One{

    One(){
        super();
    }
}
abstract class Two extends One{
    Two(){
        super();
    }
}
class Three extends Two{
    Three(){
        super();
    }
}

public class AbstractClassWithConstructor {
    public static void main(String[] args) {
        One obj =new Three();
    }

}
