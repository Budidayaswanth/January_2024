package org.Jan.jfs.day13;

public class VarArgsVariablesExample1 {
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public int add(char a,int b){
        return a+b;
    }
    public String add(String a, String b){
        return a+b;
    }
    public String add(String a,String b,String c){
        return  a+b+c;
    }
    public int add(int a,char b){
        return a+b;
    }
    public double add(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        VarArgsVariablesExample1 varargs1 = new VarArgsVariablesExample1();
        System.out.println(varargs1.add(2,4));
        System.out.println(varargs1.add(2,3,5));
        System.out.println(varargs1.add('R',4));
        System.out.println(varargs1.add(3,'e'));
        System.out.println(varargs1.add("Yash","wanth"));
        System.out.println(varargs1.add("Bdidha ","Yash","wanth"));
        System.out.println(varargs1.add(2.33,4.565));
        System.out.println(varargs1.add('z',4));
        int value  ='N';
        System.out.println(value);
    }
}
