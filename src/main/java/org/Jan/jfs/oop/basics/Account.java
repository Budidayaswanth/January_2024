package org.Jan.jfs.oop.basics;

public class Account {
    private long accNum;
    private String name;
    private double balance;

    public Account(String name,double balance){
        accNum=System.currentTimeMillis();
        this.name=name;
        this.balance=balance;
    }

    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("Insufficient Balance ");
        }
        else {
            balance-=amount;
            System.out.println("Your account :"+DataMaskUtil.MaskAccountNumber(accNum)+" has been debited with "+amount+" and balance is "+balance);
        }

    }
    public void deposit(double amount){
        balance +=amount;
        System.out.println("Your account :"+DataMaskUtil.MaskAccountNumber(accNum)+" has credited with "+amount+" and balance is "+balance );
    }

    public void showBalance(){
        System.out.println("Your account :"+DataMaskUtil.MaskAccountNumber(accNum)+" has the balance of "+balance);
    }
    public void showAccountInfo(){
        String Info="Account Number "+DataMaskUtil.MaskAccountNumber(accNum)+" Name "+name+" Balance "+balance;
        System.out.println(Info);
    }

}
