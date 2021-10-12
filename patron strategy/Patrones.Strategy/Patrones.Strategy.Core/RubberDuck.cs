using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Patrones.Strategy.Core
{
    public class RubberDuck : Acciones
    {
        public override string Graznar()
        {
            return "Graznando silencioso";
        }
        public override string Volar()
        {
            return "Volando muy alto";
        }
        public override string Nadar()
        {
            return "Nadando muy rapido";
        }
    }
}
