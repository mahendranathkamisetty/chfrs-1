package com.company;

import java.util.*;
public class Main {
    public static void main(String[] args) {

        Ticket t = new Ticket();
        TouristTicket tt = new TouristTicket();
        RegularTicket rt = new RegularTicket();
        rt.pnr = "SH768J986568975";
        tt.pnr = "FJS876534DUI900";

        Contact c = new Contact();
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Welcome to Indian Airline Reservation System");
        System.out.println("Enter Name:");
        c.name = sc1.nextLine();
        System.out.println("Enter Phone Number:");
        c.phone = sc1.nextLine();
        System.out.println("Enter Email id:");
        c.email = sc1.next();

        Address ad = new Address();
        System.out.println("Enter Address Details:");
        System.out.println("Enter Street:");
        ad.street = sc2.nextLine();
        System.out.println("Enter City:");
        ad.city = sc2.next();
        System.out.println("Enter State:");
        ad.state = sc2.next();
        System.out.println("Enter your Departure location and Destination location:");
        System.out.println("Enter From station:");
        t.departureDateTime = sc2.next();
        System.out.println("Enter To Station:");
        t.arrivalDateTime = sc2.next();

        Flight f = new Flight();
        System.out.println("We have 2 available airlines");
        System.out.println("select Indigo and AirIndia");
        f.flightNumber = "1234";
        f.capacity = 100;
        f.bookedSeats = 75;
        f.airline = sc2.next();
        System.out.println("Thanks for Selecting: " + f.airline + " Airlines");
        System.out.println();
        System.out.println("Your Flight number is:" + f.flightNumber + " & Capacity:" + f.capacity + " & Booked Seats: " + f.bookedSeats);
        System.out.println();
        System.out.println("your PNR is:" + rt.pnr);
    }
}