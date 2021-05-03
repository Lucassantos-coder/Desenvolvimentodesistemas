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
    public partial class Cad_clientes : Form
    {
        public Cad_clientes()
        {
            InitializeComponent();
        }

        private void limpar()
        {
            txt_Id.Clear();
            txt_Nome.Clear();
            txt_Endereco.Clear();
            txt_Telefone.Clear();
            txt_Cpf.Clear();
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
            if (txt_Endereco.Text == "")
            {
                MessageBox.Show("Endereço não pode se vasio");
                txt_Endereco.Focus();
                return;
            }
            if (txt_Telefone.Text == "")
            {
                MessageBox.Show("Telefone não pode se vasio");
                txt_Telefone.Focus();
                return;
            }
            if (txt_Cpf.Text == "")
            {
                MessageBox.Show("Cpf não pode se vasio");
                txt_Cpf.Focus();
                return;
            }

            string[] cl = new string[5];
            cl[0] = txt_Id.Text;
            cl[1] = txt_Nome.Text;
            cl[2] = txt_Endereco.Text;
            cl[3] = txt_Telefone.Text;
            cl[4] = txt_Cpf.Text;

            ListViewItem l = new ListViewItem(cl);
            lv_Clientes.Items.Add(l);
            limpar();
        }

        private void btn_Remover_Click(object sender, EventArgs e)
        {
            lv_Clientes.Items.RemoveAt(lv_Clientes.SelectedIndices[0]);
        }

        private void btn_Obter_Click(object sender, EventArgs e)
        {
            txt_Id.Text = lv_Clientes.SelectedItems[0].SubItems[0].Text;
            txt_Nome.Text = lv_Clientes.SelectedItems[0].SubItems[1].Text;
            txt_Endereco.Text = lv_Clientes.SelectedItems[0].SubItems[2].Text;
            txt_Telefone.Text = lv_Clientes.SelectedItems[0].SubItems[3].Text;
            txt_Cpf.Text = lv_Clientes.SelectedItems[0].SubItems[4].Text;
        }
    }
}
