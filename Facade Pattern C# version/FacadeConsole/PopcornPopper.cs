using System;
using System.Collections.Generic;
using System.Text;

namespace FacadeConsole
{
    public class PopcornPopper
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

        public void Pop()
        {
            Console.WriteLine("Pop pop pop");
        }
    }
}
