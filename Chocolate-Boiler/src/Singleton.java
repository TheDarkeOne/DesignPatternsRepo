public class Singleton {
    private static int amount;
    private static Singleton Instance;

    private Singleton() {}

    public static Singleton getInstance(){
        if(amount > 3 ){
            return uniqueInstance;
        }
        else{
            uniqueInstance = new Singleton();
            amount++;
        }
         return uniqueInstance;
    }
}
