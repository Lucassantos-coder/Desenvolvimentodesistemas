using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Sistema_concecionária
{
    public partial class Principal : Form
    {
        public Principal()
        {
            InitializeComponent();
        }
        private void button1_Click(object sender, EventArgs e)
        {
            Cad_Funcionarios cad_Funcionarios = new Cad_Funcionarios();
            cad_Funcionarios.ShowDialog();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Cad_clientes cad_Clientes = new Cad_clientes();
            cad_Clientes.ShowDialog();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            Cad_veiculos cad_Veiculos = new Cad_veiculos();
            cad_Veiculos.ShowDialog();
        }

        private void button4_Click(object sender, EventArgs e)
        {
            Cad_pecas cad_Pecas = new Cad_pecas();
            cad_Pecas.ShowDialog();
        }

        private void button5_Click(object sender, EventArgs e)
        {
            Vendas vendas = new Vendas();
            vendas.ShowDialog();
        }
    }
}
