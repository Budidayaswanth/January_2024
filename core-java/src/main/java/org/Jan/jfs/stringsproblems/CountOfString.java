package org.Jan.jfs.stringsproblems;

public class CountOfString {
    public static void main(String[] args) {
        String s = "I am in Bangalore my house number is 6 and my phone no. 9632133889";

        int countLetters = 0;
        int countWhiteSpaces = 0;
        int countDigits = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                countLetters++;
            } else if (Character.isDigit(ch)) {
                countDigits++;
            } else if (Character.isWhitespace(ch)) {
                countWhiteSpaces++;
            }
        }
        System.out.println("Count Of Letters are :" + countLetters);
        System.out.println("Count of Digits Are :" + countDigits);
        System.out.println("count of WhiteSpaces Are :" + countWhiteSpaces);

    }
}
