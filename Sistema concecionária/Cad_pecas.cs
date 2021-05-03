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
    public partial class Cad_pecas : Form
    {
        public Cad_pecas()
        {
            InitializeComponent();
        }

        private void limpar()
        {
            txt_Id.Clear();
            txt_Categoria.Clear();
            txt_Fabricante.Clear();
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
            if (txt_Categoria.Text == "")
            {
                MessageBox.Show("Categoria não pode se vasio");
                txt_Categoria.Focus();
                return;
            }
            if (txt_Fabricante.Text == "")
            {
                MessageBox.Show("Fabricante não pode se vasio");
                txt_Fabricante.Focus();
                return;
            }
            if (txt_Ano.Text == "")
            {
                MessageBox.Show("Ano não pode se vasio");
                txt_Ano.Focus();
                return;
            }
            if (txt_Valor.Text == "")
            {
                MessageBox.Show("Valor não pode se vasio");
                txt_Valor.Focus();
                return;
            }

            string[] pcs = new string[5];
            pcs[0] = txt_Id.Text;
            pcs[1] = txt_Categoria.Text;
            pcs[2] = txt_Fabricante.Text;
            pcs[3] = txt_Ano.Text;
            pcs[4] = txt_Valor.Text;

            ListViewItem l = new ListViewItem(pcs);
            lv_Pecas.Items.Add(l);
            limpar();
        }

        private void btn_Remover_Click(object sender, EventArgs e)
        {
            lv_Pecas.Items.RemoveAt(lv_Pecas.SelectedIndices[0]);
        }

        private void btn_Obter_Click(object sender, EventArgs e)
        {
            txt_Id.Text = lv_Pecas.SelectedItems[0].SubItems[0].Text;
            txt_Categoria.Text = lv_Pecas.SelectedItems[0].SubItems[1].Text;
            txt_Fabricante.Text = lv_Pecas.SelectedItems[0].SubItems[2].Text;
            txt_Ano.Text = lv_Pecas.SelectedItems[0].SubItems[3].Text;
            txt_Valor.Text = lv_Pecas.SelectedItems[0].SubItems[4].Text;
        }
    }
}
