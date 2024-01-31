package org.Jan.jfs.day6;

public class MultiplicationOfTables {
    public static void main(String[] args) {
        int lb =1;
        int ub =20;
       showTables(lb,ub);
    }
    public static void showTables(int lb,int ub){
        for (int i=lb;i<=ub;i++){
            for (int j=1;j<=10;j++){
                System.out.println(i+" x "+j+" = "+i*j);
            }
            System.out.println("------------------");
        }
    }
}
