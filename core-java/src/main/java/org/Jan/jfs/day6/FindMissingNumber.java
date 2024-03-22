package org.Jan.jfs.day6;

public class FindMissingNumber {

    public static void main(String[] args) {
        int[] arr = { 10, 11, 12, 13, 14, 15, 16, 18, 19, 20 };
        int num = findMissingNumber(arr);
        System.out.println("Missing number is: " + num);
    }

    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1; // One number is missing, so the length is n-1
        int expectedSum = n * (n + 1) / 2; // Sum of the series 1 to n

        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}
