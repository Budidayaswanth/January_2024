package org.Jan.jfs.oop.abstractexample;

import java.util.Scanner;

sealed abstract class Game permits car,Bike,Ship {
    public void start(){
        System.out.println("Start the Game");
    }

    public abstract void play();

    public  void stop(){
        System.out.println("Stop the Game");
    }
}

final class car extends Game {
    @Override
    public void play() {
        System.out.println("Playing the Car Game ");
    }

}
final class Bike extends Game {
    public void play() {
        System.out.println("Playing Bike Race Game ");
    }
}

final class Ship extends Game {
    @Override
    public void play() {
        System.out.println("Playing Ship Race Game");
    }
}

public class GameManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. car, 2.Bike, 3.Ship, 4.Exit ");
            System.out.println("Enter Your Choice");
            int ch = sc.nextInt();
            if (ch == 4) {
                System.out.println("Thank For Playing the Game");
                System.exit(0);
            }
            Game game =getGame(ch);
            game.start();
            game.play();
            game.start();
            System.out.println("Do you want to play again (yes/no)");
            String option =sc.next();
            if (option.equalsIgnoreCase("no")){
                System.out.println("Thanks for Playing the game");
                System.exit(0);
            }
        }
    }

    public static Game getGame(int ch) {
        return switch (ch) {
            case 1 -> new car();
            case 2 ->new Bike();
            case 3-> new Ship();
            default -> throw new IllegalArgumentException("Invalid Choice");
        };
    }
}