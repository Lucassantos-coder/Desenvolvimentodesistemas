
namespace Sistema_concecionária
{
    partial class Cad_clientes
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
            this.lv_Clientes = new System.Windows.Forms.ListView();
            this.col_Id = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.col_Nome = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.col_Endereco = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.col_Telefone = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.col_Cpf = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.lb_Id = new System.Windows.Forms.Label();
            this.lb_Nome = new System.Windows.Forms.Label();
            this.lb_Endereco = new System.Windows.Forms.Label();
            this.lb_Telefone = new System.Windows.Forms.Label();
            this.lb_Cpf = new System.Windows.Forms.Label();
            this.txt_Id = new System.Windows.Forms.TextBox();
            this.txt_Nome = new System.Windows.Forms.TextBox();
            this.txt_Endereco = new System.Windows.Forms.TextBox();
            this.txt_Telefone = new System.Windows.Forms.TextBox();
            this.txt_Cpf = new System.Windows.Forms.TextBox();
            this.btn_Adicionar = new System.Windows.Forms.Button();
            this.btn_Remover = new System.Windows.Forms.Button();
            this.btn_Obter = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // lv_Clientes
            // 
            this.lv_Clientes.Columns.AddRange(new System.Windows.Forms.ColumnHeader[] {
            this.col_Id,
            this.col_Nome,
            this.col_Endereco,
            this.col_Telefone,
            this.col_Cpf});
            this.lv_Clientes.HideSelection = false;
            this.lv_Clientes.Location = new System.Drawing.Point(12, 12);
            this.lv_Clientes.Name = "lv_Clientes";
            this.lv_Clientes.Size = new System.Drawing.Size(637, 178);
            this.lv_Clientes.TabIndex = 0;
            this.lv_Clientes.UseCompatibleStateImageBehavior = false;
            this.lv_Clientes.View = System.Windows.Forms.View.Details;
            // 
            // col_Id
            // 
            this.col_Id.Text = "ID";
            this.col_Id.Width = 42;
            // 
            // col_Nome
            // 
            this.col_Nome.Text = "Nome";
            this.col_Nome.Width = 169;
            // 
            // col_Endereco
            // 
            this.col_Endereco.Text = "Endereço";
            this.col_Endereco.Width = 138;
            // 
            // col_Telefone
            // 
            this.col_Telefone.Text = "Telefone";
            this.col_Telefone.Width = 128;
            // 
            // col_Cpf
            // 
            this.col_Cpf.Text = "Cpf";
            this.col_Cpf.Width = 147;
            // 
            // lb_Id
            // 
            this.lb_Id.AutoSize = true;
            this.lb_Id.Location = new System.Drawing.Point(12, 250);
            this.lb_Id.Name = "lb_Id";
            this.lb_Id.Size = new System.Drawing.Size(18, 13);
            this.lb_Id.TabIndex = 1;
            this.lb_Id.Text = "ID";
            // 
            // lb_Nome
            // 
            this.lb_Nome.AutoSize = true;
            this.lb_Nome.Location = new System.Drawing.Point(55, 250);
            this.lb_Nome.Name = "lb_Nome";
            this.lb_Nome.Size = new System.Drawing.Size(35, 13);
            this.lb_Nome.TabIndex = 2;
            this.lb_Nome.Text = "Nome";
            // 
            // lb_Endereco
            // 
            this.lb_Endereco.AutoSize = true;
            this.lb_Endereco.Location = new System.Drawing.Point(213, 250);
            this.lb_Endereco.Name = "lb_Endereco";
            this.lb_Endereco.Size = new System.Drawing.Size(53, 13);
            this.lb_Endereco.TabIndex = 3;
            this.lb_Endereco.Text = "Endereço";
            // 
            // lb_Telefone
            // 
            this.lb_Telefone.AutoSize = true;
            this.lb_Telefone.Location = new System.Drawing.Point(347, 250);
            this.lb_Telefone.Name = "lb_Telefone";
            this.lb_Telefone.Size = new System.Drawing.Size(49, 13);
            this.lb_Telefone.TabIndex = 4;
            this.lb_Telefone.Text = "Telefone";
            // 
            // lb_Cpf
            // 
            this.lb_Cpf.AutoSize = true;
            this.lb_Cpf.Location = new System.Drawing.Point(484, 250);
            this.lb_Cpf.Name = "lb_Cpf";
            this.lb_Cpf.Size = new System.Drawing.Size(23, 13);
            this.lb_Cpf.TabIndex = 5;
            this.lb_Cpf.Text = "Cpf";
            // 
            // txt_Id
            // 
            this.txt_Id.Location = new System.Drawing.Point(12, 266);
            this.txt_Id.Name = "txt_Id";
            this.txt_Id.Size = new System.Drawing.Size(37, 20);
            this.txt_Id.TabIndex = 6;
            // 
            // txt_Nome
            // 
            this.txt_Nome.Location = new System.Drawing.Point(55, 266);
            this.txt_Nome.Name = "txt_Nome";
            this.txt_Nome.Size = new System.Drawing.Size(155, 20);
            this.txt_Nome.TabIndex = 7;
            // 
            // txt_Endereco
            // 
            this.txt_Endereco.Location = new System.Drawing.Point(216, 265);
            this.txt_Endereco.Name = "txt_Endereco";
            this.txt_Endereco.Size = new System.Drawing.Size(128, 20);
            this.txt_Endereco.TabIndex = 8;
            // 
            // txt_Telefone
            // 
            this.txt_Telefone.Location = new System.Drawing.Point(350, 266);
            this.txt_Telefone.Name = "txt_Telefone";
            this.txt_Telefone.Size = new System.Drawing.Size(131, 20);
            this.txt_Telefone.TabIndex = 9;
            // 
            // txt_Cpf
            // 
            this.txt_Cpf.Location = new System.Drawing.Point(487, 266);
            this.txt_Cpf.Name = "txt_Cpf";
            this.txt_Cpf.Size = new System.Drawing.Size(147, 20);
            this.txt_Cpf.TabIndex = 10;
            // 
            // btn_Adicionar
            // 
            this.btn_Adicionar.Location = new System.Drawing.Point(15, 319);
            this.btn_Adicionar.Name = "btn_Adicionar";
            this.btn_Adicionar.Size = new System.Drawing.Size(157, 23);
            this.btn_Adicionar.TabIndex = 11;
            this.btn_Adicionar.Text = "Adicionar";
            this.btn_Adicionar.UseVisualStyleBackColor = true;
            this.btn_Adicionar.Click += new System.EventHandler(this.btn_Adicionar_Click);
            // 
            // btn_Remover
            // 
            this.btn_Remover.Location = new System.Drawing.Point(15, 348);
            this.btn_Remover.Name = "btn_Remover";
            this.btn_Remover.Size = new System.Drawing.Size(157, 23);
            this.btn_Remover.TabIndex = 12;
            this.btn_Remover.Text = "Remover";
            this.btn_Remover.UseVisualStyleBackColor = true;
            this.btn_Remover.Click += new System.EventHandler(this.btn_Remover_Click);
            // 
            // btn_Obter
            // 
            this.btn_Obter.Location = new System.Drawing.Point(15, 377);
            this.btn_Obter.Name = "btn_Obter";
            this.btn_Obter.Size = new System.Drawing.Size(157, 23);
            this.btn_Obter.TabIndex = 13;
            this.btn_Obter.Text = "Obter";
            this.btn_Obter.UseVisualStyleBackColor = true;
            this.btn_Obter.Click += new System.EventHandler(this.btn_Obter_Click);
            // 
            // Cad_clientes
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(654, 450);
            this.Controls.Add(this.btn_Obter);
            this.Controls.Add(this.btn_Remover);
            this.Controls.Add(this.btn_Adicionar);
            this.Controls.Add(this.txt_Cpf);
            this.Controls.Add(this.txt_Telefone);
            this.Controls.Add(this.txt_Endereco);
            this.Controls.Add(this.txt_Nome);
            this.Controls.Add(this.txt_Id);
            this.Controls.Add(this.lb_Cpf);
            this.Controls.Add(this.lb_Telefone);
            this.Controls.Add(this.lb_Endereco);
            this.Controls.Add(this.lb_Nome);
            this.Controls.Add(this.lb_Id);
            this.Controls.Add(this.lv_Clientes);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedDialog;
            this.MaximizeBox = false;
            this.Name = "Cad_clientes";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Concecionária";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.ListView lv_Clientes;
        private System.Windows.Forms.ColumnHeader col_Id;
        private System.Windows.Forms.ColumnHeader col_Nome;
        private System.Windows.Forms.ColumnHeader col_Endereco;
        private System.Windows.Forms.ColumnHeader col_Telefone;
        private System.Windows.Forms.ColumnHeader col_Cpf;
        private System.Windows.Forms.Label lb_Id;
        private System.Windows.Forms.Label lb_Nome;
        private System.Windows.Forms.Label lb_Endereco;
        private System.Windows.Forms.Label lb_Telefone;
        private System.Windows.Forms.Label lb_Cpf;
        private System.Windows.Forms.TextBox txt_Id;
        private System.Windows.Forms.TextBox txt_Nome;
        private System.Windows.Forms.TextBox txt_Endereco;
        private System.Windows.Forms.TextBox txt_Telefone;
        private System.Windows.Forms.TextBox txt_Cpf;
        private System.Windows.Forms.Button btn_Adicionar;
        private System.Windows.Forms.Button btn_Remover;
        private System.Windows.Forms.Button btn_Obter;
    }
}