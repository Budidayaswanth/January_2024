package org.Jan.jfs.day13;

public class VarArgsVariablesExample {

    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public int add(int... a){
        int sum =0;
        for (int ele: a){
            sum +=ele;
        }
        return sum;
    }

    public static void main(String[] args) {
        VarArgsVariablesExample varargs =new VarArgsVariablesExample();
        System.out.println(varargs.add(2,4));
        System.out.println(varargs.add(2,4,5,5,8,9,3,1,25,6));
        System.out.println(varargs.add(2,5,6));

    }
}

