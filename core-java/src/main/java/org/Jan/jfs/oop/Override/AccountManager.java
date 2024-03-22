package org.Jan.jfs.oop.Override;

import java.util.List;

public class AccountManager {
    public static void main(String[] args) {
        List<Account> list = getAccount();

        int scount = 0;
        int ccount = 0;

        for (Account account : list) {
            if (account instanceof SavingAccount) {
                scount++;
            } else if (account instanceof CurrentAccount) {
                ccount++;
            }
        }
        System.out.println("Total Saving Account " + scount);
        System.out.println("Total Current Account " + ccount);

        for (Account acc : list) {
            acc.withdraw(1000);
        }
    }

    public static List<Account> getAccount() {
        return List.of(new SavingAccount(100, "Uma", 23434, 34550),
                new CurrentAccount(101, "king", 345000, 3000),
                new SavingAccount(102, "Leo", 450000, 8900),
                new CurrentAccount(103, "praveen", 43200, 3400),
                new SavingAccount(104, "yash", 56000, 3200));
    }

}
