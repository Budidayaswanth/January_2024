package org.Jan.jfs.day11;

public class MovieTickets {
    private String movie;
    private Day day;

    private double actualPrice = 200;
    private double discount = 0;
    private double extraPrice = 0;
    private double finalPrice = 0;

    public MovieTickets(String movie, Day day) {
        this.movie = movie;
        this.day = day;
    }
    public void showTicketPriceDetails(){
        System.out.println("You booked movie:"+movie+" on "+day);
        switch (day){
            case MONDAY:
                discount=actualPrice*0.10;
                finalPrice =actualPrice-discount;
                System.out.println("Actual price : "+actualPrice);
                System.out.println("Discount Price :"+discount);
                System.out.println("Final Price : "+finalPrice);
                System.out.println("You Saved : "+discount);
                break;
            case TUESDAY:
                discount =actualPrice*0.20;
                finalPrice=actualPrice-discount;
                System.out.println("Actual price : "+actualPrice);
                System.out.println("Discount Price :"+discount);
                System.out.println("Final Price : "+finalPrice);
                System.out.println("You Saved : "+discount);
                break;
            case WENDESDAY:
            case THRUESDAY:
                discount =actualPrice*0.05;
                finalPrice=actualPrice-discount;
                System.out.println("Actual price : "+actualPrice);
                System.out.println("Discount Price :"+discount);
                System.out.println("Final Price : "+finalPrice);
                System.out.println("You Saved : "+discount);
                break;
            case FRIDAY:
            case SATERDAY:
            case SUNDAY:
                extraPrice=actualPrice*0.10;
                finalPrice=actualPrice+extraPrice;
                System.out.println("Actual price : "+actualPrice);
                System.out.println("Discount Price :"+extraPrice);
                System.out.println("Final Price : "+finalPrice);
                System.out.println("You paid extra : "+extraPrice);
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
