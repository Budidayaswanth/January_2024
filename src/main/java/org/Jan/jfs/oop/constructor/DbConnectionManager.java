package org.Jan.jfs.oop.constructor;

import java.util.ArrayList;
import java.util.List;

public class DbConnectionManager {
    public static void main(String[] args) {
        DbConnection Db2=new DbConnection("yash","yashraj@143","www.yash.123.com");
        DbConnection Db1=new DbConnection("king","King@454","www.king.com");

        List<DbConnection> list=List.of(Db1,Db2);
        List<String> username=new ArrayList<>();

        for (DbConnection db :list){
            username.add(db.getUserName());
        }
        System.out.println(username);
    }
}
