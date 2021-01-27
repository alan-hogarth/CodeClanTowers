public class Booking {

    private Bedroom bedroom;
    private int stayDuration;

    public Booking(int stayDuration, Bedroom bedroom){
        this.bedroom = bedroom;
        this.stayDuration = stayDuration;
    }

    public int getStayDuration() {
        return this.stayDuration;
    }

    public Bedroom getBedroom() {
        return this.bedroom;
    }


    public int getTotalBill() {
        return this.stayDuration * bedroom.getRate();
    }
}
