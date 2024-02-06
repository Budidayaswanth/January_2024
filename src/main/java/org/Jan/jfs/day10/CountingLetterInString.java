package org.Jan.jfs.day10;

public class CountingLetterInString {
    public static void main(String[] args) {
        String name = "Budidha Yaswanth";
        int vowels = 0;
        int consonants = 0;
//Switch case
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
//            vowels = switch (ch) {
//                case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> vowels + 1;
//                default -> consonants++;
//            };
//
//        }
//        System.out.println("Vowels Count of a String is :" + vowels);
//        System.out.println("Consonants count of a String is :" + consonants);


//        //if conditions

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'I' || ch == 'E' || ch == 'O' || ch == 'U') {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                consonants++;
            }
            System.out.println("Vowels Count of a String is :" + vowels);
            System.out.println("Consonants count of a String is :" + consonants);
        }
    }
}