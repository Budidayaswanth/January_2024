package org.Jan.jfs.oop.statickeyword;

public class IIBAndStaticBlock {
    {
        System.out.println("IIB called -2");
    }
    {
        System.out.println("IIB called -1");
    }
    static {
        System.out.println("Static block called -3");
    }
    static {
        System.out.println("static block called -1");
    }

    public static void main(String[] args) {
        System.out.println("main block called ");
        IIBAndStaticBlock obj =new IIBAndStaticBlock();
        IIBAndStaticBlock obj1=new IIBAndStaticBlock();
    }
    {
        System.out.println(" IIB called -3");
    }
    static {
        System.out.println("Static block called -2");
    }
}
