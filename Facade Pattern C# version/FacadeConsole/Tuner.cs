using System;
using System.Collections.Generic;
using System.Text;

namespace FacadeConsole
{
    public class Tuner
    {
        Amplifier amp;
        bool active = false;
        string freq;

        public Tuner() 
        {
            freq = "AM";
        }

        public void TurnOn()
        {
            active = true;
        }

        public void TurnOff()
        {
            active = false;
        }

        public void SetAM()
        {
            freq = "AM";
            Console.WriteLine("You are on AM frequency");
        }

        public void SetFM()
        {
            freq = "FM";
            Console.WriteLine("You are on FM frequency");
        }

        public void SetFrequency(int frequency)
        {
            Console.WriteLine("You are on " + frequency + " " + freq);
        }

        public void PlayMusic()
        {
            Console.WriteLine("You hear cool music from the radio");
        }
    }
}
