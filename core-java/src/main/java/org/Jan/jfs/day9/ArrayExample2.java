package org.Jan.jfs.day9;

import java.util.Arrays;

public class ArrayExample2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int[] arr1 ={3,5,7,8,9,3,4};
        int[] arr2 =MerageArr(arr,arr1);
        System.out.println(Arrays.toString(arr2));
    }
    private static int[] MerageArr(int[]arr,int[] arr1){
        int[] arr2 =new int[arr.length+arr1.length];
        System.arraycopy(arr,0,arr2,0,arr1.length);
        System.arraycopy(arr1,0,arr2,arr.length,arr1.length);
        return arr2;
    }
}
