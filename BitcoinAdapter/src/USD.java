public interface USD {
    double balance = 0;

    public double getBalance();

    public void withdraw(double amount);

    public void deposit(double amount);
}
