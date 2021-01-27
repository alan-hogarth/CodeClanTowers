import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom dairyStandUp;
    private Guest cowsandra;

    @Before
    public void before(){
        dairyStandUp = new ConferenceRoom("Dairy Stand Up", 3);
        cowsandra = new Guest("cowsandra");
    }

    @Test
    public void hasName(){
        assertEquals("Dairy Stand Up", dairyStandUp.getName());
    }

    @Test
    public void hasCowpacity(){
        assertEquals(3, dairyStandUp.getCowpacity());
    }

    @Test
    public void canAddGuest(){
        dairyStandUp.addGuest(cowsandra);
        assertEquals(1, dairyStandUp.getGuests());
    }
}
