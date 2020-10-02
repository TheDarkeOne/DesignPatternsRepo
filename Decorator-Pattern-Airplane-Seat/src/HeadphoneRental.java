public class HeadphoneRental extends SeatAccessory{
    public HeadphoneRental(Seat seat){
        this.seat = seat;
    }

    public String getDescription(){
        return seat.getDescription() + ", Headphones";
    }

    public double cost(){
        return seat.cost() + 2.00;
    }
}
