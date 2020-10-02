import java.rmi.Naming;

public class Main {

    public static void main(String[] args) {
        GumballMachineRemote gumballMachine = null;

        int count;
        String stuff[] = new String[2];
        stuff[0] = "Utah";
        stuff[1] = "100";
        args = stuff;
        if( args.length < 2){
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        try {
            count = Integer.parseInt(args[1]);
            gumballMachine = new GumballMachine(args[0], count);

            Naming.rebind("//" + args[0] + "/gumballMachine", gumballMachine);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
