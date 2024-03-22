package org.Jan.jfs.day10;

public class StringExampleOccurrence {
    public static void main(String[] args) {

        String data ="It is a Java programming platform. It includes Java programming APIs such as java .lang, java .io, java .net, java .util, java .sql, java .math etc.";
        String key ="Java";
        String[] arr =data.split(" ");
        int count =0;
        for (String ele : arr){
            if(ele.equalsIgnoreCase(key)){
                count++;
            }
        }
        System.out.println("the Word "+key+" Occurred "+ count+" times");
    }
}
