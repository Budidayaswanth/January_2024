package org.Jan.jfs.day9;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample1 {
    public static void main(String[] args) {
        List<Integer> numList =new ArrayList<>();
        numList.add(24);
        numList.add(5);
        numList.add(23);
        numList.add(45);
        numList.add(32);

        List<Integer> num1List =new ArrayList<>();
        num1List.add(23);
        num1List.add(45);
        num1List.add(43);
        num1List.add(65);
        num1List.add(30);

        List<Integer> ContainsList = new ArrayList<>();
        for (int ele:numList){
            if(num1List.contains(ele)){
                ContainsList.add(ele);
            }
        }
        System.out.println(ContainsList);

        List<Integer> NotCommonList =new ArrayList<>();
        for (int ele :numList){
            if(!num1List.contains(ele)){
                NotCommonList.add(ele);
            }
        }
        List<Integer> NotContainsInList =new ArrayList<>();
        for (int ele :num1List){
            if (!numList.contains(ele)){
                NotContainsInList.add(ele);
            }
        }
        System.out.println(NotCommonList);
        System.out.println(NotContainsInList);
    }
}
