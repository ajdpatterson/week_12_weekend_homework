import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {
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


    @Before
    public void before(){
        pilot = new Pilot("Joe Jones", RankType.CAPTAIN, "098765");
        crewMember1 = new CabinCrewMember("Sally Sales", RankType.PURSER);
        crewMember2 = new CabinCrewMember("Billy Bones", RankType.FLIGHTATTENDANT);
        crewMember3 = new CabinCrewMember("Erica Erics", RankType.FLIGHTATTENDANT);
        crewMemberList = new ArrayList<>();
        //populate crewMemberList
        crewMemberList.add(crewMember1);
        crewMemberList.add(crewMember2);
        crewMemberList.add(crewMember3);
        passengersList = new ArrayList<>();
        plane = new Plane(PlaneType.BOEING123);
        flight = new Flight(pilot, crewMemberList, passengersList, plane, "ABC123", "LDN", "GLA", "20:20");
    }
    @Test
    public void flightHasCrewList(){
        assertEquals(3, crewMemberList.size());
    }

    @Test
    public void flightHasPilot(){
        assertEquals("Joe Jones", pilot.getName());
    }

    @Test
    public void flightHasEmptyPassengerList(){
        assertEquals(0, passengersList.size());
    }

    @Test
    public void flightHasCapacity(){
        assertEquals(5, plane.getCapacity());
    }

    @Test
    public void flightCanAddPassenger(){
        flight.bookPassenger(passenger1);
        assertEquals(1, passengersList.size());
    }

}
