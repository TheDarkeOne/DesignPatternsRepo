using System;
using System.Collections.Generic;
using System.Text;

namespace FacadeConsole
{
    public class CdPlayer
    {
        public bool active = false;

        public void TurnOn()
        {
            active = true;
        }

        public void TurnOff()
        {
            active = false;
        }

        public void Eject()
        {
            Console.WriteLine("Ejecting Cd.\n");
        }

        public void Pause()
        {
            Console.WriteLine("You have paused the Cd.\n");
        }

        public void Play(String cd)
        {
            Console.WriteLine("Playing " + cd + ".\n");
        }

        public void Stop()
        {
            Console.WriteLine("You have stopped the Cd.\n");
        }
    }
}
