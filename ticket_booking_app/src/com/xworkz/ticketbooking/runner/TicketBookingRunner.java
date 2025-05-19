package com.xworkz.ticketbooking.runner;

import com.xworkz.ticketbooking.things.TicketBookingDetails;
public class TicketBookingRunner {
    public static void main(String[] args) {
        TicketBookingDetails bookingDetails = new TicketBookingDetails();
        bookingDetails.name = "nandini";
        bookingDetails.contactNumber = 8867466572L;
        bookingDetails.email = "hdahdv@gmail.com";
        bookingDetails.ticketPrice = 120;
        bookingDetails.numberOfSeats = 50;
        System.out.println("name is:"+bookingDetails.name);
        System.out.println("contact number is:"+bookingDetails.contactNumber);
        System.out.println("email:"+bookingDetails.email);
        System.out.println("Ticket price:"+bookingDetails.ticketPrice);
        System.out.println("number of seats:"+bookingDetails.numberOfSeats);
    }
}
