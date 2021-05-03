
namespace Sistema_concecionária
{
    partial class Cad_Funcionarios
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.lbl_Id = new System.Windows.Forms.Label();
            this.lbl_Nome = new System.Windows.Forms.Label();
            this.lbl_Departamento = new System.Windows.Forms.Label();
            this.lbl_Endereco = new System.Windows.Forms.Label();
            this.lbl_Telefone = new System.Windows.Forms.Label();
            this.lbl_Cpf = new System.Windows.Forms.Label();
            this.txt_Id = new System.Windows.Forms.TextBox();
            this.txt_Nome = new System.Windows.Forms.TextBox();
            this.txt_Departamento = new System.Windows.Forms.TextBox();
            this.txt_Endereco = new System.Windows.Forms.TextBox();
            this.txt_Telefone = new System.Windows.Forms.TextBox();
            this.txt_Cpf = new System.Windows.Forms.TextBox();
            this.lv_Funcionarios = new System.Windows.Forms.ListView();
            this.col_Id = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.col_Nome = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.col_Departamento = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.col_Endereco = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.col_Telefone = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.col_Cpf = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.btn_Adicionar = new System.Windows.Forms.Button();
            this.btn_Remover = new System.Windows.Forms.Button();
            this.btn_obter = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // lbl_Id
            // 
            this.lbl_Id.AutoSize = true;
            this.lbl_Id.Location = new System.Drawing.Point(12, 281);
            this.lbl_Id.Name = "lbl_Id";
            this.lbl_Id.Size = new System.Drawing.Size(18, 13);
            this.lbl_Id.TabIndex = 0;
            this.lbl_Id.Text = "ID";
            // 
            // lbl_Nome
            // 
            this.lbl_Nome.AutoSize = true;
            this.lbl_Nome.Location = new System.Drawing.Point(71, 281);
            this.lbl_Nome.Name = "lbl_Nome";
            this.lbl_Nome.Size = new System.Drawing.Size(35, 13);
            this.lbl_Nome.TabIndex = 1;
            this.lbl_Nome.Text = "Nome";
            this.lbl_Nome.Click += new System.EventHandler(this.lbl_Nome_Click);
            // 
            // lbl_Departamento
            // 
            this.lbl_Departamento.AutoSize = true;
            this.lbl_Departamento.Location = new System.Drawing.Point(221, 281);
            this.lbl_Departamento.Name = "lbl_Departamento";
            this.lbl_Departamento.Size = new System.Drawing.Size(74, 13);
            this.lbl_Departamento.TabIndex = 2;
            this.lbl_Departamento.Text = "Departamento";
            // 
            // lbl_Endereco
            // 
            this.lbl_Endereco.AutoSize = true;
            this.lbl_Endereco.Location = new System.Drawing.Point(356, 281);
            this.lbl_Endereco.Name = "lbl_Endereco";
            this.lbl_Endereco.Size = new System.Drawing.Size(53, 13);
            this.lbl_Endereco.TabIndex = 3;
            this.lbl_Endereco.Text = "Endereço";
            // 
            // lbl_Telefone
            // 
            this.lbl_Telefone.AutoSize = true;
            this.lbl_Telefone.Location = new System.Drawing.Point(479, 281);
            this.lbl_Telefone.Name = "lbl_Telefone";
            this.lbl_Telefone.Size = new System.Drawing.Size(49, 13);
            this.lbl_Telefone.TabIndex = 4;
            this.lbl_Telefone.Text = "Telefone";
            // 
            // lbl_Cpf
            // 
            this.lbl_Cpf.AutoSize = true;
            this.lbl_Cpf.Location = new System.Drawing.Point(624, 281);
            this.lbl_Cpf.Name = "lbl_Cpf";
            this.lbl_Cpf.Size = new System.Drawing.Size(23, 13);
            this.lbl_Cpf.TabIndex = 5;
            this.lbl_Cpf.Text = "Cpf";
            // 
            // txt_Id
            // 
            this.txt_Id.Location = new System.Drawing.Point(12, 297);
            this.txt_Id.Name = "txt_Id";
            this.txt_Id.Size = new System.Drawing.Size(56, 20);
            this.txt_Id.TabIndex = 6;
            // 
            // txt_Nome
            // 
            this.txt_Nome.Location = new System.Drawing.Point(74, 297);
            this.txt_Nome.Name = "txt_Nome";
            this.txt_Nome.Size = new System.Drawing.Size(144, 20);
            this.txt_Nome.TabIndex = 7;
            // 
            // txt_Departamento
            // 
            this.txt_Departamento.Location = new System.Drawing.Point(224, 297);
            this.txt_Departamento.Name = "txt_Departamento";
            this.txt_Departamento.Size = new System.Drawing.Size(129, 20);
            this.txt_Departamento.TabIndex = 8;
            // 
            // txt_Endereco
            // 
            this.txt_Endereco.Location = new System.Drawing.Point(359, 297);
            this.txt_Endereco.Name = "txt_Endereco";
            this.txt_Endereco.Size = new System.Drawing.Size(117, 20);
            this.txt_Endereco.TabIndex = 9;
            // 
            // txt_Telefone
            // 
            this.txt_Telefone.Location = new System.Drawing.Point(482, 297);
            this.txt_Telefone.Name = "txt_Telefone";
            this.txt_Telefone.Size = new System.Drawing.Size(139, 20);
            this.txt_Telefone.TabIndex = 10;
            // 
            // txt_Cpf
            // 
            this.txt_Cpf.Location = new System.Drawing.Point(627, 297);
            this.txt_Cpf.Name = "txt_Cpf";
            this.txt_Cpf.Size = new System.Drawing.Size(161, 20);
            this.txt_Cpf.TabIndex = 11;
            // 
            // lv_Funcionarios
            // 
            this.lv_Funcionarios.Columns.AddRange(new System.Windows.Forms.ColumnHeader[] {
            this.col_Id,
            this.col_Nome,
            this.col_Departamento,
            this.col_Endereco,
            this.col_Telefone,
            this.col_Cpf});
            this.lv_Funcionarios.FullRowSelect = true;
            this.lv_Funcionarios.HideSelection = false;
            this.lv_Funcionarios.Location = new System.Drawing.Point(12, 12);
            this.lv_Funcionarios.MultiSelect = false;
            this.lv_Funcionarios.Name = "lv_Funcionarios";
            this.lv_Funcionarios.Size = new System.Drawing.Size(776, 245);
            this.lv_Funcionarios.TabIndex = 12;
            this.lv_Funcionarios.UseCompatibleStateImageBehavior = false;
            this.lv_Funcionarios.View = System.Windows.Forms.View.Details;
            // 
            // col_Id
            // 
            this.col_Id.Text = "ID";
            this.col_Id.Width = 58;
            // 
            // col_Nome
            // 
            this.col_Nome.Text = "Nome";
            this.col_Nome.Width = 161;
            // 
            // col_Departamento
            // 
            this.col_Departamento.Text = "Departamento";
            this.col_Departamento.Width = 119;
            // 
            // col_Endereco
            // 
            this.col_Endereco.Text = "Endereço";
            this.col_Endereco.Width = 137;
            // 
            // col_Telefone
            // 
            this.col_Telefone.Text = "Telefone";
            this.col_Telefone.Width = 147;
            // 
            // col_Cpf
            // 
            this.col_Cpf.Text = "Cpf";
            this.col_Cpf.Width = 150;
            // 
            // btn_Adicionar
            // 
            this.btn_Adicionar.Location = new System.Drawing.Point(15, 347);
            this.btn_Adicionar.Name = "btn_Adicionar";
            this.btn_Adicionar.Size = new System.Drawing.Size(203, 23);
            this.btn_Adicionar.TabIndex = 13;
            this.btn_Adicionar.Text = "Adicionar";
            this.btn_Adicionar.UseVisualStyleBackColor = true;
            this.btn_Adicionar.Click += new System.EventHandler(this.btn_Adicionar_Click);
            // 
            // btn_Remover
            // 
            this.btn_Remover.Location = new System.Drawing.Point(15, 376);
            this.btn_Remover.Name = "btn_Remover";
            this.btn_Remover.Size = new System.Drawing.Size(203, 23);
            this.btn_Remover.TabIndex = 14;
            this.btn_Remover.Text = "Remover";
            this.btn_Remover.UseVisualStyleBackColor = true;
            this.btn_Remover.Click += new System.EventHandler(this.btn_Remover_Click);
            // 
            // btn_obter
            // 
            this.btn_obter.Location = new System.Drawing.Point(15, 405);
            this.btn_obter.Name = "btn_obter";
            this.btn_obter.Size = new System.Drawing.Size(203, 23);
            this.btn_obter.TabIndex = 15;
            this.btn_obter.Text = "Obter";
            this.btn_obter.UseVisualStyleBackColor = true;
            this.btn_obter.Click += new System.EventHandler(this.btn_obter_Click);
            // 
            // Cad_Funcionarios
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.btn_obter);
            this.Controls.Add(this.btn_Remover);
            this.Controls.Add(this.btn_Adicionar);
            this.Controls.Add(this.lv_Funcionarios);
            this.Controls.Add(this.txt_Cpf);
            this.Controls.Add(this.txt_Telefone);
            this.Controls.Add(this.txt_Endereco);
            this.Controls.Add(this.txt_Departamento);
            this.Controls.Add(this.txt_Nome);
            this.Controls.Add(this.txt_Id);
            this.Controls.Add(this.lbl_Cpf);
            this.Controls.Add(this.lbl_Telefone);
            this.Controls.Add(this.lbl_Endereco);
            this.Controls.Add(this.lbl_Departamento);
            this.Controls.Add(this.lbl_Nome);
            this.Controls.Add(this.lbl_Id);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedDialog;
            this.MaximizeBox = false;
            this.Name = "Cad_Funcionarios";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Concecionária";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lbl_Id;
        private System.Windows.Forms.Label lbl_Nome;
        private System.Windows.Forms.Label lbl_Departamento;
        private System.Windows.Forms.Label lbl_Endereco;
        private System.Windows.Forms.Label lbl_Telefone;
        private System.Windows.Forms.Label lbl_Cpf;
        private System.Windows.Forms.TextBox txt_Id;
        private System.Windows.Forms.TextBox txt_Nome;
        private System.Windows.Forms.TextBox txt_Departamento;
        private System.Windows.Forms.TextBox txt_Endereco;
        private System.Windows.Forms.TextBox txt_Telefone;
        private System.Windows.Forms.TextBox txt_Cpf;
        private System.Windows.Forms.ListView lv_Funcionarios;
        private System.Windows.Forms.ColumnHeader col_Id;
        private System.Windows.Forms.ColumnHeader col_Nome;
        private System.Windows.Forms.ColumnHeader col_Departamento;
        private System.Windows.Forms.ColumnHeader col_Endereco;
        private System.Windows.Forms.ColumnHeader col_Telefone;
        private System.Windows.Forms.ColumnHeader col_Cpf;
        private System.Windows.Forms.Button btn_Adicionar;
        private System.Windows.Forms.Button btn_Remover;
        private System.Windows.Forms.Button btn_obter;
    }
}