public class PersonalParachuteRental extends SeatAccessory{
    public PersonalParachuteRental(Seat seat){
        this.seat = seat;
    }

    public String getDescription(){
        return seat.getDescription() + ", Parachute";
    }

    public double cost(){
        return seat.cost() + 25.00;
    }
}
