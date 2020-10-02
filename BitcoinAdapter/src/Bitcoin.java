import java.util.ArrayList;

public class Bitcoin implements Bit{
    ArrayList<Double> bitcoin = new ArrayList<Double>();

    public Bitcoin(){
        for(double i = 4.0; i > 0.0; i--)
        bitcoin.add(i);

    }
    public double getBalance(){
        double balance = 0.0;

        for (int i = 0; i < bitcoin.size(); i++)
            balance += bitcoin.get(i);

        return balance;
    }

    public void withdraw(double amount){
        boolean finished = false;


        if(getBalance() > amount){
            do {
                double temp = 0;
                int i = 0;
                while(temp < amount) {
                    temp += bitcoin.get(i);

                    bitcoin.remove(i);
                }
                temp -= amount;

                bitcoin.add(temp);

                finished = true;

            } while (finished = false);
        }
    }

    public void deposit(double amount){
        bitcoin.add(amount);
    }
}
