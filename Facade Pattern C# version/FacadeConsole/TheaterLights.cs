using System;
using System.Collections.Generic;
using System.Text;

namespace FacadeConsole
{
    public class TheaterLights
    {
        bool active = false;

        public void TurnOn()
        {
            active = true;
        }

        public void TurnOff()
        {
            active = false;
        }

        public void Dim()
        {
            Console.WriteLine("Setting lights to quarter brightness.\n");
        }
    }
}
