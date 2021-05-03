
namespace Sistema_concecionária
{
    partial class Cad_pecas
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
            this.lv_Pecas = new System.Windows.Forms.ListView();
            this.lb_Id = new System.Windows.Forms.Label();
            this.lb_Categoria = new System.Windows.Forms.Label();
            this.lb_Fabricante = new System.Windows.Forms.Label();
            this.lb_Ano = new System.Windows.Forms.Label();
            this.lb_Valor = new System.Windows.Forms.Label();
            this.label6 = new System.Windows.Forms.Label();
            this.btn_Adicionar = new System.Windows.Forms.Button();
            this.btn_Remover = new System.Windows.Forms.Button();
            this.btn_Obter = new System.Windows.Forms.Button();
            this.txt_Id = new System.Windows.Forms.TextBox();
            this.txt_Categoria = new System.Windows.Forms.TextBox();
            this.txt_Fabricante = new System.Windows.Forms.TextBox();
            this.txt_Ano = new System.Windows.Forms.TextBox();
            this.txt_Valor = new System.Windows.Forms.TextBox();
            this.col_Id = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.col_Categoria = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.col_Fabricante = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.col_Ano = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.col_Valor = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.SuspendLayout();
            // 
            // lv_Pecas
            // 
            this.lv_Pecas.Columns.AddRange(new System.Windows.Forms.ColumnHeader[] {
            this.col_Id,
            this.col_Categoria,
            this.col_Fabricante,
            this.col_Ano,
            this.col_Valor});
            this.lv_Pecas.HideSelection = false;
            this.lv_Pecas.Location = new System.Drawing.Point(12, 12);
            this.lv_Pecas.Name = "lv_Pecas";
            this.lv_Pecas.Size = new System.Drawing.Size(563, 186);
            this.lv_Pecas.TabIndex = 0;
            this.lv_Pecas.UseCompatibleStateImageBehavior = false;
            this.lv_Pecas.View = System.Windows.Forms.View.Details;
            // 
            // lb_Id
            // 
            this.lb_Id.AutoSize = true;
            this.lb_Id.Location = new System.Drawing.Point(12, 254);
            this.lb_Id.Name = "lb_Id";
            this.lb_Id.Size = new System.Drawing.Size(18, 13);
            this.lb_Id.TabIndex = 1;
            this.lb_Id.Text = "ID";
            // 
            // lb_Categoria
            // 
            this.lb_Categoria.AutoSize = true;
            this.lb_Categoria.Location = new System.Drawing.Point(80, 254);
            this.lb_Categoria.Name = "lb_Categoria";
            this.lb_Categoria.Size = new System.Drawing.Size(52, 13);
            this.lb_Categoria.TabIndex = 2;
            this.lb_Categoria.Text = "Categoria";
            // 
            // lb_Fabricante
            // 
            this.lb_Fabricante.AutoSize = true;
            this.lb_Fabricante.Location = new System.Drawing.Point(224, 254);
            this.lb_Fabricante.Name = "lb_Fabricante";
            this.lb_Fabricante.Size = new System.Drawing.Size(57, 13);
            this.lb_Fabricante.TabIndex = 3;
            this.lb_Fabricante.Text = "Fabricante";
            // 
            // lb_Ano
            // 
            this.lb_Ano.AutoSize = true;
            this.lb_Ano.Location = new System.Drawing.Point(370, 254);
            this.lb_Ano.Name = "lb_Ano";
            this.lb_Ano.Size = new System.Drawing.Size(26, 13);
            this.lb_Ano.TabIndex = 4;
            this.lb_Ano.Text = "Ano";
            // 
            // lb_Valor
            // 
            this.lb_Valor.AutoSize = true;
            this.lb_Valor.Location = new System.Drawing.Point(465, 254);
            this.lb_Valor.Name = "lb_Valor";
            this.lb_Valor.Size = new System.Drawing.Size(31, 13);
            this.lb_Valor.TabIndex = 5;
            this.lb_Valor.Text = "Valor";
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(415, 251);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(0, 13);
            this.label6.TabIndex = 6;
            // 
            // btn_Adicionar
            // 
            this.btn_Adicionar.Location = new System.Drawing.Point(12, 317);
            this.btn_Adicionar.Name = "btn_Adicionar";
            this.btn_Adicionar.Size = new System.Drawing.Size(168, 23);
            this.btn_Adicionar.TabIndex = 7;
            this.btn_Adicionar.Text = "Adicionar";
            this.btn_Adicionar.UseVisualStyleBackColor = true;
            this.btn_Adicionar.Click += new System.EventHandler(this.btn_Adicionar_Click);
            // 
            // btn_Remover
            // 
            this.btn_Remover.Location = new System.Drawing.Point(12, 346);
            this.btn_Remover.Name = "btn_Remover";
            this.btn_Remover.Size = new System.Drawing.Size(168, 23);
            this.btn_Remover.TabIndex = 8;
            this.btn_Remover.Text = "Remover";
            this.btn_Remover.UseVisualStyleBackColor = true;
            this.btn_Remover.Click += new System.EventHandler(this.btn_Remover_Click);
            // 
            // btn_Obter
            // 
            this.btn_Obter.Location = new System.Drawing.Point(12, 375);
            this.btn_Obter.Name = "btn_Obter";
            this.btn_Obter.Size = new System.Drawing.Size(168, 23);
            this.btn_Obter.TabIndex = 9;
            this.btn_Obter.Text = "Obter";
            this.btn_Obter.UseVisualStyleBackColor = true;
            this.btn_Obter.Click += new System.EventHandler(this.btn_Obter_Click);
            // 
            // txt_Id
            // 
            this.txt_Id.Location = new System.Drawing.Point(12, 270);
            this.txt_Id.Name = "txt_Id";
            this.txt_Id.Size = new System.Drawing.Size(62, 20);
            this.txt_Id.TabIndex = 10;
            // 
            // txt_Categoria
            // 
            this.txt_Categoria.Location = new System.Drawing.Point(80, 270);
            this.txt_Categoria.Name = "txt_Categoria";
            this.txt_Categoria.Size = new System.Drawing.Size(141, 20);
            this.txt_Categoria.TabIndex = 11;
            // 
            // txt_Fabricante
            // 
            this.txt_Fabricante.Location = new System.Drawing.Point(227, 270);
            this.txt_Fabricante.Name = "txt_Fabricante";
            this.txt_Fabricante.Size = new System.Drawing.Size(140, 20);
            this.txt_Fabricante.TabIndex = 12;
            // 
            // txt_Ano
            // 
            this.txt_Ano.Location = new System.Drawing.Point(373, 270);
            this.txt_Ano.Name = "txt_Ano";
            this.txt_Ano.Size = new System.Drawing.Size(86, 20);
            this.txt_Ano.TabIndex = 13;
            // 
            // txt_Valor
            // 
            this.txt_Valor.Location = new System.Drawing.Point(465, 270);
            this.txt_Valor.Name = "txt_Valor";
            this.txt_Valor.Size = new System.Drawing.Size(91, 20);
            this.txt_Valor.TabIndex = 14;
            // 
            // col_Id
            // 
            this.col_Id.Text = "ID";
            this.col_Id.Width = 49;
            // 
            // col_Categoria
            // 
            this.col_Categoria.Text = "Categoria";
            this.col_Categoria.Width = 165;
            // 
            // col_Fabricante
            // 
            this.col_Fabricante.Text = "Fabricante";
            this.col_Fabricante.Width = 142;
            // 
            // col_Ano
            // 
            this.col_Ano.Text = "Ano";
            this.col_Ano.Width = 89;
            // 
            // col_Valor
            // 
            this.col_Valor.Text = "Valor";
            this.col_Valor.Width = 95;
            // 
            // Cad_pecas
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(587, 450);
            this.Controls.Add(this.txt_Valor);
            this.Controls.Add(this.txt_Ano);
            this.Controls.Add(this.txt_Fabricante);
            this.Controls.Add(this.txt_Categoria);
            this.Controls.Add(this.txt_Id);
            this.Controls.Add(this.btn_Obter);
            this.Controls.Add(this.btn_Remover);
            this.Controls.Add(this.btn_Adicionar);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.lb_Valor);
            this.Controls.Add(this.lb_Ano);
            this.Controls.Add(this.lb_Fabricante);
            this.Controls.Add(this.lb_Categoria);
            this.Controls.Add(this.lb_Id);
            this.Controls.Add(this.lv_Pecas);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedDialog;
            this.MaximizeBox = false;
            this.Name = "Cad_pecas";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Concecionária";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.ListView lv_Pecas;
        private System.Windows.Forms.ColumnHeader col_Id;
        private System.Windows.Forms.ColumnHeader col_Categoria;
        private System.Windows.Forms.ColumnHeader col_Fabricante;
        private System.Windows.Forms.ColumnHeader col_Ano;
        private System.Windows.Forms.ColumnHeader col_Valor;
        private System.Windows.Forms.Label lb_Id;
        private System.Windows.Forms.Label lb_Categoria;
        private System.Windows.Forms.Label lb_Fabricante;
        private System.Windows.Forms.Label lb_Ano;
        private System.Windows.Forms.Label lb_Valor;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Button btn_Adicionar;
        private System.Windows.Forms.Button btn_Remover;
        private System.Windows.Forms.Button btn_Obter;
        private System.Windows.Forms.TextBox txt_Id;
        private System.Windows.Forms.TextBox txt_Categoria;
        private System.Windows.Forms.TextBox txt_Fabricante;
        private System.Windows.Forms.TextBox txt_Ano;
        private System.Windows.Forms.TextBox txt_Valor;
    }
}