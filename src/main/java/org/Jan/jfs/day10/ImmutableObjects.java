package org.Jan.jfs.day10;

public class ImmutableObjects {
    public static void main(String[] args) {
        String name = "Yash ";
        String name1 = "Yash";

        System.out.println(name1.concat("wanth"));
        System.out.println(name);
        System.out.println(name1);

        String s1 = "core";
        String s2 = "core java";
        String s3 = s1.concat("java");
        String s4 = s1 + "java";

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);
        System.out.println(s3 == s4);
        System.out.println(s2 == s4);
        System.out.println(s2.equals(s3));
        System.out.println(s2.equals(s4));
    }
}
