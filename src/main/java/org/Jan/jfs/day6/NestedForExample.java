package org.Jan.jfs.day6;

public class NestedForExample {
    public static void main(String[] args) {
        int[][] arr=new int[][]{{1,2,3,4},{2,5,6,8},{3,5,7,9}};
        for (int i=0;i<2;i++){
            for (int j=0;j <4;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}
