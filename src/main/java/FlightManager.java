import java.util.ArrayList;

public class FlightManager {
//    private ArrayList<Passenger> passengerList;
//
//    public FlightManager(ArrayList<Passenger> passengerList) {
//        this.passengerList = passengerList;
//    }


    public int getBaggageWeight(Flight flight){
        int total = 0;
        for (Passenger passenger : flight.getPassengersList()){
            total += passenger.getBags();
        }
        return total;

    }

    public int getRemainingSpace(Flight flight) {
        return PlaneType.BOEING123.getCapacity() - getBaggageWeight(flight);
    }
}
