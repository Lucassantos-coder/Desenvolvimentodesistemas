package ativ_fix_int_lucasdesousasantos;

public class Pessoa {
	private String Nome;
	private String Telefone;
	private String Rg;
	private String Cpf;
	private String Estadocivil;
	private String Sexo;
	private String Rua;
	private String Bairro;
	private String Cidade;
	private String Cep;
	private String Complemento;
	
	public String getRua() {
		return Rua;
	}
	public String getBairro() {
		return Bairro;
	}
	public String getCidade() {
		return Cidade;
	}
	public String getCep() {
		return Cep;
	}
	public String getComplemento(){
		return Complemento;
	}
	public void setRua(String Rua) {
		this.Rua = Rua;
	}
	public void setBairro(String Bairro) {
		this.Bairro = Bairro;
	}
	public void setCidade(String Cidade) {
		this.Cidade = Cidade;
	}
	public void setCep(String Cep) {
		this.Cep = Cep;
	}
	public void setComplemento(String Complemento) {
		this.Complemento = Complemento;
	}
	public String getNome() {
		return Nome;
	}
	public String getTelefone() {
		return Telefone;
	}
	public String getRg() {
		return Rg;
	}
	public String getCpf() {
		return Cpf;
	}
	public String getEstadocivil() {
		return Estadocivil;
	}
	public String getSexo() {
		return Sexo;
	}
	
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	
	public void setTelefone(String Telefone) {
		this.Telefone = Telefone;
	}
	public void setRg(String Rg) {
		this.Rg = Rg;
	}
	public void setCpf(String Cpf) {
		this.Cpf = Cpf;
	}
	public void setEstadocivil(String Estadocivil) {
		this.Estadocivil = Estadocivil;
	}
	public void setSexo(String Sexo) {
		this.Sexo = Sexo;
	}
}
