import java.util.ArrayList;

public class BitToUSDAdapter implements Bit {
    Bitcoin bit;

    double bitcoinPrice = 3803.0;

    public BitToUSDAdapter(Bitcoin bit){
        this.bit = bit;
    }

    public double getBalance(){
        double balance = 0;

        balance = bit.getBalance()*bitcoinPrice;

        return balance;
    }

    public void withdraw(double amount){
        amount = amount/bitcoinPrice;

        bit.withdraw(amount);
    }

    public void deposit(double amount){
        amount = amount/bitcoinPrice;

        bit.deposit(amount);

    }
}
