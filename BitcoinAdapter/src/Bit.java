import java.util.ArrayList;
import java.util.List;

public interface Bit {
    ArrayList<Double> bitcoin = new ArrayList<Double>();

    public double getBalance();

    public void withdraw(double amount);

    public void deposit(double amount);
}
