public class ExcessLuggagePerBag extends SeatAccessory{
    public ExcessLuggagePerBag(Seat seat){
        this.seat = seat;
    }

    public String getDescription(){
        return seat.getDescription() + ", 1 Extra Bag";
    }

    public double cost(){
        return seat.cost() + 75.00;
    }
}
