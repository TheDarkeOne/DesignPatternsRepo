public class PopcornPopper {
    boolean on = false;

    public void on(){
        this.on = true;
    }

    public void off(){
        this.on = false;
    }

    public void pop(){
        System.out.println("Pop pop pop");
    }
}
