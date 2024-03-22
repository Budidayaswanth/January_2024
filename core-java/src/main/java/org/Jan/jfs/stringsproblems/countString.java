package org.Jan.jfs.stringsproblems;

public class countString {
    public static void main(String[] args) {
        // Find the String Length.
        String input = "java is Super";
        System.out.println(input.length());

        //Find the Words Length
        int words = input.split(" ").length;
        System.out.println(words);

        //Find the Character occurrence
        String S1 = "Hello World";
        int count = 0;
        for (int i = 0; i < S1.length(); i++) {
            char ch = S1.charAt(i);
            if (ch == 'l') {
                count++;
            }
        }
        System.out.println(count);

        //reversing the String

        String h1 = " Java is Super";
        for (int i = h1.length() - 1; i > 0; i--) {
            char ch = h1.charAt(i);
            System.out.print(ch);
        }
        System.out.println(" ");
        System.out.println("-".repeat(50));

        //Find to Removing the All Starting and ending  space from the String
        System.out.println(h1.trim());
        System.out.println("-".repeat(50));

//        // reversing the starting word and continues
//        for (int i = 0; i < h1.length(); i++) {
//            char ch = h1.charAt(i);
//            System.out.print(ch);
//
//        }
        int countUpperCase = 0;
        int countLowerCase = 0;
        int countDigits=0;
        int countSpecialChar =0;
        String s1="JavA5is&Su6%eR";
        for (char ch :s1.toCharArray()){
            if(Character.isDigit(ch)){
                countDigits++;
            }
            else if (Character.isUpperCase(ch)){
                countUpperCase++;
            }
            else if (Character.isLowerCase(ch)){
                countLowerCase++;
            }
            else if(!Character.isLetterOrDigit(ch)){
                countSpecialChar++;
            }
        }
        System.out.println("Count Of LowerCase are :" + countLowerCase);
        System.out.println("Count of Digits Are :" + countDigits);
        System.out.println("count of UpperCase  Are :" + countUpperCase);
        System.out.println("count of SpecialCase Are :"+ countSpecialChar);


        // change the odd words to UpperCase and Even Words to Reverse

        String s2 ="this is a test String !!";
        for (int i=0;i<s2.length();i++){
            if(i %2 ==0){
                System.out.println(s2.toUpperCase());
            }

        }
    }

}

