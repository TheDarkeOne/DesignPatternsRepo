public class Wifi extends SeatAccessory{
    public Wifi(Seat seat){
        this.seat = seat;
    }

    public String getDescription(){
        return seat.getDescription() + ", Wifi";
    }

    public double cost(){
        return seat.cost() + 7.00;
    }
}
