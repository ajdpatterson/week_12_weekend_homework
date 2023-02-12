import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {
    FlightManager flightManager;
    private ArrayList<Passenger> passengerList;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Pilot pilot;
    private Plane plane;
    private ArrayList<CabinCrewMember> crewMemberList;
    private CabinCrewMember crewMember1;
    private CabinCrewMember crewMember2;
    private CabinCrewMember crewMember3;
    private Flight flight;

    @Before
    public void before(){
        flightManager = new FlightManager();
        passenger1 = new Passenger("Andrew", 2);
        passenger2 = new Passenger("Bill", 1);
        passenger3 = new Passenger("Joan", 1);
        passengerList = new ArrayList<>();
        passengerList.add(passenger1);
        passengerList.add(passenger2);
        passengerList.add(passenger3);
        pilot = new Pilot("Joe Jones", RankType.CAPTAIN, "098765");
        crewMemberList = new ArrayList<>();
        crewMember1 = new CabinCrewMember("Sally Sales", RankType.PURSER);
        crewMember2 = new CabinCrewMember("Billy Bones", RankType.FLIGHTATTENDANT);
        crewMember3 = new CabinCrewMember("Erica Erics", RankType.FLIGHTATTENDANT);
        crewMemberList.add(crewMember1);
        crewMemberList.add(crewMember2);
        crewMemberList.add(crewMember3);
        plane = new Plane(PlaneType.BOEING123);
        flight = new Flight(pilot, crewMemberList, passengerList, plane, "ABC123", "LDN", "GLA", "20:20");
    }

    @Test
    public void canGetBaggageWeight(){
        assertEquals(4, flightManager.getBaggageWeight(flight));
    }

    @Test
    public void canGetRemainingHoldSpace(){
        assertEquals(1, flightManager.getRemainingSpace(flight));
    }


}

