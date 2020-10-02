public class USDollars implements USD{
    double balance;

    public USDollars(){
        balance = 0;
    }
    public USDollars(double amount){ balance = amount;}
    public double getBalance(){
        return balance;
    }

    public void withdraw(double amount){
        if(balance > amount){
            balance -= amount;
        }else{
            System.out.println("Not enough in account.\n");
        }
    }

    public void deposit(double amount){
        balance += amount;

    }
}
