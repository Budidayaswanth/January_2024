package org.Jan.jfs.day10;

import java.util.Arrays;

public class StringCommonQuestions {
    public static void main(String[] args) {
        String name = "CAT";
        String name1 = "ACT";
        String name2 = "EAT";
        String name3 = "TEA";
        System.out.println(isAnagram(name, name1));
        System.out.println(isAnagram(name1, name2));
        System.out.println(isAnagram(name2, name3));
        System.out.println(isAnagram(name3, name));
        System.out.println(isAnagram(name3, name2));

        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("madams"));

        System.out.println(countWords(new String[]{"java", "is", "java", "is"}, "java"));
        System.out.println(countWords(new String[]{"java", "is", "java", "is"}, "is"));

    }

    private static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    private static boolean isPalindrome(String str) {
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    private static int countWords(String[] arr, String key) {
        int count = 0;
        for (String ele : arr) {
            if (ele.equals(key)) {
                count++;
            }
        }
        return count;
    }
}

