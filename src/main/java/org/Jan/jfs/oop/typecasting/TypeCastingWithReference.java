package org.Jan.jfs.oop.typecasting;

class Printer {
    public void print() {
        System.out.println("Printer class print Method");
    }
}

class SonyPrinter extends Printer {
    @Override
    public void print() {
        System.out.println("SonyPrinter class print Method");
    }
}

class HpPrinter extends Printer {
    @Override
    public void print() {
        System.out.println("HpPrinter class print Method ");
    }
    public void print(String data){
        System.out.println("HpPrinter class print Method with data "+data);
    }
}

class CanonPrinter extends Printer {
    public void print() {
        System.out.println("CanonPrinter class print Method ");
    }
}

public class TypeCastingWithReference {
    public static void main(String[] args) {
        Printer printer = getPrinter("sony");
        if (printer instanceof HpPrinter obj) {
            obj.print("Yash");
        } else {
            printer.print();
        }
    }


    public static Printer getPrinter(String type) {
        if (type.equals("sony")) {
            return new SonyPrinter();
        } else if (type.equals("hp")) {
            return new HpPrinter();
        } else if (type.equals("canon")) {
            return new CanonPrinter();
        } else {
            return new Printer();
        }
    }
}