public class BlanketRental extends SeatAccessory{
    public BlanketRental(Seat seat){
        this.seat = seat;
    }

    public String getDescription(){
        return seat.getDescription() + ", Blanket";
    }

    public double cost(){
        return seat.cost() + 5.00;
    }
}
