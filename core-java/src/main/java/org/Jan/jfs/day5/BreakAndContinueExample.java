package org.Jan.jfs.day5;

public class BreakAndContinueExample {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++){
            if(i%9==0){
                break;
            }
            System.out.println(i);
        }
        System.out.println("-------------");
        for (int j=2;j<=20;j++){
            if(j % 6 ==0){
                continue;
            }
            System.out.println(j);
        }
    }

}
