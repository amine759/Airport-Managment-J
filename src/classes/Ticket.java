package classes;

public class Ticket {
    private int ticketId;
    private int flightId;
    private int airplaneId ;
    private int AirlineId ; 
    private double Price;


    public void Ticket(int ticketId, int flightId, double Price) {
        this.setTicket(ticketId);
        this.setFlightID(flightId);
        this.setPrice(Price);
    }   

    public int getTicketId() {
        return ticketId;
    }

    public void setTicket(int ticketId) {
        this.ticketId = ticketId;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public int getFlightID(){
        return flightId; //
    }
    
    public void setFlightID(int flightID) {
        this.flightId = flightId ;
    }

}
