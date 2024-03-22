package org.Jan.jfs.oop.Interface;

import java.util.Scanner;

interface MusicInstrument{
    int e =2;
    void play();
}

class Guitar implements MusicInstrument{
    @Override
   public void play(){
        System.out.println("Play the guitar ");
    }
}
class piano implements MusicInstrument{
    @Override
    public void play(){
        System.out.println("play the piano");
    }
}
class Flute implements MusicInstrument{
    @Override
    public void play(){
        System.out.println("play the Flute ");
    }
}
public class InterfaceManager {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("1.Guitar 2.Piano  3.Flute 4.Exit");
        System.out.println("Enter Your Choice :");
        int ch = sc.nextInt();
        if(ch==4){
            System.out.println("Thank you for playing Game ");
            System.exit(0);
        }
        MusicInstrument musicInstrument =getMusicInstrument(ch);
        musicInstrument.play();

    }

    public static MusicInstrument getMusicInstrument(int ch){
        return switch (ch){
            case 1->new Guitar();
            case 2->new piano();
            case 3->new Flute();
            default -> throw new IllegalArgumentException("Invalid Choice");
        };
    }
}
