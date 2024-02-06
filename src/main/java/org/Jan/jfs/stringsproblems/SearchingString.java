package org.Jan.jfs.stringsproblems;

import java.util.Arrays;
import java.util.Scanner;

public class SearchingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Strings :");
        String name=sc.nextLine();
        String str ="mani,lakshman,java,malli,narayana";
        String[] str1 =str.split(",");
        for (String ele : str1){
            if(ele.equalsIgnoreCase(name)){
                System.out.println(ele);
            }
        }

        System.out.println();
    }
}
