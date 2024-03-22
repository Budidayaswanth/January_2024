package org.Jan.jfs.stringsproblems;

import java.util.Scanner;

public class CountOfVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String Name = sc.nextLine();
        int VowelCount = 0;
        int ConsonantsCount = 0;
        Name = Name.toLowerCase();
        for (int i = 0; i < Name.length(); i++) {
            char ch = Name.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                VowelCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                ConsonantsCount++;
            }
        }
        System.out.println("VowelsCount is : " + VowelCount);
        System.out.println("Consonants Count is : " + ConsonantsCount);

    }
}
