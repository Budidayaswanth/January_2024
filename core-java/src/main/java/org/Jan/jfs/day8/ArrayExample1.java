package org.Jan.jfs.day8;

import java.util.Arrays;

public class ArrayExample1 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println("Size of the Array is :" + arr.length);
        System.out.println(Arrays.toString(arr));
        int[] arr1 = new int[5];
        int num = 10;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = num++;
            System.out.print(arr1[i]);
        }
        System.out.println(" ");
        System.out.println("-----------------------------");
        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.print(arr1[i]);
        }
        System.out.println(" ");
        // first 3 elements
        System.out.println("First 3 Elements ");
        for (int i = 0; i <= 2; i++) {
            System.out.println(arr[i]);
        }
        // last 3 elements
        System.out.println("Last 3 Elements");
        for (int i = arr.length - 3; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        //Multi Dimensional Array
        int[][] arr2 = new int[][]{{1, 2, 3, 4, 5}, {3, 4, 5, 6, 7}, {4, 8, 9, 11, 15}};
        for (int i = 0; i < arr2.length; i++) System.out.println(Arrays.toString(arr2[i]));
        System.out.println(arr2.length);
    }
}
