package org.Jan.jfs.collections.set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
class Product{
    private int pid;
    private String pname;
    private double price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return pid == product.pid && Double.compare(price, product.price) == 0 && Objects.equals(pname, product.pname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pid, pname, price);
    }
}
public class SetExample3 {
    public static void main(String[] args) {
        Product p1=new Product(101,"Dell LapTop",45000);
        Product p2 =new Product(102,"Lenovo LapTop",35000);
        Product p3 =new Product(103,"Hp LapTop",67000);
        Product p4=new Product(101,"Dell LapTop",45000);

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        System.out.println(p4.hashCode());

        Set<Product> set =new HashSet<>();
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        System.out.println(set);
    }
}
