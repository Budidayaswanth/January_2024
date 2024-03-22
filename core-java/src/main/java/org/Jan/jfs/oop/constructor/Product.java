package org.Jan.jfs.oop.constructor;

public class Product {
    private int pid;
    private String pname;
    private double price;

    public Product() {
        System.out.println("project object is created ");
    }

    public Product(int pid, String pname) {
        this(pid, pname, 0);
        System.out.println("Product object created with pid and pname");
    }

    public Product(int pid, String pname, double price) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
    }
    public void showDetails(){
        System.out.println("Product id : "+pid);
        System.out.println("Product Name : "+pname);
        System.out.println("Product Price : "+price);
    }

    public static void main(String[] args) {
        Product p =new Product(1,"King");
        p.showDetails();
    }
}
