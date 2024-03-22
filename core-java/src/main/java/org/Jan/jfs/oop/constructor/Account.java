package org.Jan.jfs.oop.constructor;

public class Account {
    private int accNum;
    private String name;
    private double balance;

    public Account(int accNum,String name,double balance){
        this.accNum=accNum;
        this.name=name;
        this.balance=balance;
    }
    public int getAccNum(){
        return accNum;
    }
    public String getName(){
        return name;
    }
    public double getBalance(){
        return balance;
    }
    public void setAccNum(int accNum){
        this.accNum=accNum;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public void showInfo(){
        System.out.println("Account Number :"+accNum);
        System.out.println("Account Holder Name :"+name);
        System.out.println("Account Balance :"+balance);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accNum=" + accNum +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
