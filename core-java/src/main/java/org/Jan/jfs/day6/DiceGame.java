package org.Jan.jfs.day6;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DiceGame {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int gnum= ThreadLocalRandom.current().nextInt(1,7);

        for (int i =1;i<=5;i++){
            System.out.println("Guess the Number fron(1-6)is :");
            int n = sc.nextInt();
            if (n==gnum){
                System.out.println("You Won the Game in "+i+" attempts");
                break;
            }
            else {
                if (i == 5){
                    System.out.println("You reached out the Max Chances "+i+" You Lost the game ");
                }
                else {
                    System.out.println("You Loss && Try again");
                }
            }

        }

    }
}
