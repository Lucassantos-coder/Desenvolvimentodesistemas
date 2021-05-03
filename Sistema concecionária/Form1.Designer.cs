
namespace Sistema_concecionária
{
    partial class Principal
    {
        /// <summary>
        /// Variável de designer necessária.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpar os recursos que estão sendo usados.
        /// </summary>
        /// <param name="disposing">true se for necessário descartar os recursos gerenciados; caso contrário, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código gerado pelo Windows Form Designer

        /// <summary>
        /// Método necessário para suporte ao Designer - não modifique 
        /// o conteúdo deste método com o editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.L_bemvindo = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.btn_funcionarios = new System.Windows.Forms.Button();
            this.btn_clientes = new System.Windows.Forms.Button();
            this.btn_veiculos = new System.Windows.Forms.Button();
            this.btn_pecas = new System.Windows.Forms.Button();
            this.btn_venda = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // L_bemvindo
            // 
            this.L_bemvindo.AutoSize = true;
            this.L_bemvindo.Location = new System.Drawing.Point(42, 22);
            this.L_bemvindo.Name = "L_bemvindo";
            this.L_bemvindo.Size = new System.Drawing.Size(124, 13);
            this.L_bemvindo.TabIndex = 0;
            this.L_bemvindo.Text = "         BEM-VINDO!         ";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(42, 62);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(133, 13);
            this.label1.TabIndex = 1;
            this.label1.Text = "Escolha a opção desejada";
            // 
            // btn_funcionarios
            // 
            this.btn_funcionarios.Location = new System.Drawing.Point(12, 103);
            this.btn_funcionarios.Name = "btn_funcionarios";
            this.btn_funcionarios.Size = new System.Drawing.Size(190, 23);
            this.btn_funcionarios.TabIndex = 2;
            this.btn_funcionarios.Text = "Gerenciamento de funcionários";
            this.btn_funcionarios.UseVisualStyleBackColor = true;
            this.btn_funcionarios.Click += new System.EventHandler(this.button1_Click);
            // 
            // btn_clientes
            // 
            this.btn_clientes.Location = new System.Drawing.Point(12, 132);
            this.btn_clientes.Name = "btn_clientes";
            this.btn_clientes.Size = new System.Drawing.Size(190, 23);
            this.btn_clientes.TabIndex = 3;
            this.btn_clientes.Text = "Gerenciamento de clientes";
            this.btn_clientes.UseVisualStyleBackColor = true;
            this.btn_clientes.Click += new System.EventHandler(this.button2_Click);
            // 
            // btn_veiculos
            // 
            this.btn_veiculos.Location = new System.Drawing.Point(12, 161);
            this.btn_veiculos.Name = "btn_veiculos";
            this.btn_veiculos.Size = new System.Drawing.Size(190, 23);
            this.btn_veiculos.TabIndex = 4;
            this.btn_veiculos.Text = "Gerenciamento de veículos";
            this.btn_veiculos.UseVisualStyleBackColor = true;
            this.btn_veiculos.Click += new System.EventHandler(this.button3_Click);
            // 
            // btn_pecas
            // 
            this.btn_pecas.Location = new System.Drawing.Point(12, 190);
            this.btn_pecas.Name = "btn_pecas";
            this.btn_pecas.Size = new System.Drawing.Size(190, 23);
            this.btn_pecas.TabIndex = 5;
            this.btn_pecas.Text = "Gerenciamento de peças";
            this.btn_pecas.UseVisualStyleBackColor = true;
            this.btn_pecas.Click += new System.EventHandler(this.button4_Click);
            // 
            // btn_venda
            // 
            this.btn_venda.Location = new System.Drawing.Point(12, 219);
            this.btn_venda.Name = "btn_venda";
            this.btn_venda.Size = new System.Drawing.Size(190, 23);
            this.btn_venda.TabIndex = 6;
            this.btn_venda.Text = "Realizar venda";
            this.btn_venda.UseVisualStyleBackColor = true;
            this.btn_venda.Click += new System.EventHandler(this.button5_Click);
            // 
            // Principal
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(214, 310);
            this.Controls.Add(this.btn_venda);
            this.Controls.Add(this.btn_pecas);
            this.Controls.Add(this.btn_veiculos);
            this.Controls.Add(this.btn_clientes);
            this.Controls.Add(this.btn_funcionarios);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.L_bemvindo);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedDialog;
            this.MaximizeBox = false;
            this.Name = "Principal";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Concecionária";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label L_bemvindo;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Button btn_funcionarios;
        private System.Windows.Forms.Button btn_clientes;
        private System.Windows.Forms.Button btn_veiculos;
        private System.Windows.Forms.Button btn_pecas;
        private System.Windows.Forms.Button btn_venda;
    }
}

