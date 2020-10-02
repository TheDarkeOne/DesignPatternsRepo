import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int choice, choice2;
    Beverage.Size size = Beverage.Size.Venti;
    boolean run = false, run2 = false;

    Scanner scanner = new Scanner(System.in);

    Beverage beverage = new Espresso();
	    do {
            System.out.println("What size do you want your beverage to be? 1. Tall, 2. Grande, 3. Venti?");
            choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println(choice);
                beverage.setSize(Beverage.Size.Tall);
                size = Beverage.Size.Tall;
                run = false;
            } else if (choice == 2) {
                System.out.println(choice);
                beverage.setSize(Beverage.Size.Grande);
                size = Beverage.Size.Grande;
                run = false;
            } else if (choice == 3) {
                System.out.println(choice);
                beverage.setSize(Beverage.Size.Venti);
                size = Beverage.Size.Venti;
                run = false;
            } else {
                System.out.println("Invalid Choice");
                run = true;
            }
        }while(run == true);

	    do {
            System.out.println("What do you want to add to the Drink? " +
                    "1. Mocha 2. Pumpkin Spice 3. Soy 4. Steamed Milk 5. Whipped cream 0. Finish");
            choice2 = scanner.nextInt();

            switch(choice2){
                case 1:
                    beverage = new Mocha(beverage);
                    run2 = true;
                    break;
                case 2:
                    beverage = new PumpkinSpice(beverage);
                    run2 = true;
                    break;
                case 3:
                    beverage = new Soy(beverage);
                    run2 = true;
                    break;
                case 4:
                    beverage = new SteamedMilk(beverage);
                    run2 = true;
                    break;
                case 5:
                    beverage = new Whip(beverage);
                    run2 = true;
                    break;
                case 0:
                    run2 = false;
            }
        }while(run2 == true);
        System.out.printf("%s %s $%.2f \n ", size, beverage.getDescription(), beverage.cost());

        Beverage beverage2 = new DarkRoast();
        do {
            System.out.println("What size do you want your beverage to be? 1. Tall, 2. Grande, 3. Venti?");
            choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println(choice);
                beverage2.setSize(Beverage.Size.Tall);
                size = Beverage.Size.Tall;
                run = false;
            } else if (choice == 2) {
                System.out.println(choice);
                beverage2.setSize(Beverage.Size.Grande);
                size = Beverage.Size.Grande;
                run = false;
            } else if (choice == 3) {
                System.out.println(choice);
                beverage2.setSize(Beverage.Size.Venti);
                size = Beverage.Size.Venti;
                run = false;
            } else {
                System.out.println("Invalid Choice");
                run = true;
            }
        }while(run == true);

        run2 = true;
        do {
            System.out.println("What do you want to add to the Drink? " +
                    "1. Mocha 2. Pumpkin Spice 3. Soy 4. Steamed Milk 5. Whipped cream 0. Finish");
            choice2 = scanner.nextInt();

            switch(choice2){
                case 1:
                    beverage = new Mocha(beverage);
                    run2 = true;
                    break;
                case 2:
                    beverage = new PumpkinSpice(beverage);
                    run2 = true;
                    break;
                case 3:
                    beverage = new Soy(beverage);
                    run2 = true;
                    break;
                case 4:
                    beverage = new SteamedMilk(beverage);
                    run2 = true;
                    break;
                case 5:
                    beverage = new Whip(beverage);
                    run2 = true;
                    break;
                case 0:
                    run2 = false;
            }
        }while(run2 == true);
        System.out.println(size + " " + beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        do {
            System.out.println("What size do you want your beverage to be? 1. Tall, 2. Grande, 3. Venti?");
            choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println(choice);
                beverage3.setSize(Beverage.Size.Tall);
                size = Beverage.Size.Tall;
                run = false;
            } else if (choice == 2) {
                System.out.println(choice);
                beverage3.setSize(Beverage.Size.Grande);
                size = Beverage.Size.Grande;
                run = false;
            } else if (choice == 3) {
                System.out.println(choice);
                beverage3.setSize(Beverage.Size.Venti);
                size = Beverage.Size.Venti;
                run = false;
            } else {
                System.out.println("Invalid Choice");
                run = true;
            }
        }while(run == true);

        run2 = true;
        do {
            System.out.println("What do you want to add to the Drink? " +
                    "1. Mocha 2. Pumpkin Spice 3. Soy 4. Steamed Milk 5. Whipped cream 0. Finish");
            choice2 = scanner.nextInt();

            switch(choice2){
                case 1:
                    beverage = new Mocha(beverage);
                    run2 = true;
                    break;
                case 2:
                    beverage = new PumpkinSpice(beverage);
                    run2 = true;
                    break;
                case 3:
                    beverage = new Soy(beverage);
                    run2 = true;
                    break;
                case 4:
                    beverage = new SteamedMilk(beverage);
                    run2 = true;
                    break;
                case 5:
                    beverage = new Whip(beverage);
                    run2 = true;
                    break;
                case 0:
                    run2 = false;
            }
        }while(run2 == true);
        System.out.println(size + " " + beverage3.getDescription() + " $" + beverage3.cost());
    }
}
