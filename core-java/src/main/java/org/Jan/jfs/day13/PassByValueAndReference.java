package org.Jan.jfs.day13;

import java.util.Arrays;

public class PassByValueAndReference {
    public static void main(String[] args) {
        int a = 12;
        int b = 11;
        swap(a, b);

        int[] arr = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        System.out.println("Before Increment : " + Arrays.toString(arr));
        increment(arr);
        System.out.println("After Increment : " + Arrays.toString(arr));
        swap(arr);
    }

    public static void swap(int a, int b) {
        System.out.println("Before Swapping Number A : " + a + " and Number B : " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping Number A : " + a + " and Number B : " + b);
    }

    public static void increment(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 1;
        }
    }

    public static void swap(int[] arr) {
        System.out.println("Before Swapping Arrays :"+Arrays.toString(arr));
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        System.out.println("Before Swapping Arrays : "+Arrays.toString(arr));
    }
}
