package org.Jan.jfs.oop.Override;

import java.util.Objects;

class Product extends Object {
    private int pid;
    private String pname;
    private double price;

    public Product(int pid, String pname, double price) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
    }

    public int getPid() {
        return pid;
    }

    public String getPname() {
        return pname;
    }

    public double getPrice() {
        return price;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", pname=" + pname +
                ",price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return pid == product.pid && Double.compare(price, product.price) == 0 && Objects.equals(pname, product.pname);
    }

    @Override
public int hashCode(){
    return Objects.hash(pid,pname,price);
}
}

public class ObjectClassMethod {
    public static void main(String[] args) {
        Product p1=new Product(101,"king",455543.4);
        Product p2=new Product(102,"owwo",32555.3);

        Product p3=p2;

        Product p4=p1;
        System.out.println(p1);
        System.out.println(p1.equals(p4));
        System.out.println(p2.equals(p3));
        System.out.println(p1.equals(p2));
    }
}
