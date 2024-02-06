package org.Jan.jfs.day11;

import java.util.ArrayList;
import java.util.List;

public class QuizQuestions {
    public static void main(String[] args) {
        String s1 ="Krish";
        String s2 ="Krish";

        String s3= new String("Krish");
        String s4= new String("Krish");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);

        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));

        StringBuilder sb1= new StringBuilder("Krish");
        StringBuilder sb2= new StringBuilder("Krish");
        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));

        String data = "Java World";
        System.out.println(data.substring(0,4));
        System.out.println(data.substring(4).toUpperCase().trim().substring(0,2));

        rotateString("Hello",2);
        List<String> list = List.of(new String[]{"madam", "Rama", "level", "mom","deed","tiger","Rama","mom"});
       int count = countPalindromeString(list);
        System.out.println(count);
        List<String> string= FindUniqueName(list);
        System.out.println(string);
        String rotating =rotateString("hero",2);
        System.out.println(rotating);


    }
    public static String rotateString(String str,int n){
        if(str == null || str.isEmpty()){
            return str;
        }
        n=n%str.length();
        if(n<0){
            n+=str.length();
        }
        String rotating =str.substring(n)+str.substring(0,n);
        return rotating;
    }
    public static int countPalindromeString(List<String> list){
        int count =0;
        for(String str :list){
            if(isPalindrome(str)) {
                count++;
            }
        }
       return count;
    }
    public static boolean isPalindrome(String s){
        for (int i=0,j=s.length()-1;i<j;i++,j--){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }
    public static List<String> FindUniqueName(List<String> list){
        List<String> data =new ArrayList<>();
        for (String name :list){
            if(!data.contains(name)){
                data.add(name);
            }
        }
        return data;
    }
}
