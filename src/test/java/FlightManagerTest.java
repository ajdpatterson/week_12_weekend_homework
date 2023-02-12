import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {
    FlightManager flightManager;
    private Flight flight;
    private Pilot pilot;
    private Plane plane;
    private ArrayList<CabinCrewMember> crewMemberList;
    private CabinCrewMember crewMember1;
    private CabinCrewMember crewMember2;
    private CabinCrewMember crewMember3;
    private ArrayList<Passenger> passengersList;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;

    @Before
    public void before(){
        passenger1 = new Passenger("Hilly Billy", 1);
        passenger2 = new Passenger("Andrew Patterson", 3);
        passenger3 = new Passenger("Bobby Bobs", 2);
        passengersList = new ArrayList<>();
        crewMemberList = new ArrayList<>();
        pilot = new Pilot("Jimmy Jones", RankType.CAPTAIN, "345676");
        passengersList.add(passenger1);
        passengersList.add(passenger2);
        passengersList.add(passenger3);
        flight = new Flight(pilot, crewMemberList, passengersList, plane, "ABC123", "LDN", "GLA", "20:20");
    }

    @Test
    public void flightManagerCalculateReserveWeight(){
        assertEquals(6, flightManager.getWeight());
    }
}
