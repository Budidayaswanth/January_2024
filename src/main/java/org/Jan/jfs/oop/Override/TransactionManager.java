package org.Jan.jfs.oop.Override;

import java.time.LocalDateTime;

public class TransactionManager {
    public static void main(String[] args) {

        Transaction t1=new Transaction(1001,"9856343210","2344589763",1000,TnxStatus.SUCCESS, LocalDateTime.now());
        Transaction t2 =new Transaction( 1002,"97464321","86745321",3456,TnxStatus.FAILED,LocalDateTime.now().minusHours(2));
        System.out.println(t1);
        System.out.println(t2);

        System.out.println("-".repeat(35));
        System.out.println("------Transaction Details-----");
        System.out.println("TxnId : "+t1.getTransId());
        System.out.println("From Mobile : "+t1.getFromMobile());
        System.out.println("To Mobile : "+t1.getToMobile());
        System.out.println("Amount : "+t1.getAmount());
        System.out.println("Status : "+t1.getStatus());
        System.out.println("Date And Time : "+t1.getDateTime());
        System.out.println("-".repeat(45));
        System.out.println("------Transaction Details-----");
        System.out.println("TxnId : "+t2.getTransId());
        System.out.println("From Mobile : "+t2.getFromMobile());
        System.out.println("To Mobile : "+t2.getToMobile());
        System.out.println("Amount : "+t2.getAmount());
        System.out.println("Status : "+t2.getStatus());
        System.out.println("Date And Time : "+t2.getDateTime());
    }
}
