using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Patrones.Strategy.Core
{
    public class ModelDuck : Acciones
    {
        public override string Graznar()
        {
            return "Graznando de jueguete";
        }
        public override string Volar()
        {
            return "No puedo volar";
        }
        public override string Nadar()
        {
            return "Flotando sobre el agua";
        }
    }
}
