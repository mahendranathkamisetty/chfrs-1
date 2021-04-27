package com.company;

public class RegularTicket extends Ticket {
    private String specialServices;
    public static RegularTicket rt;

    public RegularTicket(String SpecialServices, String pnr, Flight flight, Passenger passenger,
                         String departureDateTime, String arrivalDateTime,
                         String seatNo, float price, boolean cancelled, String departure, String destination){

        super(pnr,flight,passenger,departureDateTime,arrivalDateTime,seatNo,price,cancelled,departure,destination);

        this.specialServices=SpecialServices;
    }
    public RegularTicket(){

    }
    public String getSpecialServices(){
        return specialServices;
    }

    public void updateSpecialServices(String specialServices){
        this.specialServices=specialServices;
    }

}