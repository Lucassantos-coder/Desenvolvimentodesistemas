package ATIV_SIM_02_LUCASDESOUSASANTOS;

import java.util.ArrayList;

public class Veiculo {
	String Cor;
	String Ano;
	String Modelo;
	String Placa;
	
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
	
	ArrayList listVeiculo = new ArrayList();
	
	public void Cadastroveiculo(Veiculo veiculo) {
		listVeiculo.add(veiculo);		
	}
	
	public void Venderveiculo(Veiculo veiculo) {
		listVeiculo.remove(veiculo);
	}
	
	public void Exibedados() {
		for(int i = 0; i < listVeiculo.size();i++) {
			if(listVeiculo.get(i) instanceof Carro) {
				Carro carro = (Carro) listVeiculo.get(i);
				System.out.println("Marca: "+carro.getMarca());
				System.out.println("Modelo: "+carro.getModelo());
				System.out.println("Cor: "+carro.getCor());
				System.out.println("Ano: "+carro.getAno());
				System.out.println("Placa: "+carro.getPlaca());
				System.out.println("Valor: "+carro.getValor());
			}else if(listVeiculo.get(i) instanceof Moto) {
				Moto moto = (Moto) listVeiculo.get(i);
				System.out.println("Marca: "+moto.getMarca());
				System.out.println("Modelo: "+moto.getModelo());
				System.out.println("Cor: "+moto.getCor());
				System.out.println("Ano: "+moto.getAno());
				System.out.println("Placa: "+moto.getPlaca());
				System.out.println("Valor: "+moto.getValor());
			}
		}
	}
}
