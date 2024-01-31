package org.Jan.jfs.day7;

import java.util.Scanner;

public class AtmOptions {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        while (true){
            System.out.println("1. Withdraw, 2. Deposit, 3. Balance, 4. Exit");
            System.out.println("Enter the Choice :");
            int ch =sc.nextInt();
            switch (ch){
                case 1:
                    System.out.println("You have Selected the Withdraw option");
                    break;
                case 3:
                    System.out.println("You have Selected the Balance option");
                    break;
                case 2:
                    System.out.println("You have Selected the Deposit option");
                    break;
                case 4:
                    System.out.println("You have Selected the Exit option ");
                    System.exit(0);
                default:
                    System.out.println("Invalid Option");
            }
        }
    }
}
