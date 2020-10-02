public class Tuner {
    Amplifier amp;
    boolean on;
    String freq;

    public void on(){
        this.on = true;
    }

    public void off(){
        this.on = false;
    }

    public void setAM(){
        freq = "AM";
        System.out.println("You are on AM frequency");
    }

    public void setFM(){
        freq = "FM";
        System.out.println("You are on FM frequency");
    }

    public void setFrequency(int frequency){
        System.out.println("You are on " + frequency + " " + freq);
    }
}
