package org.Jan.jfs.day13;

import jdk.jfr.Category;

class Games {
    private String name;
    private String Time;
    private String Category;
    Games(String name,String Time,String Category){
       this.name=name;
        this.Time=Time;
       this.Category= Category;
    }

    public void showGameInfo(){
        System.out.println("Name :"+name);
        System.out.println("Timings :"+Time);
        System.out.println("Categories :"+Category);
    }
}
public class Constructor {
    public static void main(String[] args) {
        Games games=new Games("Chess","2Pm-4Pm","Indoor");
        Games games1=new Games("Cricket","4Pm-6Pm","Outdoor");
        Games games2=new Games("Carrom","3Pm -4:30Pm","Indoor");
        Games games3=new Games("Table Tennis","4Pm -6Pm","Indoor");
        Games games4=new Games("Swimming","2Pm-4Pm","Outdoor");
        games.showGameInfo();
        System.out.println("-".repeat(50));
        games1.showGameInfo();
        System.out.println("-".repeat(50));
        games2.showGameInfo();
        System.out.println("-".repeat(50));
        games3.showGameInfo();
        System.out.println("-".repeat(50));
        games4.showGameInfo();
    }
}
