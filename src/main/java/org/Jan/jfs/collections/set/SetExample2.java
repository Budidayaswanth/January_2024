package org.Jan.jfs.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample2 {
    public static void main(String[] args) {
        List<String> cs =List.of("Raj","Shaker","Manoher","Mohan Das");
        List<String> is =List.of("King","Queen","Princess","Prince","Raj");
        List<String> ec =List.of("yashwanth","Gowtham","Praveen","Venkatesh","Mohan Das");

        Set<String> UniqueName=new HashSet<>(cs);
        UniqueName.addAll(is);
        UniqueName.addAll(ec);
        System.out.println(UniqueName);
    }
}
