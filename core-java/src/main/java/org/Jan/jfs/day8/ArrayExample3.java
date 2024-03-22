package org.Jan.jfs.day8;

import java.util.Arrays;


public class ArrayExample3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean res = isAllElementPresent(arr, 3, 2, 4);
        System.out.println(res);
        res = isAllElementPresent(arr, 1, 2, 10);
        System.out.println(res);

        int big = biggestElement(arr);
        System.out.println("Biggest Of the Array is : " + big);

        int small = smallestElement(arr);
        System.out.println("Smallest Of the Array is : " + small);

        int[] prime = getPrimeNumber(arr);
        System.out.println("Prime Numbers are :" + Arrays.toString(prime));

        int n = 3;
        int[] Divisible = divisibleBy(arr, n);
        System.out.println("Divisible Number are :" + Arrays.toString(Divisible));

        int[] FirstNNumbers = getFirstNElements(arr, n);
        System.out.println("First N Numbers Are :" + Arrays.toString(FirstNNumbers));

        int[] LastNNumbers = getLastNElements(arr, n);
        System.out.println("Last N Numbers Are :" + Arrays.toString(LastNNumbers));
    }

    private static boolean isAllElementPresent(int[] arr, int ele1, int ele2, int ele3) {
        return isPresent(arr, ele1) && isPresent(arr, ele2) && isPresent(arr, ele3);
    }

    private static boolean isPresent(int[] arr, int ele) {
        for (int value : arr) {
            if (value == ele) {
                return true;
            }
        }
        return false;
    }

    private static int biggestElement(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private static int smallestElement(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        return min;
    }

    private static int[] getPrimeNumber(int[] arr) {
        int[] prime = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                prime[count++] = arr[i];
            }
        }

        int[] value = new int[count];
        System.arraycopy(prime, 0, value, 0, count);
        return value;
    }


//    private static boolean isPrime(int num) {
//        if (num < 2) {
//            return false;
//        }
//        if (num % 2 == 0 && num != 2) {
//            return false;
//        }
//        for (int i = 2; i < num / 2; i++) {
//            if (num % i == 0) {
//                return false;
//            }
//        }
//        return true;
   /* if(count == 2){
        arr[i]=" prime ";
    }
        else {
        arr[i]=" Not Prime ";
    }*/
//    }

    private static int[] divisibleBy(int[] arr, int num) {
        int count = 0;
        for (int value : arr) {
            if (value % num == 0) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int value : arr) {
            if (value % num == 0) {
                result[index++] = value;
            }
        }
        return result;
    }

    private static int[] getFirstNElements(int[] arr, int n) {
        if (n > arr.length) {
            return arr;
        }
        int[] result = new int[n];
        System.arraycopy(arr, 0, result, 0, n);
        return result;
    }

    private static int[] getLastNElements(int[] arr, int n) {
        if (n > arr.length) {
            return arr;
        }
        int[] result = new int[n];
        System.arraycopy(arr, arr.length - n, result, 0, n);
        return result;
    }

}
