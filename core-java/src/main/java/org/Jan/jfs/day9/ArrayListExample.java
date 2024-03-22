package org.Jan.jfs.day9;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Mahesh");
        list.add("Krishna");
        list.add("Krishna");
        list.add("Lokesh");
        list.add("Narshima");
        list.add("Dinesh");
        list.add("ManiSigh");
        list.remove("Krishna");
        System.out.println(list);
        System.out.println(list.contains("krishna"));
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list.toString());
        System.out.println(list.remove("Dinesh"));
        System.out.println(list);
        System.out.println(list.size());
        for (int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }

        for (String name :list){
            System.out.println(name);
        }
    }
}
