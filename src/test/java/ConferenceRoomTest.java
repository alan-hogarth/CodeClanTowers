import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom dairyStandUp;

    @Before
    public void before(){
        dairyStandUp = new ConferenceRoom("Dairy Stand Up", 3);
    }

    @Test
    public void hasName(){
        assertEquals("Dairy Stand Up", dairyStandUp.getName());
    }

    @Test
    public void hasCowpacity(){
        assertEquals(3, dairyStandUp.getCowpacity());
    }
}
