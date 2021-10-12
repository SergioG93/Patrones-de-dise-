using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.InteropServices;
using System.Text;
using System.Threading.Tasks;

namespace Patrones.Strategy.Core
{
    public class Elegir
    {
        Acciones _estrategia;
        public void CambiarEstrategia(Acciones estrategia)
        {
            if (estrategia == null) throw new Exception("Estrategia por defecto");
            _estrategia = estrategia;
        }

        public string Nombre { get; set; }

        public string Graznar()
        {
            if (_estrategia == null) return "Graznando";
            return _estrategia.Graznar();
        }
        public string Volar()
        {
            if (_estrategia == null) return "Volando";
            return _estrategia.Volar();
        }
        public string Nadar()
        {
            if (_estrategia == null) return "Nadando";
            return _estrategia.Nadar();
        }
    }
}
