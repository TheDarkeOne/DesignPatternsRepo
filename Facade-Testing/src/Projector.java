public class Projector {
    DvdPlayer dvdPlayer;
    boolean on = false;

    public void on(){
        this.on = true;
    }

    public void off(){
        this.on = false;
    }

    public void tvMode(){
        System.out.println("You are on Tv mode.\n");
    }

    public void wideScreenMode(){
        System.out.println("Wide screen mode has been turned on.\n");
    }
}
