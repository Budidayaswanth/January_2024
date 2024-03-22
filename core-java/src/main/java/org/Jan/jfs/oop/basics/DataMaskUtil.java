package org.Jan.jfs.oop.basics;

public class DataMaskUtil {
    public static String MaskAccountNumber(long accNumber){
        String str =""+accNumber;
        if(str.length()<=4){
            return str;
        }
        else {
            String last4DigitsAccNumber =str.substring(str.length()-4);
            return "********" +last4DigitsAccNumber;
        }
    }
}
