package org.Jan.jfs.day13;

import java.util.ArrayList;
import java.util.List;

public class PassByValueAndReference1 {
    public static void checkAndAddBoysNames(List<String> Unique,List<String> boys){
        for (String Names :boys){
            if(!Unique.contains(Names)){
                Unique.add(Names);
            }
        }
    }

    public static void checkAndAddGirlsNames(List<String> Unique,List<String> girls){
        for (String Names:girls){
            if(!Unique.contains(Names)){
                Unique.add(Names);
            }
        }
    }

    public static void main(String[] args) {
        List<String> UniqueNames =new ArrayList<>();
        UniqueNames.add("Raj");
        UniqueNames.add("venkatesh");
        UniqueNames.add("Mallika");
        UniqueNames.add("Sri");
        List<String> boys=List.of("Raj","Venkatesh","King","yaswanth","praveen");
        List<String> girls=List.of("Mallika","Sri","Manisha","Vaishnavai");
        System.out.println("Before Adding the UniqueList : "+UniqueNames);
        checkAndAddBoysNames(UniqueNames,boys);
        checkAndAddGirlsNames(UniqueNames,girls);
        System.out.println("After Adding the UniqueList : "+UniqueNames);
    }
}
