public class DrinkCoupon extends SeatAccessory {
    public DrinkCoupon(Seat seat){
        this.seat = seat;
    }

    public String getDescription(){
        return seat.getDescription() + ", Drink";
    }

    public double cost(){
        return seat.cost() + 4.00;
    }
}
