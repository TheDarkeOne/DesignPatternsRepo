import java.rmi.*;

public class GumballMoniterTestDrive {
    public static void main(String[] args){
        String[] location = {"rmi://santafe.mightygumball.com/gumballmachin",
                "rmi://boulder.mightygumball.com/gumballmachin",
                "rmi://seattle.mightygumball.com/gumballmachin"};

        GumballMoniter[] monitor = new GumballMoniter[location.length];

        for( int i = 0; i < location.length; i++){
            try{
                GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]);
                monitor[i] = new GumballMoniter(machine);
                System.out.println(monitor[i]);
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }

        for(int i = 0; i < monitor.length; i++){
            monitor[i].report();
        }
    }
}
