using System;
using System.Collections.Generic;
using System.Text;

namespace FacadeConsole
{
    public class DvdPlayer
    {
        public Amplifier amp;
        public bool active = false;

        public void TurnOn()
        {
            Console.WriteLine("Turning On DVD Player");
            active = true;
        }

        public void TurnOff()
        {
            Console.WriteLine("Turning Off DVD Player");
            active = false;
        }

        public void Eject()
        {
            Console.WriteLine("Ejecting Dvd.\n");
        }

        public void Pause()
        {
            Console.WriteLine("You have paused the Dvd.\n");
        }

        public void Play(String movie)
        {
            Console.WriteLine("Playing " + movie + ".\n");
        }

        public void SetSurroundAudio(int volume)
        {
            amp.SetVolume(volume);
        }

        public void SetTwoChannelAudio(int volume)
        {
            Console.WriteLine("Set the Two channel audio to " + volume + ".\n");
        }

        public void Stop()
        {
            Console.WriteLine("You have stopped the Dvd.\n");
        }
    }
}
