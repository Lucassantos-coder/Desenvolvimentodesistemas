package ativ_fix_comp_lucasdesousasantos;

public class Endereco {
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
	
	public void exibeendereco(Endereco endereco) {
		System.out.println("Rua: "+endereco.getRua());
		System.out.println("Bairro: "+endereco.getBairro());
		System.out.println("Cidade: "+endereco.getCidade());
		System.out.println("Cep: "+endereco.getCep());
		System.out.println("Complemento: "+endereco.getComplemento());
	}
}
	