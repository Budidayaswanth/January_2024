package org.Jan.jfs.oppproblems;

public class ProductDetails {
    private int pid;
    private String pname;
    private double price;

    public ProductDetails(int pid, String pname, double price) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
    }

    public static void main(String[] args) {
        ProductDetails[] obj = new ProductDetails[6];
        obj[0] = new ProductDetails(200, "hp", 65000);
        obj[1] = new ProductDetails(201, "dell", 35000);
        obj[2] = new ProductDetails(202, "lenovo", 45000);
        obj[3] = new ProductDetails(203, "Asus", 38000);
        obj[4] = new ProductDetails(204, "acer", 34000);
        obj[5] = new ProductDetails(205, "msi", 60000);
        System.out.println("product 1 :");
        obj[0].Display();
        System.out.println("product 2 :");
        obj[1].Display();
        System.out.println("product 3 :");
        obj[2].Display();
        System.out.println("product 4 :");
        obj[3].Display();
        System.out.println("product 5 :");
        obj[4].Display();
        System.out.println("product 6 :");
        obj[5].Display();

    }

    public void Display() {
        System.out.println("Product id is :" + pid);
        System.out.println("Product Name is :" + pname);
        System.out.println("Product Price is :" + price);
        System.out.println("-----------------------------");
    }
}
