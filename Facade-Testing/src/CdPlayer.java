public class CdPlayer {
    boolean on = false;

    public void on(){
        this.on = true;
    }

    public void off(){
        this.on = false;
    }

    public void eject(){
        System.out.println("Ejecting Cd.\n");
    }

    public void pause(){
        System.out.println("You have paused the Cd.\n");
    }

    public void play(String cd){
        System.out.println("Playing " + cd + ".\n");
    }

    public void stop(){
        System.out.println("You have stopped the Cd.\n");
    }
}
