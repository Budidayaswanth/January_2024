package org.Jan.jfs.day11;

public class MovieTicketManager {
    public static void main(String[] args) {
        MovieTickets tickets =new MovieTickets("rrr",Day.FRIDAY);
        tickets.showTicketPriceDetails();
        MovieTickets tickets1 =new MovieTickets("salaar",Day.MONDAY);
        tickets1.showTicketPriceDetails();
    }
}
