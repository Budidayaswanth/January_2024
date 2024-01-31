package org.Jan.jfs.oppproblems;

public class ProductPriceSwapping {

    private int id;
    private String name;
    private double price;

    public ProductPriceSwapping(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public static void swapPrice(ProductPriceSwapping product1, ProductPriceSwapping product2) {
        double temp = product1.getPrice();
        product1.setPrice(product2.getPrice());
        product2.setPrice(temp);
    }

    public static void main(String[] args) {
        ProductPriceSwapping laptop = new ProductPriceSwapping(101, "dell laptop", 24000);
        ProductPriceSwapping Desktop = new ProductPriceSwapping(102, "Dell Desktop", 34578);

        System.out.println("Before Swapping");
        System.out.println("laptop price =" + laptop.getPrice());
        System.out.println("Desktop price =" + Desktop.getPrice());

        ProductPriceSwapping.swapPrice(laptop, Desktop);
        System.out.println("After Swapping ");
        System.out.println("laptop price =" + laptop.getPrice());
        System.out.println("Desktop price =" + Desktop.getPrice());
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
