import java.util.ArrayList;

public abstract class FlightManager {
    Flight flight;
    Passenger passenger;
    ArrayList<Passenger> passengersList;

    public FlightManager(Flight flight, ArrayList<Passenger> passengersList) {
        this.flight = flight;
        this.passengersList = passengersList;
    }

    public int getWeight() {
        int total =0;
        for (Passenger passenger : this.passengersList){
            total += passenger.getBags();
        }
        return total;
    }
}
