package ativ_fix_heranca_e_array_01_lucasdesousasantos;

import java.util.ArrayList;

public class Veiculo {
	//Declaração de objetos
	private String Cor;
	private String Ano;
	private String Modelo;
	private String Placa;
	
	//Métodos set
	public void setCor(String Cor) {
		this.Cor = Cor;
	}
	public void setAno(String Ano) {
		this.Ano = Ano;
	}
	public void setModelo(String Modelo) {
		this.Modelo = Modelo;
	}
	public void setPlaca(String Placa) {
		this.Placa = Placa;
	}
	
	//Métodos get
	public String getCor() {
		return Cor;
	}
	public String getAno() {
		return Ano;
	}
	public String getModelo() {
		return Modelo;
	}
	public String getPlaca() {
		return Placa;
	}
	
	
	ArrayList listVeiculo = new ArrayList();
	
	public void fabricarveiculo(Veiculo veiculo) {
		listVeiculo.add(veiculo);
	}
	public void venderVeiculo(Veiculo veiculo){
		listVeiculo.remove(veiculo);
	}
	
	public void exibirveiculo() {
		for(int i = 0; i < listVeiculo.size();i++) {
			if(listVeiculo.get(i) instanceof Carro) {
				Carro carro = (Carro) listVeiculo.get(i);
				System.out.println("Cor: " + carro.getCor());
				System.out.println("Ano: " + carro.getAno());
				System.out.println("Modelo: " + carro.getModelo());
				System.out.println("Placa: " + carro.getPlaca());
				System.out.println("Marca: " + carro.getMarca());
				System.out.println("Valor: " + carro.getValor());
			}else if(listVeiculo.get(i) instanceof Moto) {
				Moto moto = (Moto) listVeiculo.get(i);
				System.out.println("Cor: " + moto.getCor());
				System.out.println("Ano: " + moto.getAno());
				System.out.println("Modelo: " + moto.getModelo());
				System.out.println("Placa: " + moto.getPlaca());
				System.out.println("Marca: " + moto.getMarca());
				System.out.println("Valor: " + moto.getValor());
			}
		}
	}

}
