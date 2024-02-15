package org.Jan.jfs.oop.constructor;

import java.util.ArrayList;
import java.util.List;

public class AccountManager {
    public static void main(String[] args) {
        String data = """
                1001,Krish,45000
                1002,Manoj,55000
                1003,Charan,65000
                1004,Praveen,35000
                1005,Manish,65000
                1006,Rajesh,95000
                """;
        String[] line = data.split("\n");

        List<Account> account = new ArrayList<>();
        for (String lines : line) {
            String[] b = lines.split(",");
            Account acc = new Account(Integer.parseInt(b[0]), b[1], Double.parseDouble(b[2]));
            account.add(acc);
        }
        //System.out.println(account);


        for (Account s : account) {
            if (s.getBalance()>50000) {
                System.out.println(s);
            }
        }
    }
}
