import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane1;
    Plane plane2;
    Plane plane3;

    @Before
    public void before(){
        plane1 = new Plane(PlaneType.BOEING747);
        plane2 = new Plane(PlaneType.BOEING757);
        plane3 = new Plane(PlaneType.BOEING123);
    }

    @Test
    public void planeHasCapacity(){
        assertEquals(100, plane1.getCapacity());
    }

    @Test
    public void planeHasWeight(){
        assertEquals(100, plane1.getWeight());
    }

}
