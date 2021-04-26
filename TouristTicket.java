import com.company.Flight;
import com.company.Passenger;
import com.company.Ticket;

public class TouristTicket extends Ticket{
    private String hotelAddress;
    public String [] selectedTouristLocation = new String[5];

    public TouristTicket(String hotelAddress, String pnr, Flight flight, Passenger passenger,
                         String departureDateTime, String arrivalDateTime,
                         String seatNo, float price, boolean cancelled, String departure, String destination,
                         String [] selectedTouristLocation){

        super(pnr,flight,passenger,departureDateTime,arrivalDateTime,seatNo,
                price,cancelled,departure,destination);

        this.hotelAddress=hotelAddress;
        this.selectedTouristLocation=selectedTouristLocation;
    }
    public String getHotelAddress(){
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress){
        this.hotelAddress=hotelAddress;
    }
    public String [] getTouristLocations(){
        return selectedTouristLocation;
    }

    public void addTouristLocations(String location){

        int range= selectedTouristLocation.length;
        selectedTouristLocation[range-1]=location;
    }
}
