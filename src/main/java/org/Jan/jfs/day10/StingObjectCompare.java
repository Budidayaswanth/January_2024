package org.Jan.jfs.day10;

public class StingObjectCompare {
    public static void main(String[] args) {
        String name = "yash";
        String name1 = "Yash";
        String name2 = new String("yash");
        String name3 = new String("Yash");

        System.out.println(name == name1);
        System.out.println(name == name2);
        System.out.println(name == name3);
        System.out.println(name1 == name);
        System.out.println(name1 == name2);
        System.out.println(name1 == name3);
        System.out.println(name2 == name);
        System.out.println(name2 == name1);
        System.out.println(name2 == name3);
        System.out.println(name3 == name);
        System.out.println(name3 == name1);
        System.out.println(name1 == name2);
        System.out.println("-".repeat(100));

        System.out.println(name.equals(name1));
        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));
        System.out.println(name1.equals(name));
        System.out.println(name1.equals(name2));
        System.out.println(name1.equals(name3));
        System.out.println(name2.equals(name));
        System.out.println(name2.equals(name1));
        System.out.println(name2.equals(name3));
        System.out.println(name3.equals(name));
        System.out.println(name3.equals(name1));
        System.out.println(name3.equals(name2));
    }
}
