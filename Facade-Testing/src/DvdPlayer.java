public class DvdPlayer {
    Amplifier amp;
    boolean on = false;

    public void on(){
        this.on = true;
    }

    public void off(){
        this.on = false;
    }

    public void eject(){
        System.out.println("Ejecting Dvd.\n");
    }

    public void pause(){
        System.out.println("You have paused the Dvd.\n");
    }

    public void play(String movie){
        System.out.println("Playing " + movie + ".\n");
    }

    public void setSurroundAudio(int volume){
        amp.setVolume(volume);
    }

    public  void setTwoChannelAudio(int volume){
        System.out.println("Set the Two channel audio to " + volume + ".\n");
    }

    public void stop(){
        System.out.println("You have stopped the Dvd.\n");
    }
}
