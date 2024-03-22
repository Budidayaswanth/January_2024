package org.Jan.jfs.day9;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {
    public static void main(String[] args) {
        List<String> Names =new ArrayList<>();
        Names.add("Krishna");
        Names.add("King");
        Names.add("Gowtham");
        Names.add("Hemanth");
        Names.add("Narayana");
        Names.add("King");
        Names.add("Jhon");
        Names.add("Jhon");
        System.out.println(Names);
        System.out.println(Names.size());

        List<String> UniqueName =new ArrayList<>();
        for(String name :Names){
            if (!UniqueName.contains(name)){
                UniqueName.add(name);
            }
        }
        System.out.println(UniqueName);
    }
}
