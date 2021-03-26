package aula_09_construtores_lucasdesousasantos;

public class Carro {
	
	private String Cor;
	private String Ano;
	private String Modelo;
	private String Placa;
	private String Marca;	
	private Double Valor;
	
	public String getCor() {
		return Cor;
	}
	public void setCor(String cor) {
		Cor = cor;
	}
	public String getAno() {
		return Ano;
	}
	public void setAno(String ano) {
		Ano = ano;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public String getPlaca() {
		return Placa;
	}
	public void setPlaca(String placa) {
		Placa = placa;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public Double getValor() {
		return Valor;
	}
	public void setValor(Double valor) {
		Valor = valor;
	}
	
	Carro(String cor, String ano, String modelo, String placa, String marca, double valor){
		Cor = cor;
		Ano = ano;
		Modelo = modelo;
		Placa = placa;
		Marca = marca;
		Valor = valor;
	}
}
