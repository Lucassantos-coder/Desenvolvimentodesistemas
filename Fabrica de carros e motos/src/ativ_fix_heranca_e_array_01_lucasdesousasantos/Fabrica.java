package ativ_fix_heranca_e_array_01_lucasdesousasantos;

public class Fabrica {
public static void main(String[] args) {
		//Instancia��o dos objetos
		Carro carro;
		carro = new Carro();
		Moto moto;
		moto = new Moto();
		
		//Setando os valores
		
		carro.setCor("Azul");
		carro.setAno("2011");
		carro.setModelo("BMW");
		carro.setPlaca("abc1234");
		carro.setMarca("BMW");
		carro.setValor(2011.00);
		carro.fabricarveiculo(carro);
		moto.setCor("Azul");
		moto.setAno("2011");
		moto.setModelo("Ninja");
		moto.setPlaca("abc1234");
		moto.setMarca("Honda");
		moto.setValor(2012.00);
		moto.fabricarveiculo(moto);
		//Dados dos ve�culos cadastrados
		carro.exibirveiculo();
		System.out.println(" ");
		moto.exibirveiculo();
		
		//Venda de ve�culos
		carro.venderVeiculo(carro);
		carro.exibirveiculo();
		System.out.println(" ");
		moto.venderVeiculo(moto);
		moto.exibirveiculo();
	}

}
