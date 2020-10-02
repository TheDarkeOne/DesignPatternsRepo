using System;
using System.Collections.Generic;
using System.Text;

namespace FacadeConsole
{
    public class Projector
    {
        DvdPlayer dvdPlayer;
        bool active = false;

        public void TurnOn()
        {
            active = true;
        }

        public void TurnOff()
        {
            active = false;
        }

        public void TvMode()
        {
            Console.WriteLine("You are on Tv mode.\n");
        }

        public void WideScreenMode()
        {
            Console.WriteLine("Wide screen mode has been turned on.\n");
        }
    }
}
