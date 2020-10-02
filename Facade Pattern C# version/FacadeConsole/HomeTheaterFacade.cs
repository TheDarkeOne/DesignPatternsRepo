using System;
using System.Collections.Generic;
using System.Text;

namespace FacadeConsole
{
    public class HomeTheaterFacade
    {
        public Amplifier amp;
        public Tuner tuner;
        public DvdPlayer dvd;
        public CdPlayer cd;
        public Projector projector;
        public TheaterLights lights;
        public Screen screen;
        public PopcornPopper popper;
        
        public HomeTheaterFacade(Amplifier amp, Tuner tuner, DvdPlayer dvd, CdPlayer cd, Projector projector,
                                 TheaterLights lights, Screen screen, PopcornPopper popper)
        {
            this.amp = amp;
            this.tuner = tuner;
            this.dvd = dvd;
            this.cd = cd;
            this.projector = projector;
            this.screen = screen;
            this.lights = lights;
            this.popper = popper;
        }

        public void WatchMovie(String movie)
        {
            Console.WriteLine("Get ready to watch a movie...");
            popper.TurnOn();
            popper.Pop();
            lights.Dim();
            screen.GoDown();
            projector.TurnOn();
            projector.WideScreenMode();
            amp.TurnOn();
            amp.SetDvd(dvd);
            amp.SetSurroundSound();
            amp.SetVolume(5);
            dvd.TurnOn();
            dvd.Play(movie);
        }

        public void EndMovie()
        {
            popper.TurnOff();
            lights.TurnOn();
            screen.GoUp();
            projector.TurnOff();
            amp.TurnOff();
            dvd.Stop();
            dvd.Eject();
            dvd.TurnOff();
        }
    }
}
