import java.rmi.Naming;

public class MyRemoteClient {
    public void go(){
        try{
            MyRemote service = (MyRemote) Naming.lookup("rmi://192.168.2.8/RemoteHello");

            String s = service.sayHello();

            System.out.println(s);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
