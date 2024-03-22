package org.Jan.jfs.day13;

public class VarArgsVariablesExample2 {
    public void format(String...arr){
        String data= "";
        int i=1;
        for (String ele:arr){
            data =data + i+")"+ele+"\n";
            i++;
        }
        System.out.println(data);
    }
    public void format(String a,String b){
        System.out.println("1)"+a);
        System.out.println("2)"+b);
    }
    public void format(String a,String b,String c){
        System.out.println("1)"+a);
        System.out.println("2)"+b);
        System.out.println("3)"+c);
    }

    public static void main(String[] args) {
        VarArgsVariablesExample2 vararg2 =new VarArgsVariablesExample2();
        vararg2.format("King","police","teja");
        System.out.println("-".repeat(50));
        vararg2.format("Dinesh","mahesh");
        System.out.println("-".repeat(50));
        vararg2.format("Ganesh","Hemanth","Raja");
        System.out.println("-".repeat(50));
        vararg2.format("Cat","Suresh");
    }
}
