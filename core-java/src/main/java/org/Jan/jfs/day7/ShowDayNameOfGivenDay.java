package org.Jan.jfs.day7;

public class ShowDayNameOfGivenDay {
    public static void main(String[] args) {
        int day =3;
        String res=getDayName(day);
        System.out.println("The Day Name for "+day+" is "+res);
    }
    public static String getDayName(int day){
        String res =" ";
        switch (day){
            case 1:
                res="Monday";
                break;
            case 2:
                res ="Tuesday";
                break;
            case 3:
                res="Wednesday";
                break;
            case 4:
                res="Thursday";
                break;
            case 5:
               res="FriDay";
                break;
            case 6:
                res="Saturday";
                break;
            case 7:
               res="Sunday";
                break;
            default:
                res="Invalid Day";
        }
        return res;
    }
    public String getDayNameExp(int day){
        return switch (day){
            case 1->"Monday";
            case 2->"tuesday";
            case 3->"wednesday";
            case 4->"Thursday";
            case 5->"Friday";
            case 6->"Saturday";
            case 7->"Sunday";
            default -> "Invalid Day";
        };
    }
}
