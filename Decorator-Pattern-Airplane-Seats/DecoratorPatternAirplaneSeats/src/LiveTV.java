public class LiveTV extends SeatAccessory{
    public LiveTV(Seat seat){
        this.seat = seat;
    }

    public String getDescription(){
        return seat.getDescription() + ", Live TV";
    }

    public double cost(){
        return seat.cost() + 3.00;
    }
}
