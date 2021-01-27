import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking;
    private Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(2, 2, "double", 90);
        booking = new Booking(3, bedroom);
    }

    @Test
    public void canGetTotalBill(){
        int total = booking.getTotalBill();
        assertEquals(270, total);

    }
}
