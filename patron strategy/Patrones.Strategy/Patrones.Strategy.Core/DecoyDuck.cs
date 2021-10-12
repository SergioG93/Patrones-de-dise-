using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Patrones.Strategy.Core
{
    public class DecoyDuck : Acciones
    {
        public override string Graznar()
        {
            return "No puedo graznar";
        }
        public override string Volar()
        {
            return "No puedo volar";
        }
        public override string Nadar()
        {
            return "No puedo nadar";
        }
    }
}
