package org.Jan.jfs.oop.basics;

public class AccountManager {
    public static void main(String[] args) {
        Account acc1 =new Account("yash",25000);
        Account acc2=new Account("teja",45000);
        acc1.deposit(250000);
        acc2.withdraw(34000);
        acc1.showBalance();
        acc1.showAccountInfo();
        acc2.showBalance();
        acc2.showAccountInfo();
    }
}
