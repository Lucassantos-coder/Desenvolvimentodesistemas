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
    public partial class Cad_veiculos : Form
    {
        public Cad_veiculos()
        {
            InitializeComponent();
        }

        private void limpar()
        {
            txt_Id.Clear();
            txt_Nome.Clear();
            txt_Categoria.Clear();
            txt_Marca.Clear();
            txt_Modelo.Clear();
            txt_Ano.Clear();
            txt_Valor.Clear();
            txt_Id.Focus();
        }

        private void btn_Adicionar_Click(object sender, EventArgs e)
        {
            if (txt_Id.Text == "")
            {
                MessageBox.Show("ID não pode se vasio");
                txt_Id.Focus();
                return;
            }
            if (txt_Nome.Text == "")
            {
                MessageBox.Show("Nome não pode se vasio");
                txt_Nome.Focus();
                return;
            }
            if (txt_Categoria.Text == "")
            {
                MessageBox.Show("Categoria não pode se vasio");
                txt_Categoria.Focus();
                return;
            }
            if (txt_Marca.Text == "")
            {
                MessageBox.Show("Marca não pode se vasio");
                txt_Marca.Focus();
                return;
            }
            if (txt_Modelo.Text == "")
            {
                MessageBox.Show("Modelo não pode se vasio");
                txt_Modelo.Focus();
                return;
            }
            if (txt_Valor.Text == "")
            {
                MessageBox.Show("Valor não pode se vasio");
                txt_Valor.Focus();
                return;
            }

            string[] vs = new string[7];
            vs[0] = txt_Id.Text;
            vs[1] = txt_Nome.Text;
            vs[2] = txt_Categoria.Text;
            vs[3] = txt_Marca.Text;
            vs[4] = txt_Modelo.Text;
            vs[5] = txt_Ano.Text;
            vs[6] = txt_Valor.Text;

            ListViewItem l = new ListViewItem(vs);
            lv_Veiculos.Items.Add(l);
            limpar();
        }

        private void btn_Remover_Click(object sender, EventArgs e)
        {
            lv_Veiculos.Items.RemoveAt(lv_Veiculos.SelectedIndices[0]);
        }

        private void btn_Obter_Click(object sender, EventArgs e)
        {
            txt_Id.Text = lv_Veiculos.SelectedItems[0].SubItems[0].Text;
            txt_Nome.Text = lv_Veiculos.SelectedItems[0].SubItems[1].Text;
            txt_Categoria.Text = lv_Veiculos.SelectedItems[0].SubItems[2].Text;
            txt_Marca.Text = lv_Veiculos.SelectedItems[0].SubItems[3].Text;
            txt_Modelo.Text = lv_Veiculos.SelectedItems[0].SubItems[4].Text;
            txt_Ano.Text = lv_Veiculos.SelectedItems[0].SubItems[5].Text;
            txt_Valor.Text = lv_Veiculos.SelectedItems[0].SubItems[6].Text;
        }
    }
}
