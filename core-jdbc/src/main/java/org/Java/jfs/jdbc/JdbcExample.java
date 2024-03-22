package org.Java.jfs.jdbc;

import org.Java.jfs.util.DbConnectionUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample {
    private static DbConnectionUtil DdConnectionUtil;

    public static void main(String[] args) {
        showAllEmployees();
        showEmployeeCount();
    }
    public static void showEmployeeCount(){
        Connection con=null;
        Statement st=null;
        ResultSet rs=null;
        try {
            con =DbConnectionUtil.getConnection();
            st= con.createStatement();
            rs=st.executeQuery("select count(*) from emp");
            if(rs.next()){
                System.out.println("Total employee : "+rs.getInt(1));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DbConnectionUtil.close(con,st,rs);
        }
    }
    public static void showAllEmployees(){
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            con = DbConnectionUtil.getConnection();
            st=con.createStatement();
            rs=st.executeQuery("select * from emp");
            while (rs.next()){
                System.out.println(rs.getInt("empno"));
                System.out.println(rs.getString("ename"));
                System.out.println("--------------------------------");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            DbConnectionUtil.close(con,st,rs);
        }
    }
}
