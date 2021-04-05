package ATIV_SIM_02_LUCASDESOUSASANTOS;

public class Cliente extends Pessoa {
	//Atributos
	private String Login;
	private String Senha;
	
	//Metodos get e set
	public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		Login = login;
	}
	public String getSenha() {
		return Senha;
	}
	public void setSenha(String senha) {
		Senha = senha;
	}
	
}
