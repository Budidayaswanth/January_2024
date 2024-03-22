package org.Jan.jfs.day8;

import java.util.Arrays;

public class ArrayExample5 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 3, 6};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int[] arr1 = {1, 3, 4, 5, 6};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.equals(arr, arr1));
    }
}
