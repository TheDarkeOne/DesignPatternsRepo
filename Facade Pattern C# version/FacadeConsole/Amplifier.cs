using System;
using System.Collections.Generic;
using System.Text;

namespace FacadeConsole
{
    public class Amplifier
    {
        public Tuner tuner;
        public DvdPlayer dvdPlayer;
        public CdPlayer cdPlayer;
        public bool active = false;

        public Amplifier()
        {
            tuner = new Tuner();
            dvdPlayer = new DvdPlayer();
            cdPlayer = new CdPlayer();
        }

        public void TurnOn()
        {
            this.active = true;
            Console.WriteLine("Amp on.\n");
        }

        public void TurnOff()
        {
            if (this.active == true)
            {
                Console.WriteLine("Amp turning off.\n");
                this.active = false;
            }
        }

        public void SetCd(CdPlayer Cd)
        {
            Cd.TurnOn();
        }

        public void SetDvd(DvdPlayer dvd)
        {
            dvd.TurnOn();
        }

        public void SetStereoSound()
        {
            Console.WriteLine("You are using stereo sound.\n");
        }

        public void SetSurroundSound()
        {
            Console.WriteLine("You are using surround sound.\n");
        }

        public void SetTuner()
        {
            tuner.TurnOn();
        }

        public void SetVolume(int volume)
        {
            Console.WriteLine("Volume is set at " + volume + ".\n");
        }

    }
}
