using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Patrones.Strategy.Core
{
    public class MallarDuck : Acciones
    {
        public override string Graznar()
        {
            return "Graznando muy fuerte";
        }
        public override string Volar()
        {
            return "Volando con alas";
        }
        public override string Nadar()
        {
            return "Nadando con patas";
        }
    }
}
