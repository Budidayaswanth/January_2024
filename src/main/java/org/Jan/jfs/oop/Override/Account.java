package org.Jan.jfs.oop.Override;

public  abstract sealed class Account permits SavingAccount,CurrentAccount,JointAccount {
    protected int accno;
    protected String name;
    protected double balance;

    public Account(int accno,String name,double balance){
        this.accno=accno;
        this.name=name;
        this.balance=balance;
    }

    public void withdraw(double amount){
        if(amount >balance){
            System.out.println("Insufficient Funds ");;
        }
        else {
            balance-=amount;
            System.out.println("Amount : "+amount+"is Withdraw from account : "+accno);
        }
    }

    public void deposit(double amount){
        balance +=amount;
        System.out.println("Amount :"+amount+" is Deposit to your Account : "+accno);
    }

    public void showInfo(){
        System.out.println("Account : "+accno+" Name : "+name+" Balance : "+balance);
    }
}
