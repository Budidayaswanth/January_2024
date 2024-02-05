package org.Jan.jfs.day8;

import java.util.Arrays;

public class ArrayExample6 {
    public static void main(String[] args) {
        String s1 = "EAT";
        String s2 = "BAT";
        String s3 = "TEA";

        System.out.println(s1 + " and " + s2 + " are anagram ?" + isAnagram(s1, s2));
        System.out.println(s1 + " and " + s3 + " are anagram ?" + isAnagram(s1, s3));
    }

    private static boolean isAnagram(String s1, String s2) {
        char[] arr = s1.toCharArray();
        char[] arr1 = s2.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        return Arrays.equals(arr, arr1);
    }
}
