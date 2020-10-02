public class Amplifier {
    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;
    Boolean on = false;

    public void on(){
        this.on = true;
        System.out.println("Amp on.\n");
    }

    public void off(){
        if(this.on == true){
            System.out.println("Amp turning off.\n");
            this.on = false;
        }
    }

    public void setCd(CdPlayer Cd){
        Cd.on();
    }

    public void setDvd(DvdPlayer dvd){
        dvd.on();
    }

    public void setStereoSound(){
        System.out.println("You are using stereo sound.\n");
    }

    public void setSurroundSound(){
        System.out.println("You are using surround sound.\n");
    }

    public void setTuner(){
        tuner.on();
    }

    public void setVolume(int volume){
        System.out.println("Volume is set at " + volume + ".\n");
    }

}
