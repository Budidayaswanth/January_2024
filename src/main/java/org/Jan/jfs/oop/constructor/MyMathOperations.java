package org.Jan.jfs.oop.constructor;

public class MyMathOperations {
    private int num1;
    private int num2;
    private double num3;
    private double num4;

    public MyMathOperations(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }
    public MyMathOperations(int num1,double num3){
        this.num1=num1;
        this.num3=num3;
    }
    public MyMathOperations(double num3,int num1){
        this.num3=num3;
        this.num1=num1;
    }
    public MyMathOperations(double num3,double num4){
        this.num4=num4;
        this.num3=num3;
    }

    public MyMathOperations(int num1,int num2,double num3){
        this.num1=num1;
        this.num2=num2;
        this.num3=num3;
    }
}
