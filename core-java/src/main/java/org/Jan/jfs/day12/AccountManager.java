package org.Jan.jfs.day12;

public class AccountManager {
    public static void main(String[] args) {
        Account acc =new Account("AC111","Yash",15979.6);
        Account acc1=new Account("Ac112","King",1979.2);

        acc1.showInfo();
        System.out.println("-".repeat(50));
        acc.showInfo();
        System.out.println("-".repeat(50));
        System.out.println("Deposit amount");
        acc1.deposit(5000);
        System.out.println("-".repeat(50));
        System.out.println("after Deposit Amount");
        acc1.showInfo();
        System.out.println("-".repeat(70));
        System.out.println("Withdraw Amount ");
        acc.withdraw(14000);
        System.out.println("-".repeat(50));
        System.out.println("After Withdraw Amount");
        acc.showInfo();


    }
}
