package org.Jan.jfs.day10;

import java.util.Arrays;

public class StringClassMethod {
    public static void main(String[] args) {
        String name = " Yash B ";
        System.out.println(name);
        System.out.println(name.length());
        name = name.trim();
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(4));
        System.out.println(name.startsWith("Y"));
        String data = "Yash,gova,Gowtham,raja";
        String[] arr = data.split(",");
        System.out.println(Arrays.toString(arr));
        System.out.println(data.substring(5));
        for (String ele : arr) {
            System.out.println(ele.substring(0, 3).toUpperCase());
        }
        String st1 = "core Java";
        System.out.println(st1.substring(0, 4));
        System.out.println(st1.substring(4).trim());

    }
}
