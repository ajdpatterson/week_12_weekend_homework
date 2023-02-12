import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Passenger passenger5;


    @Before
    public void before(){
        passenger1 = new Passenger("John Smith", 2);
        passenger2 = new Passenger("Jane Smith", 1);
        passenger3 = new Passenger("Bill Smith", 3);
        passenger4 = new Passenger("Harry Smith", 1);
        passenger5 = new Passenger("Sarah Smith", 4);
    }

    @Test
    public void passengerHasAName(){
        assertEquals("John Smith", passenger1.getName());
    }

    @Test
    public void passengerHasBags(){
        assertEquals(2, passenger1.getBags());
    }

}


