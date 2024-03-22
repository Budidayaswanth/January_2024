package org.Jan.jfs.oop.constructor;

public class DbConnection {
    private String userName;
    private String password;
    private String url;

    public DbConnection(String userName,String password,String url){
        this.userName=userName;
        this.password=password;
        this.url=url;
    }
    public String getUserName(){
        return userName;
    }
    public String getPassword(){
        return password;
    }

    public String getUrl(){
        return url;
    }

    public void setUserName(String userName){
        this.userName=userName;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public void setUrl(String url){
        this.url=url;
    }
}
