import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        USDollars Uaccount = new USDollars();
        Bitcoin Baccount = new Bitcoin();
        USDollars pizza = new USDollars(30000);
        Bit adapt = new BitToUSDAdapter(Baccount);
        double bit = 0, usd = 0, amount, pizza1;
        Scanner input = new Scanner(System.in);

        Baccount.withdraw(1.0);
        Baccount.deposit(1.0);

        bit = Baccount.getBalance();

        System.out.println("You have " + bit + " bitcoins\n");

        Uaccount.withdraw(20.0);
        Uaccount.deposit(2.0);

        usd = Uaccount.getBalance();

        System.out.println("You have " + usd + " dollars\n");

        adapt.withdraw(200.0);
        adapt.deposit(1000.0);


        bit = Baccount.getBalance();

        System.out.print("You have ");
        System.out.printf("%.2f", bit);
        System.out.print(" bitcoins\n");

        usd = adapt.getBalance();

        System.out.println("You have " + usd + " dollars in your bitcoin account\n");

        pizza1 = pizza.getBalance();
        System.out.println("The pizzaria has " + pizza1 + " dollars\n");

        System.out.println("How much do you want to spend on your pizza's(in US dollars)? ");
        amount = input.nextDouble();

        adapt.withdraw(amount);
        pizza.deposit(amount);

        pizza1 = pizza.getBalance();
        bit = Baccount.getBalance();
        usd = adapt.getBalance();

        System.out.println("You have " + bit + " bitcoins\n");

        System.out.println("You have the equivalent of " + usd + " dollars in your bitcoin account\n");

        System.out.println("The pizzaria now has " + pizza1 + " dollars");
    }

}
