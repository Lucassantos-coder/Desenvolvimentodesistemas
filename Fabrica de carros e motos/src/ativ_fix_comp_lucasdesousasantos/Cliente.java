package ativ_fix_comp_lucasdesousasantos;

public class Cliente extends Pessoa {
	private String Login;
	private String Senha;
	
	public String getLogin(){
		return Login;
	}
	public void setLogin(String Login) {
		this.Login = Login;
	}
	public String getSenha(){
		return Senha;
	}
	public void setSenha(String Senha) {
		this.Senha = Senha;
	}
}
