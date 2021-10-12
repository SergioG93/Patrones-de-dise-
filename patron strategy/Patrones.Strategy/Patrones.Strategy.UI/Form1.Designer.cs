namespace Patrones.Strategy.UI
{
    partial class Form1
    {
        /// <summary>
        /// Variable del diseñador necesaria.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpiar los recursos que se estén usando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben desechar; false en caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de Windows Forms

        /// <summary>
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido de este método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.label1 = new System.Windows.Forms.Label();
            this.cboEstrategias = new System.Windows.Forms.ComboBox();
            this.cmdSeleccionar = new System.Windows.Forms.Button();
            this.label2 = new System.Windows.Forms.Label();
            this.lblJugador = new System.Windows.Forms.Label();
            this.cmdDisparar = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(64, 117);
            this.label1.Margin = new System.Windows.Forms.Padding(2, 0, 2, 0);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(33, 13);
            this.label1.TabIndex = 0;
            this.label1.Text = "Tipos";
            // 
            // cboEstrategias
            // 
            this.cboEstrategias.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cboEstrategias.FormattingEnabled = true;
            this.cboEstrategias.Location = new System.Drawing.Point(57, 151);
            this.cboEstrategias.Margin = new System.Windows.Forms.Padding(2);
            this.cboEstrategias.Name = "cboEstrategias";
            this.cboEstrategias.Size = new System.Drawing.Size(278, 21);
            this.cboEstrategias.TabIndex = 1;
            this.cboEstrategias.SelectedIndexChanged += new System.EventHandler(this.cboEstrategias_SelectedIndexChanged);
            // 
            // cmdSeleccionar
            // 
            this.cmdSeleccionar.Location = new System.Drawing.Point(33, 191);
            this.cmdSeleccionar.Margin = new System.Windows.Forms.Padding(2);
            this.cmdSeleccionar.Name = "cmdSeleccionar";
            this.cmdSeleccionar.Size = new System.Drawing.Size(105, 19);
            this.cmdSeleccionar.TabIndex = 2;
            this.cmdSeleccionar.Text = "Selecciona";
            this.cmdSeleccionar.UseVisualStyleBackColor = true;
            this.cmdSeleccionar.Click += new System.EventHandler(this.cmdSeleccionar_Click);
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(64, 28);
            this.label2.Margin = new System.Windows.Forms.Padding(2, 0, 2, 0);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(94, 13);
            this.label2.TabIndex = 3;
            this.label2.Text = "Nombre del animal";
            this.label2.Click += new System.EventHandler(this.label2_Click);
            // 
            // lblJugador
            // 
            this.lblJugador.AutoSize = true;
            this.lblJugador.Location = new System.Drawing.Point(64, 68);
            this.lblJugador.Margin = new System.Windows.Forms.Padding(2, 0, 2, 0);
            this.lblJugador.Name = "lblJugador";
            this.lblJugador.Size = new System.Drawing.Size(35, 13);
            this.lblJugador.TabIndex = 4;
            this.lblJugador.Text = "label3";
            this.lblJugador.Click += new System.EventHandler(this.lblPato_Click);
            // 
            // cmdDisparar
            // 
            this.cmdDisparar.Location = new System.Drawing.Point(180, 191);
            this.cmdDisparar.Margin = new System.Windows.Forms.Padding(2);
            this.cmdDisparar.Name = "cmdDisparar";
            this.cmdDisparar.Size = new System.Drawing.Size(56, 19);
            this.cmdDisparar.TabIndex = 5;
            this.cmdDisparar.Text = "Accion";
            this.cmdDisparar.UseVisualStyleBackColor = true;
            this.cmdDisparar.Click += new System.EventHandler(this.cmdAcciones_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(600, 366);
            this.Controls.Add(this.cmdDisparar);
            this.Controls.Add(this.lblJugador);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.cmdSeleccionar);
            this.Controls.Add(this.cboEstrategias);
            this.Controls.Add(this.label1);
            this.Margin = new System.Windows.Forms.Padding(2);
            this.Name = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.ComboBox cboEstrategias;
        private System.Windows.Forms.Button cmdSeleccionar;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label lblJugador;
        private System.Windows.Forms.Button cmdDisparar;
    }
}

