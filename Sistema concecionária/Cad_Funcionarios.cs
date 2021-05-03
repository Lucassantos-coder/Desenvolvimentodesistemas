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
    public partial class Cad_Funcionarios : Form
    {
        public Cad_Funcionarios()
        {
            InitializeComponent();
        }

        private void lbl_Nome_Click(object sender, EventArgs e)
        {

        }

        private void limpar()
        {
            txt_Id.Clear();
            txt_Nome.Clear();
            txt_Departamento.Clear();
            txt_Endereco.Clear();
            txt_Telefone.Clear();
            txt_Cpf.Clear();
            txt_Id.Focus();
        }

        private void btn_Adicionar_Click(object sender, EventArgs e)
        {
            if (txt_Id.Text == "")
            {
                MessageBox.Show("ID não pode ser vasio");
                txt_Id.Focus();
                return;
            }
            if (txt_Nome.Text == "")
            {
                MessageBox.Show("Nome não pode ser vasio");
                txt_Nome.Focus();
                return;
            }
            if (txt_Departamento.Text == "")
            {
                MessageBox.Show("Departamento não pode ser vasio");
                txt_Departamento.Focus();
                return;
            }
            if (txt_Endereco.Text == "")
            {
                MessageBox.Show("Endereço não pode ser vasio");
                txt_Endereco.Focus();
                return;
            }
            if (txt_Telefone.Text == "")
            {
                MessageBox.Show("Telefone não pode ser vasio");
                txt_Telefone.Focus();
                return;
            }
            if (txt_Cpf.Text == "")
            {
                MessageBox.Show("CPF não pode ser vasio");
                txt_Cpf.Focus();
                return;
            }

            string[] fn = new string[6];
            fn[0] = txt_Id.Text;
            fn[1] = txt_Nome.Text;
            fn[2] = txt_Departamento.Text;
            fn[3] = txt_Endereco.Text;
            fn[4] = txt_Telefone.Text;
            fn[5] = txt_Cpf.Text;

            ListViewItem l = new ListViewItem(fn);
            lv_Funcionarios.Items.Add(l);
            limpar();
        }

        private void btn_Remover_Click(object sender, EventArgs e)
        {
            lv_Funcionarios.Items.RemoveAt(lv_Funcionarios.SelectedIndices[0]);
        }

        private void btn_obter_Click(object sender, EventArgs e)
        {
            txt_Id.Text = lv_Funcionarios.SelectedItems[0].SubItems[0].Text;
            txt_Nome.Text = lv_Funcionarios.SelectedItems[0].SubItems[1].Text;
            txt_Departamento.Text = lv_Funcionarios.SelectedItems[0].SubItems[2].Text;
            txt_Endereco.Text = lv_Funcionarios.SelectedItems[0].SubItems[3].Text;
            txt_Telefone.Text = lv_Funcionarios.SelectedItems[0].SubItems[4].Text;
            txt_Cpf.Text = lv_Funcionarios.SelectedItems[0].SubItems[5].Text;
        }
    }
}
