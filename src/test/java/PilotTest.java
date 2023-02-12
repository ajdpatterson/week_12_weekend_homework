import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest{
    Pilot pilot1;
    Pilot pilot2;

    @Before
    public void before(){
        pilot1 = new Pilot("Airman Sam", RankType.CAPTAIN, "123456");
        pilot2 = new Pilot("BirdDog", RankType.FIRSTOFFICER, "654321");
    }

    @Test
    public void pilotHasName(){
        assertEquals("Airman Sam", pilot1.getName());
    }

    @Test
    public void pilotHasRank(){
        assertEquals(RankType.CAPTAIN, pilot1.getRank());
    }

    @Test
    public void pilotCanFly(){
        assertEquals("Wheee", pilot1.fly());
    }
}
