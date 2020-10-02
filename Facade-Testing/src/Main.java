public class Main {

    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        DvdPlayer dvd  = new DvdPlayer();
        CdPlayer cd  = new CdPlayer();
        Projector projector  = new Projector();
        TheaterLights lights  = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popper  = new PopcornPopper();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp,tuner,dvd,cd,projector,lights,screen,popper);

        homeTheater.watchMovie("Raider of thr Lost Ark");
        homeTheater.endMovie();
    }
}