public class GumballMoniter {
    GumballMachineRemote machine;

    public GumballMoniter(GumballMachineRemote machine){
        this.machine = machine;
    }

    public void report(){
        try {
            System.out.println("Gumball Machine: " + machine.getLocation());
            System.out.println("Current inventory: " + machine.getCount() + " gumballs");
            System.out.println("Current state: " + machine.getState());
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
