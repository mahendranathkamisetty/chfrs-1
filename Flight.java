package com.company;

public class Flight {
    public String flightNumber;
    public String airline;
    public int capacity;

    private int bookedSeats;
    public Flight(String flightNumber,String airline,int capacity){
        this.flightNumber=flightNumber;
        this.airline=airline;
        this.capacity=capacity;
    }

    public String getFlightDetails(){
           return (flightNumber+" "+airline+" "+capacity);
    }
    public boolean checkAvailability(){
        return false;
    }
    public void incrementBookingCounter(){

    }
}
