import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice = 0, choice2 = 0, amount = 0, amount2 = 0, amount3 = 0, amount4 = 0;
        Seat seat3 = null;
        boolean run = false, run2 = false;
        Scanner scanner = new Scanner(System.in);
        Seat seat1 = new EphraimToLAX();
        seat1 = new Wifi(seat1);
        seat1 = new BlanketRental(seat1);

        System.out.printf("%s $%.2f \n ", seat1.getDescription(), seat1.cost());

        Seat seat2 = new EphraimToLAX();
        seat2 = new Wifi(seat2);
        seat2 = new BlanketRental(new BlanketRental(new BlanketRental(seat2)));
        seat2 = new EyemaskRental(seat2);

        System.out.printf("%s $%.2f \n ", seat2.getDescription(), seat2.cost());
        do {
            System.out.println("Do you wish to book a flight?(choose the number you wish) 1.Yes 2.No");
            choice = scanner.nextInt();

            if(choice == 1){
                System.out.println("Where do you wish to go?(choose the number you wish) 1. SLC 2. LAX 0. Exit");
                choice = scanner.nextInt();

                if(choice == 1){
                    seat3 = new EphraimToSLC();
                }
                else if(choice == 2){
                    seat3 = new EphraimToLAX();
                }
                else{
                    run = false;
                }

                if(choice == 1 || choice == 2){
                    do {
                        System.out.println("What do you want to be added to your seat?(choose the number you wish to add) " +
                                "1. Blanket 2. 1 Drink 3. Extra Luggage 4. Eyemask Rental 5. Headphone Rental " +
                                "6. Live TV \n 7. Personal Parachute Rental 8. USB Charging port 9. Wifi 0. Finish");
                        choice2 = scanner.nextInt();

                        switch(choice2){
                            case 1:
                                seat3 = new BlanketRental(seat3);
                                run2 = true;
                                break;
                            case 2:
                                seat3 = new DrinkCoupon(seat3);
                                run2 = true;
                                break;
                            case 3:
                                seat3 = new ExcessLuggagePerBag(seat3);
                                run2 = true;
                                break;
                            case 4:
                                seat3 = new EyemaskRental(seat3);
                                run2 = true;
                                break;
                            case 5:
                                seat3 = new HeadphoneRental(seat3);
                                run2 = true;
                                break;
                            case 6:
                                if(amount == 0){
                                    amount++;
                                    seat3 = new LiveTV(seat3);
                                    run2 = true;
                                }
                                break;
                            case 7:
                                if(amount2 == 0){
                                    amount2++;
                                    seat3 = new PersonalParachuteRental(seat3);
                                    run2 = true;
                                }
                                break;
                            case 8:
                                if(amount3 == 0){
                                    amount3++;
                                    seat3 = new USBChargingPort(seat3);
                                    run2 = true;
                                }
                                break;
                            case 9:
                                if(amount4 == 0){
                                    amount4++;
                                    seat3 = new Wifi(seat3);
                                    run2 = true;
                                }
                                    break;
                            case 0:
                                run2 = false;
                        }
                    }while(run2 == true);

                System.out.printf("%s $%.2f \n ", seat3.getDescription(), seat3.cost());
                run = true;
                }
            }

            else
                run = false;
        }while(run == true);

    }
}
