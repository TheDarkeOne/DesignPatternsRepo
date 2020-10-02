public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    public static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new ChocolateBoiler();
        }
        return uniqueInstance;
    }

    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
        }
    }

    public void drain(){
        if(!isEmpty() && isBoiled()){
            empty = true;
        }
    }

    public void boil(){
        if(!isBoiled() && !isEmpty()){
            boiled = true;
        }
    }

    public boolean isBoiled() {
        return boiled;
    }

    public boolean isEmpty() {
        return empty;
    }
}
