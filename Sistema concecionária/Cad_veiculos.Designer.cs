
namespace Sistema_concecionária
{
    partial class Cad_veiculos
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
            this.lv_Veiculos = new System.Windows.Forms.ListView();
            this.lb_Id = new System.Windows.Forms.Label();
            this.lb_Nome = new System.Windows.Forms.Label();
            this.lb_Categoria = new System.Windows.Forms.Label();
            this.lb_Marca = new System.Windows.Forms.Label();
            this.lb_Modelo = new System.Windows.Forms.Label();
            this.lb_Ano = new System.Windows.Forms.Label();
            this.lb_Valor = new System.Windows.Forms.Label();
            this.txt_Id = new System.Windows.Forms.TextBox();
            this.txt_Nome = new System.Windows.Forms.TextBox();
            this.txt_Categoria = new System.Windows.Forms.TextBox();
            this.txt_Marca = new System.Windows.Forms.TextBox();
            this.txt_Modelo = new System.Windows.Forms.TextBox();
            this.txt_Ano = new System.Windows.Forms.TextBox();
            this.txt_Valor = new System.Windows.Forms.TextBox();
            this.btn_Adicionar = new System.Windows.Forms.Button();
            this.btn_Remover = new System.Windows.Forms.Button();
            this.btn_Obter = new System.Windows.Forms.Button();
            this.col_ID = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.col_Nome = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.col_Categoria = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.col_Marca = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.col_Modelo = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.col_Ano = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.col_Valor = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.SuspendLayout();
            // 
            // lv_Veiculos
            // 
            this.lv_Veiculos.Columns.AddRange(new System.Windows.Forms.ColumnHeader[] {
            this.col_ID,
            this.col_Nome,
            this.col_Categoria,
            this.col_Marca,
            this.col_Modelo,
            this.col_Ano,
            this.col_Valor});
            this.lv_Veiculos.HideSelection = false;
            this.lv_Veiculos.Location = new System.Drawing.Point(12, 12);
            this.lv_Veiculos.Name = "lv_Veiculos";
            this.lv_Veiculos.Size = new System.Drawing.Size(776, 180);
            this.lv_Veiculos.TabIndex = 0;
            this.lv_Veiculos.UseCompatibleStateImageBehavior = false;
            this.lv_Veiculos.View = System.Windows.Forms.View.Details;
            // 
            // lb_Id
            // 
            this.lb_Id.AutoSize = true;
            this.lb_Id.Location = new System.Drawing.Point(12, 243);
            this.lb_Id.Name = "lb_Id";
            this.lb_Id.Size = new System.Drawing.Size(18, 13);
            this.lb_Id.TabIndex = 1;
            this.lb_Id.Text = "ID";
            // 
            // lb_Nome
            // 
            this.lb_Nome.AutoSize = true;
            this.lb_Nome.Location = new System.Drawing.Point(65, 243);
            this.lb_Nome.Name = "lb_Nome";
            this.lb_Nome.Size = new System.Drawing.Size(35, 13);
            this.lb_Nome.TabIndex = 2;
            this.lb_Nome.Text = "Nome";
            // 
            // lb_Categoria
            // 
            this.lb_Categoria.AutoSize = true;
            this.lb_Categoria.Location = new System.Drawing.Point(186, 243);
            this.lb_Categoria.Name = "lb_Categoria";
            this.lb_Categoria.Size = new System.Drawing.Size(52, 13);
            this.lb_Categoria.TabIndex = 3;
            this.lb_Categoria.Text = "Categoria";
            // 
            // lb_Marca
            // 
            this.lb_Marca.AutoSize = true;
            this.lb_Marca.Location = new System.Drawing.Point(349, 243);
            this.lb_Marca.Name = "lb_Marca";
            this.lb_Marca.Size = new System.Drawing.Size(37, 13);
            this.lb_Marca.TabIndex = 4;
            this.lb_Marca.Text = "Marca";
            // 
            // lb_Modelo
            // 
            this.lb_Modelo.AutoSize = true;
            this.lb_Modelo.Location = new System.Drawing.Point(496, 243);
            this.lb_Modelo.Name = "lb_Modelo";
            this.lb_Modelo.Size = new System.Drawing.Size(42, 13);
            this.lb_Modelo.TabIndex = 5;
            this.lb_Modelo.Text = "Modelo";
            // 
            // lb_Ano
            // 
            this.lb_Ano.AutoSize = true;
            this.lb_Ano.Location = new System.Drawing.Point(599, 243);
            this.lb_Ano.Name = "lb_Ano";
            this.lb_Ano.Size = new System.Drawing.Size(26, 13);
            this.lb_Ano.TabIndex = 6;
            this.lb_Ano.Text = "Ano";
            // 
            // lb_Valor
            // 
            this.lb_Valor.AutoSize = true;
            this.lb_Valor.Location = new System.Drawing.Point(695, 243);
            this.lb_Valor.Name = "lb_Valor";
            this.lb_Valor.Size = new System.Drawing.Size(31, 13);
            this.lb_Valor.TabIndex = 7;
            this.lb_Valor.Text = "Valor";
            // 
            // txt_Id
            // 
            this.txt_Id.Location = new System.Drawing.Point(12, 259);
            this.txt_Id.Name = "txt_Id";
            this.txt_Id.Size = new System.Drawing.Size(45, 20);
            this.txt_Id.TabIndex = 8;
            // 
            // txt_Nome
            // 
            this.txt_Nome.Location = new System.Drawing.Point(63, 259);
            this.txt_Nome.Name = "txt_Nome";
            this.txt_Nome.Size = new System.Drawing.Size(120, 20);
            this.txt_Nome.TabIndex = 9;
            // 
            // txt_Categoria
            // 
            this.txt_Categoria.Location = new System.Drawing.Point(189, 259);
            this.txt_Categoria.Name = "txt_Categoria";
            this.txt_Categoria.Size = new System.Drawing.Size(153, 20);
            this.txt_Categoria.TabIndex = 10;
            // 
            // txt_Marca
            // 
            this.txt_Marca.Location = new System.Drawing.Point(348, 259);
            this.txt_Marca.Name = "txt_Marca";
            this.txt_Marca.Size = new System.Drawing.Size(142, 20);
            this.txt_Marca.TabIndex = 11;
            // 
            // txt_Modelo
            // 
            this.txt_Modelo.Location = new System.Drawing.Point(496, 259);
            this.txt_Modelo.Name = "txt_Modelo";
            this.txt_Modelo.Size = new System.Drawing.Size(100, 20);
            this.txt_Modelo.TabIndex = 12;
            // 
            // txt_Ano
            // 
            this.txt_Ano.Location = new System.Drawing.Point(602, 259);
            this.txt_Ano.Name = "txt_Ano";
            this.txt_Ano.Size = new System.Drawing.Size(90, 20);
            this.txt_Ano.TabIndex = 13;
            // 
            // txt_Valor
            // 
            this.txt_Valor.Location = new System.Drawing.Point(698, 259);
            this.txt_Valor.Name = "txt_Valor";
            this.txt_Valor.Size = new System.Drawing.Size(90, 20);
            this.txt_Valor.TabIndex = 14;
            // 
            // btn_Adicionar
            // 
            this.btn_Adicionar.Location = new System.Drawing.Point(12, 298);
            this.btn_Adicionar.Name = "btn_Adicionar";
            this.btn_Adicionar.Size = new System.Drawing.Size(171, 23);
            this.btn_Adicionar.TabIndex = 15;
            this.btn_Adicionar.Text = "Adicionar";
            this.btn_Adicionar.UseVisualStyleBackColor = true;
            this.btn_Adicionar.Click += new System.EventHandler(this.btn_Adicionar_Click);
            // 
            // btn_Remover
            // 
            this.btn_Remover.Location = new System.Drawing.Point(12, 327);
            this.btn_Remover.Name = "btn_Remover";
            this.btn_Remover.Size = new System.Drawing.Size(171, 23);
            this.btn_Remover.TabIndex = 16;
            this.btn_Remover.Text = "Remover";
            this.btn_Remover.UseVisualStyleBackColor = true;
            this.btn_Remover.Click += new System.EventHandler(this.btn_Remover_Click);
            // 
            // btn_Obter
            // 
            this.btn_Obter.Location = new System.Drawing.Point(12, 356);
            this.btn_Obter.Name = "btn_Obter";
            this.btn_Obter.Size = new System.Drawing.Size(171, 23);
            this.btn_Obter.TabIndex = 17;
            this.btn_Obter.Text = "Obter";
            this.btn_Obter.UseVisualStyleBackColor = true;
            this.btn_Obter.Click += new System.EventHandler(this.btn_Obter_Click);
            // 
            // col_ID
            // 
            this.col_ID.Text = "ID";
            this.col_ID.Width = 44;
            // 
            // col_Nome
            // 
            this.col_Nome.Text = "Nome";
            this.col_Nome.Width = 143;
            // 
            // col_Categoria
            // 
            this.col_Categoria.Text = "Categoria";
            this.col_Categoria.Width = 147;
            // 
            // col_Marca
            // 
            this.col_Marca.Text = "Marca";
            this.col_Marca.Width = 144;
            // 
            // col_Modelo
            // 
            this.col_Modelo.Text = "Modelo";
            this.col_Modelo.Width = 113;
            // 
            // col_Ano
            // 
            this.col_Ano.Text = "Ano";
            this.col_Ano.Width = 83;
            // 
            // col_Valor
            // 
            this.col_Valor.Text = "Valor";
            this.col_Valor.Width = 97;
            // 
            // Cad_veiculos
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.btn_Obter);
            this.Controls.Add(this.btn_Remover);
            this.Controls.Add(this.btn_Adicionar);
            this.Controls.Add(this.txt_Valor);
            this.Controls.Add(this.txt_Ano);
            this.Controls.Add(this.txt_Modelo);
            this.Controls.Add(this.txt_Marca);
            this.Controls.Add(this.txt_Categoria);
            this.Controls.Add(this.txt_Nome);
            this.Controls.Add(this.txt_Id);
            this.Controls.Add(this.lb_Valor);
            this.Controls.Add(this.lb_Ano);
            this.Controls.Add(this.lb_Modelo);
            this.Controls.Add(this.lb_Marca);
            this.Controls.Add(this.lb_Categoria);
            this.Controls.Add(this.lb_Nome);
            this.Controls.Add(this.lb_Id);
            this.Controls.Add(this.lv_Veiculos);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedDialog;
            this.MaximizeBox = false;
            this.Name = "Cad_veiculos";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Concecionária";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.ListView lv_Veiculos;
        private System.Windows.Forms.ColumnHeader col_ID;
        private System.Windows.Forms.ColumnHeader col_Nome;
        private System.Windows.Forms.ColumnHeader col_Categoria;
        private System.Windows.Forms.ColumnHeader col_Marca;
        private System.Windows.Forms.ColumnHeader col_Modelo;
        private System.Windows.Forms.ColumnHeader col_Ano;
        private System.Windows.Forms.ColumnHeader col_Valor;
        private System.Windows.Forms.Label lb_Id;
        private System.Windows.Forms.Label lb_Nome;
        private System.Windows.Forms.Label lb_Categoria;
        private System.Windows.Forms.Label lb_Marca;
        private System.Windows.Forms.Label lb_Modelo;
        private System.Windows.Forms.Label lb_Ano;
        private System.Windows.Forms.Label lb_Valor;
        private System.Windows.Forms.TextBox txt_Id;
        private System.Windows.Forms.TextBox txt_Nome;
        private System.Windows.Forms.TextBox txt_Categoria;
        private System.Windows.Forms.TextBox txt_Marca;
        private System.Windows.Forms.TextBox txt_Modelo;
        private System.Windows.Forms.TextBox txt_Ano;
        private System.Windows.Forms.TextBox txt_Valor;
        private System.Windows.Forms.Button btn_Adicionar;
        private System.Windows.Forms.Button btn_Remover;
        private System.Windows.Forms.Button btn_Obter;
    }
}