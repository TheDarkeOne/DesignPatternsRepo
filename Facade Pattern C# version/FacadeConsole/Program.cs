﻿using System;

namespace FacadeConsole
{
    class Program
    {
        static void Main(string[] args)
        {
            Amplifier amp = new Amplifier();
            Tuner tuner = new Tuner();
            DvdPlayer dvd = new DvdPlayer();
            CdPlayer cd = new CdPlayer();
            Projector projector = new Projector();
            TheaterLights lights = new TheaterLights();
            Screen screen = new Screen();
            PopcornPopper popper = new PopcornPopper();

            HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, cd, projector, lights, screen, popper);

            homeTheater.WatchMovie("Raider of the Lost Ark");
            homeTheater.EndMovie();

            RadioFacade radio = new RadioFacade(amp, tuner);
            radio.ListenToRadio(800);
            radio.TurnOffRadio();
        }
    }
}
