package org.Jan.jfs.oop.Override;

import java.io.FileNotFoundException;
import java.io.IOException;

class one {
    void show() {
        System.out.println("One");
    }

    String biggest(int a, int b) throws IOException {
        return " " + (a > b ? a : b);
    }
}
class two extends one{
    protected void show(){
        System.out.println("Two");
    }
    @Override
    public String biggest(int a,int b)throws FileNotFoundException{
        if (a>b){
            return "A is Biggest";
        }
        else {
            return "B is biggest";
        }
    }
}

public class OverrideExample {
    public static void main(String[] args) throws IOException {
        one obj =  new two();
        String f =obj.biggest(2,6);
        System.out.println(f);

    }
}
