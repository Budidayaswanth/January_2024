package org.Jan.jfs.oop.Override;

public final class SavingAccount extends Account {
     private double minBalance;

     public SavingAccount(int accno,String name,double balance,double minBalance){
         super(accno,name,balance);
         this.minBalance=minBalance;
     }

     @Override
    public void withdraw(double amount){
         if(amount >(balance -minBalance)){
             System.out.println("Sorry! Insufficient fund ");
         }else {
             balance -=amount;
             System.out.println("Amount :"+amount+" is Withdraw from Saving Account "+accno);
         }
     }
}
