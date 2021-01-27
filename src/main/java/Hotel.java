import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(String name) {
        this.name = name;
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int numberOfBedrooms() {
        return this.bedrooms.size();
    }

    public int numberOfConferenceRooms() {
        return this.conferenceRooms.size();
    }

    public void addGuestToBedroom(Guest cow, Bedroom bedroom) {
        if (bedroom.getGuests() < bedroom.getCapacity()){
            bedroom.addGuest(cow);
        }
    }

    public void addGuestToConference(Guest cow, ConferenceRoom conferenceRoom) {
        if (conferenceRoom.getGuests() < conferenceRoom.getCowpacity()){
            conferenceRoom.addGuest(cow);
        }
    }
}
