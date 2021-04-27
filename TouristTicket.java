package com.company;

public class TouristTicket extends Ticket{
    public String hotelAddress;
    public String [] selectedTouristLocation = new String[5];

    public TouristTicket(String hotelAddress, String [] selectedTouristLocation){

        /*super(pnr,flight,passenger,departureDateTime,arrivalDateTime,seatNo,
                price,cancelled,departure,destination);*/

        this.hotelAddress=hotelAddress;
        this.selectedTouristLocation=selectedTouristLocation;
    }
    public TouristTicket(){

    }
    public String getHotelAddress(){
        return hotelAddress;
    }

    //public void setHotelAddress(String hotelAddress){
      //  this.hotelAddress=hotelAddress;
    //}
    public String [] getTouristLocations(){
        return selectedTouristLocation;
    }
    public String[] removeTouristLocation(){
        return selectedTouristLocation;
    }
    public void addTouristLocations(String location){
        int range= selectedTouristLocation.length;
        selectedTouristLocation[range-1]=location;
    }
}
