import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel cowClanCowers;
    private Guest horny;
    private Guest randy;
    private Guest ram;
    private Guest serious;
    private Bedroom bedroom;
    private ConferenceRoom conferenceRoom;
    private Booking booking;

    @Before
    public void before(){
        cowClanCowers = new Hotel("Cow Clan Cowers");
        horny = new Guest("Horny");
        randy = new Guest("randy");
        ram = new Guest("ram");
        serious = new Guest("Serious");
        bedroom = new Bedroom(1, 2, "double", 50);
        conferenceRoom = new ConferenceRoom("Cowference Room", 3);
    }

    @Test
    public void hasName(){
        assertEquals("Cow Clan Cowers", cowClanCowers.getName());
    }

    @Test
    public void testBedroomsStartAt0(){
        assertEquals(0, cowClanCowers.numberOfBedrooms());
    }
    @Test
    public void testConferenceRoomsStartAt0(){
        assertEquals(0, cowClanCowers.numberOfConferenceRooms());
    }

    @Test
    public void testCanAddGuestToBedroom(){
        cowClanCowers.addGuestToBedroom(horny, bedroom);
        assertEquals(1, bedroom.getGuests());
    }

    @Test
    public void cantAddGuestToBedroomIfCapacity(){
        cowClanCowers.addGuestToBedroom(horny, bedroom);
        cowClanCowers.addGuestToBedroom(randy, bedroom);
        cowClanCowers.addGuestToBedroom(ram, bedroom);
        assertEquals(2, bedroom.getGuests());
    }

    @Test
    public void testCanAddGuestToConferenceRoom(){
        cowClanCowers.addGuestToConference(horny, conferenceRoom);
        assertEquals(1,conferenceRoom.getGuests());
    }

    @Test
    public void cantAddGuestToConferenceRoomIfCapacity(){
        cowClanCowers.addGuestToConference(horny, conferenceRoom);
        cowClanCowers.addGuestToConference(randy, conferenceRoom);
        cowClanCowers.addGuestToConference(ram, conferenceRoom);
        cowClanCowers.addGuestToConference(serious, conferenceRoom);
        assertEquals(3, conferenceRoom.getGuests());
    }

    @Test
    public void canAddBooking(){
        Booking newBooking = cowClanCowers.bookRoom(bedroom, 3);
        assertEquals(3, newBooking.getStayDuration());
        assertEquals(bedroom, newBooking.getBedroom());
    }
}
