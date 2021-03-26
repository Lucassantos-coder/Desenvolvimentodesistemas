package ativ_fix_int_lucasdesousasantos;

public class Cliente extends Pessoa implements Dados {
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
	
	public void Exibedados() {
		System.out.println(getNome());
		System.out.println(getTelefone());
		System.out.println(getRg());
		System.out.println(getCpf());
		System.out.println(getEstadocivil());
		System.out.println(getSexo());
		System.out.println(getRua());
		System.out.println(getBairro());
		System.out.println(getCidade());
		System.out.println(getCep());
		System.out.println(getComplemento());
		System.out.println(getLogin());
		System.out.println(getSenha());
	}
}
