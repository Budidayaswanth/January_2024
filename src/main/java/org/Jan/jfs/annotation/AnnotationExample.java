package org.Jan.jfs.annotation;

import lombok.*;

@AllArgsConstructor
@ToString
@Data
@Builder
@NoArgsConstructor
class Address{
    private String city;
    private String state;
    private String street;
    private String zip;
}
public class AnnotationExample {
    public static void main(String[] args) {
        Address address =new Address("Hyderabad","TS","Ameerpet","500016");
        System.out.println(address);

        int n=100;
        System.out.println("End of main method");
    }

    public void printAddress(Address address){
        System.out.println(address);
    }

}
