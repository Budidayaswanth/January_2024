package org.java.spring_jdbc.SimpleJdbc;

import java.sql.*;

public class productManager {
    public static void main(String[] args) {
        showProduct();
        System.out.println("Count Of Products");
        productCount();

    }
    public static void productCount(){
        Connection con =null;
        Statement st =null;
        ResultSet rs =null;
        try {
            con =getConnection();
            st=con.createStatement();
            rs=st.executeQuery("select count(*) as c from product");
            while (rs.next()){
                int count =rs.getInt("c");
                System.out.println("no.of products = "+count);

            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            close(con,st,rs);
        }

    }
    public static void showProduct(){
        Connection con =null;
        Statement st =null;
        ResultSet rs =null;
        try {
            con =getConnection();
            st=con.createStatement();
            rs=st.executeQuery("select id,name,price from product");
            while (rs.next()){
                System.out.println( rs.getInt("id")+" "+rs.getString("name")+" "+rs.getDouble("price"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            close(con,st,rs);
        }
    }



    public static void close(AutoCloseable... closeables){
        for (AutoCloseable closeable :closeables){
            if(closeable !=null){
                try {
                    closeable.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

    public static Connection getConnection(){
        Connection con =null;
        try {
            String url ="jdbc:mysql://localhost:3306/yash_db?allowPublicKeyRetrieval=true&useSSL=false";
            String username ="dbyash";
            String password ="dbyash";
            con = DriverManager.getConnection(url,username,password);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return con;
    }
}
