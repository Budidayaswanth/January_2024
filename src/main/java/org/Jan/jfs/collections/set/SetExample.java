package org.Jan.jfs.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("rajesh");
        set.add("King");
        set.add("mohan");
        set.add("Das");
        set.add("King");
        set.add("haresha");
        System.out.println(set);

        for (String ele:set){
            System.out.println(ele);
        }
        set.forEach(System.out::println);
        Iterator<String> iterator =set.iterator();
        while (iterator.hasNext()){
            String ele =iterator.next();
            System.out.println(ele);
        }



    }
}
