package org.Java.jfs.cbook;

import org.Java.jfs.util.DbConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ContactDaoUtil {
    public boolean isEmailExists(String email){
        Connection con =null;
        PreparedStatement pst =null;
        ResultSet rs =null;
        boolean isExist =false;
        try {
            con= DbConnectionUtil.getConnection();
            pst=con.prepareStatement("select count(*) from contact where email =?");
            pst.setString(1,email);
            rs=pst.executeQuery();
            if (rs.next()){
                isExist =rs.getInt(1) ==1;
            }
        }catch (SQLException e){
            System.out.println("Error : "+e.getMessage());
        }finally {
            DbConnectionUtil.close(con,pst,rs);
        }
        return isExist;
    }

    public boolean isMobileExists(String mobile){
        Connection con =null;
        PreparedStatement pst =null;
        ResultSet rs=null;
        boolean isExists =false;
        try {
            con =DbConnectionUtil.getConnection();
            pst=con.prepareStatement("select count(*) from contact where mobile =?");
            pst.setString(1,mobile);
            rs=pst.executeQuery();
            if (rs.next()){
                isExists=rs.getInt(1)==1;
            }
        }catch (SQLException e){
            System.out.println("Error : "+e.getMessage());
        }finally {
            DbConnectionUtil.close(con,pst,rs);
        }
        return isExists;
    }

}
