package ATIV_CLASSE_ABSTRATAS_LUCASDESOUSASANTOS;

abstract class Pessoa {
	private String Nome;
	private String Telefone;
	private String Rg;
	private String Cpf;
	private String Estadocivil;
	private String Sexo;
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	public String getRg() {
		return Rg;
	}
	public void setRg(String rg) {
		Rg = rg;
	}
	public String getCpf() {
		return Cpf;
	}
	public void setCpf(String cpf) {
		Cpf = cpf;
	}
	public String getEstadocivil() {
		return Estadocivil;
	}
	public void setEstadocivil(String estadocivil) {
		Estadocivil = estadocivil;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	
	abstract void cadastroNome(String Nome);
	abstract void cadastroTelefone(String Telefone);
	abstract void cadastroRg(String Rg);
	abstract void cadastroCpf(String Cpf);
	abstract void cadastroEstadocivil(String Estadocivil);
	abstract void cadastroSexo(String Sexo);
}
