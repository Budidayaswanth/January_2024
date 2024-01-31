package org.Jan.jfs.day7;

public class NumberCommonQuestions {
    public static void main(String[] args) {
int num=1;
        System.out.println("The sum of "+num+" is "+sumDigits(num));
        System.out.println("The reverse of "+num+" is "+reverseOfNumber(num));
        System.out.println("The palindrome of "+num+" is "+palindrome(num));
    }
    public static int sumDigits (int n){
        int sum =0;
        while (n !=0){
            int r =n %10;
            sum +=r;
            n /=10;
        }
        return sum;
    }
    public static int reverseOfNumber(int n){
        int rev =0;
        while (n!=0){
            int r =n%10;
            rev =rev *10 +r;
            n /=10;
        }
        return rev;
    }
    public static boolean palindrome(int n){
        return n == reverseOfNumber(n);
    }
    public static int sumOfTheDigitsUntilSingleDigit(int n){
return 0;
    }
}
