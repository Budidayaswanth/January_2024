package org.Java.di.javaConfig;

public class LinearSearch implements SearchTechniques{
    @Override
    public int Search(String[] arr, String ele) {
        int index =-1;
        for (int i=0;i<arr.length;i++){
            if(arr[i].equals(ele)){
                index =i;
                break;
            }
        }
        return index;
    }
}
