import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    CabinCrewMember cabinCrewMember3;
    CabinCrewMember cabinCrewMember4;
    CabinCrewMember cabinCrewMember5;

    @Before
    public void before(){
        cabinCrewMember1 = new CabinCrewMember("Billy Bones", RankType.FIRSTOFFICER);
        cabinCrewMember2 = new CabinCrewMember("Jeff Bezos", RankType.PURSER);
        cabinCrewMember3 = new CabinCrewMember("Nora OBrien", RankType.FLIGHTATTENDANT);
        cabinCrewMember4 = new CabinCrewMember("Ruairidh Patterson", RankType.CAPTAIN);
        cabinCrewMember5 = new CabinCrewMember("Alan Patterson", RankType.FLIGHTATTENDANT);
    }
    @Test
    public void crewMemberHasName(){
        assertEquals("Billy Bones", cabinCrewMember1.getName());
    }

    @Test
    public void crewMemberHasRank(){
        assertEquals(RankType.FIRSTOFFICER, cabinCrewMember1.getRank());
    }

    @Test
    public void cabinMemberCanSqualk(){
        assertEquals("We're going to crash!", cabinCrewMember1.squalk());
    }
}
