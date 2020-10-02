using System;
using System.Collections.Generic;
using System.Text;

namespace FacadeConsole
{
    public class RadioFacade
    {
        public Amplifier amp;
        public Tuner tuner;
        

        public RadioFacade(Amplifier amp, Tuner tuner)
        {
            this.amp = amp;
            this.tuner = tuner;
        }

        public void ListenToRadio(int frequency)
        {
            Console.WriteLine("Get ready to listen to the radio...");
            amp.TurnOn();
            amp.SetSurroundSound();
            amp.SetVolume(5);
            amp.SetTuner();
            tuner.SetFM();
            tuner.SetFrequency(frequency);
            tuner.PlayMusic();
        }

        public void TurnOffRadio()
        {
            amp.TurnOff();
        }
    }
}

