package org.Jan.jfs.cbook;

public class Contact {
    private String cid;
    private String Name;
    private String email;
    private String mobile;

    public Contact(String Name,String email,String mobile){
        if(cid ==null || cid.isEmpty()){
            this.cid=CidGenerator.generateCid();
        }
        this.email=email;
        this.Name=Name;
        this.mobile=mobile;
    }
    public String getName(){
        return Name;
    }
    public String getCid(){
        return cid;
    }
    public String getEmail(){
        return email;
    }
    public String getMobile(){
        return mobile;
    }

    public void  setCid(String cid){
        this.cid=cid;
    }
    public void setName(String Name){
        this.Name=Name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setMobile(String mobile){
        this.mobile=mobile;
    }
}
