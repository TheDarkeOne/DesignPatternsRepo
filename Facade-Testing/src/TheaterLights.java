public class TheaterLights {
    boolean on = false;

    public void on(){
        this.on = true;
    }

    public void off(){
        this.on = false;
    }

    public void dim(){
        System.out.println("Setting lights to quarter brightness.\n");
    }
}
