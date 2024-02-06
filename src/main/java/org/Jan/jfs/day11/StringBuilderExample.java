package org.Jan.jfs.day11;

public class StringBuilderExample {
    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("core java"));
    }
    public static boolean isPalindrome(String str){
        return new StringBuilder(str).reverse().toString().equals(str);
    }
}
