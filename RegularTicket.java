import com.company.Flight;
import com.company.Passenger;
import com.company.Ticket;

public class RegularTicket extends Ticket{
    private String specialServices;

    public RegularTicket(String SpecialServices, String pnr, Flight flight, Passenger passenger,
                         String departureDateTime, String arrivalDateTime,
                         String seatNo, float price, boolean cancelled, String departure, String destination){

        super(pnr,flight,passenger,departureDateTime,arrivalDateTime,seatNo,price,cancelled,departure,
                destination);

        this.specialServices=SpecialServices;
    }
    public String getSpecialServices(){
        return specialServices;
    }

    public void updateSpecialServices(String specialServices){
        this.specialServices=specialServices;
    }

}