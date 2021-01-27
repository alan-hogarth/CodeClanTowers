import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom room1;
    private Guest shirley;

    @Before
    public void before(){
        room1 = new Bedroom(1, 2, "double", 60);
        shirley = new Guest("shirley");
    }

    @Test
    public void hasRoomNumber() {
        assertEquals(1, room1.getRoomNumber());
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, room1.getCapacity());
    }

    @Test
    public void hasType(){
        assertEquals("double", room1.getRoomType());
    }

    @Test
    public void canAddGuest(){
        room1.addGuest(shirley);
        assertEquals(1, room1.getGuests());
    }
}


