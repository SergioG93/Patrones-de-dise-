using Patrones.Strategy.Core;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Management.Instrumentation;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Patrones.Strategy.UI
{
    public partial class Form1 : Form
    {

        List<Acciones> _estrategias;
        Elegir patos;
        public Form1()
        {
            InitializeComponent();

            _estrategias = new List<Acciones>();
            _estrategias.Add(new MallarDuck());
            _estrategias.Add(new DecoyDuck());
            _estrategias.Add(new ModelDuck());
            _estrategias.Add(new RubberDuck());


            this.cboEstrategias.DataSource = _estrategias;


            patos = new Elegir();
            patos.Nombre = "Patos";
            this.lblJugador.Text = patos.Nombre;

        }

        private void cmdAcciones_Click(object sender, EventArgs e)
        {
          
                MessageBox.Show(patos.Graznar());
                MessageBox.Show(patos.Volar());
                MessageBox.Show(patos.Nadar());



        }

        private void cmdSeleccionar_Click(object sender, EventArgs e)
        {
            Acciones tipo = (Acciones)this.cboEstrategias.SelectedItem;
            patos.CambiarEstrategia(tipo);
        }

        private void lblPato_Click(object sender, EventArgs e)
        {

        }

        private void cboEstrategias_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void label2_Click(object sender, EventArgs e)
        {

        }
    }
}
