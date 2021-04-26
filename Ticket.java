package com.company;

public abstract class Ticket {
    private String pnr;
    private com.company.Flight flight;
    private String departureDateTime;
    private String arrivalDateTime;
    private com.company.Passenger passenger;
    private String seatNo;
    private float price;
    private boolean cancelled;
    private String departure;
    private String destination;

    public Ticket(String pnr, com.company.Flight flight, com.company.Passenger passenger, String departureDateTime, String arrivalDateTime,
                  String seatNo, float price, boolean cancelled, String departure, String destination){

        this.pnr=pnr;
        this.flight=flight;
        this.passenger=passenger;
        this.departureDateTime=departureDateTime;
        this.arrivalDateTime=arrivalDateTime;
        this.seatNo=seatNo;
        this.price=price;
        this.cancelled=cancelled;
        this.departure=departure;
        this.destination=destination;
    }

    public String checkStatus(){
        if(cancelled==false){
            return "Ticket Booked";
        }
        else {
            return "Ticket cancelled";
        }
    }

    public void cancel(){
        this.cancelled=true;
    }

    public String getSeatNo(){
        return seatNo;
    }

    public void setSeatNo(String seatNo){
        this.seatNo=seatNo;
    }

    public String getPnr(){
        return pnr;
    }
}