package classes;

public class Airline{
    private int airlineID;
    private String airlineName;
    private String Country; 

    public Airline(int airlineID, String airlineName, String country){
        this.setAirlineID(airlineID);
        this.setAirlineName(airlineName);
        this.setCountry(country);
        
    }

    public int getAirlineID() {
        return airlineID;
    }

    public void setAirlineID(int airlineID) {
        this.airlineID = airlineID;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getCountry() {
        return Country ; 
    }

    public void setCountry(String country) {
        this.Country = country; 
    }

}