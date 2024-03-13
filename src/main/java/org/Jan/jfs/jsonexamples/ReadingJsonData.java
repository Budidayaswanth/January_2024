/*
package org.Jan.jfs.jsonexamples;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.Jan.jfs.oop.constructor.Product;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class product {
    private int pid;
    private String pname;
    private double price;
    private String brand;
    private int model;
}

public class ReadingJsonData {
    public static void main(String[] args) throws IOException {
        String str = """
                    {
                    "pid":"p1001",
                    "pname":"Lenovo Thinkpad",
                    "price":960000,
                    "brand":"Lenovo",
                    "model":2024
                    }
                    """;
        ObjectMapper mapper =new ObjectMapper();
        Product product=mapper.readValue(str, Product.class);
        System.out.println(product);
        String JsonStr= mapper.writeValueAsString(product);
        System.out.println(JsonStr);
        List<Product> products =getProducts("Product.json");
        for (Product p:products){
            System.out.println(p);
        }
        List<Map<String,Object>> list =new ArrayList<>();
        for (Product p:products){
            Map<String,Object> map =mapper.convertValue(p, Map.class);
            map.put("discountpercentage",10);
            list.add(map);
        }
        String outputJson =mapper.writeValueAsString(list);
        File file =new File("discountpercentage.json");
        mapper.writeValue(file,list);

    }

    private static List<Product> getProducts(String fileName) {
        ObjectMapper objectMapper =new ObjectMapper();
        List<Product> list =new ArrayList<>();
        try {
            list = objectMapper.readValue(ReadingJsonData.class.getResourceAsStream("/"+fileName),
            new TypeReference<List<Product>>(){});
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

}
*/
