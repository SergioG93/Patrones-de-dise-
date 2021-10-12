using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Patrones.Strategy.Core
{
    public abstract class Acciones
    {

        public override string ToString()
        {
            return this.GetType().Name;
        }
        public abstract string Graznar();
        public abstract string Volar();
        public abstract string Nadar();



    }
}
