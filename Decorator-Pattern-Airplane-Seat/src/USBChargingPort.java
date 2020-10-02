public class USBChargingPort extends SeatAccessory {
    public USBChargingPort(Seat seat){
        this.seat = seat;
    }

    public String getDescription(){
        return seat.getDescription() + ", USB Charging Port";
    }

    public double cost(){
        return seat.cost() + 1.00;
    }
}
