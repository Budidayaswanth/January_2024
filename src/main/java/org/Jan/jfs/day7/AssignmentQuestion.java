package org.Jan.jfs.day7;

public class AssignmentQuestion {
    public static void main(String[] args) {
        int day =1;
        double billAmount = 10000;
        double discount = calDiscount(billAmount,day);
        double netAmount = billAmount -discount;
        System.out.println("Bill Amount "+billAmount);
        System.out.println(" Discount "+discount);
        System.out.println("Net Amount "+netAmount);

    }

    public static double calDiscount(double billAmount, int day) {
        double discount =0;
         switch (day){
            case 1 :
                System.out.println("Monday");
                discount= (billAmount-0.25);
                break;
            case 2:
                System.out.println("TuesDay");
                discount =(billAmount-2.0);
                break;
            case 3:
                System.out.println("Wednesday");
                discount =(billAmount-1.5);
                break;
            case 4,5:
                System.out.println("Thursday,Friday");
                discount=(billAmount-0.1);
                break;
            case 6,7:
                System.out.println("Saturday,Sunday");
                discount =(billAmount-0.05);
                break;
            default:
                System.out.println("Invalid Day");
        }
        return discount;
    }
}
