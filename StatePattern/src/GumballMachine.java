import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote{
    private static final long serialVersionUID = 2L;
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;
    String location;

    State state;
    int count = 0;

    public GumballMachine(String location,int numberGumballs) throws RemoteException{
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        this.count = numberGumballs;
        if(numberGumballs > 0){
            state = noQuarterState;
        } else {
            state = soldOutState;
        }

        this.location = location;
    }

    public String getLocation(){
        return location;
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    void setState(State state){
        this.state = state;
    }

    void releaseBall(){
        System.out.println("A gumball comes rolling out of the slot...");
        if(count != 0){
            count = count - 1;
        }
    }

    void refill(int count){
        this.count += count;
        System.out.println("The gumball was just refilled; it's new count is: " + this.count);
        state.refill();
    }
    public State getState(){
        return state;
    }

    public State getSoldOutState(){
        return soldOutState;
    }

    public State getSoldState(){
        return soldState;
    }

    public State getNoQuarterState(){
        return noQuarterState;
    }

    public State getHasQuarterState(){
        return hasQuarterState;
    }

    public State getWinnerState(){
        return winnerState;
    }

    public int getCount(){
        return count;
    }
}
