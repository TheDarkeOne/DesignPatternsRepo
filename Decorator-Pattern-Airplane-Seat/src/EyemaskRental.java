public class EyemaskRental extends SeatAccessory{
    public EyemaskRental(Seat seat){this.seat = seat; }

    public String getDescription(){
        return seat.getDescription() + ", Eyemask";
    }

    public double cost(){
        return seat.cost() + 1.00;
    }
}
