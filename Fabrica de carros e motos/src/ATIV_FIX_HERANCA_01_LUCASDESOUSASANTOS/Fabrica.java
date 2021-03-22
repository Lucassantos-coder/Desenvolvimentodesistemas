package ATIV_FIX_HERANCA_01_LUCASDESOUSASANTOS;

public class Fabrica {
public static void main(String[] args) {
		//Instanciação dos objetos
		Carro carro01;
		carro01 = new Carro();
		Moto moto01;
		moto01 = new Moto();
		
		//Setando os valores
		carro01.setCor("Azul");
		carro01.setAno("2011");
		carro01.setModelo("BMW");
		carro01.setPlaca("abc1234");
		carro01.setMarca("BMW");
		carro01.setValor(2011.00);
		
		moto01.setCor("Azul");
		moto01.setAno("2011");
		moto01.setModelo("Ninja");
		moto01.setPlaca("abc1234");
		moto01.setMarca("Honda");
		moto01.setValor(2012.00);
		
		//Dados dos veículos cadastrados
		System.out.println("Dados do carro");
		System.out.println("Cor: " + carro01.getCor());
		System.out.println("Ano: " + carro01.getAno());
		System.out.println("Modelo: " + carro01.getModelo());
		System.out.println("Placa: " + carro01.getPlaca());
		System.out.println("Marca: " + carro01.getMarca());
		System.out.println("Valor: " + carro01.getValor());
		System.out.println("");
		
		System.out.println("Dados da moto");
		System.out.println("Cor: " + moto01.getCor());
		System.out.println("Ano: " + moto01.getAno());
		System.out.println("Modelo: " + moto01.getModelo());
		System.out.println("Placa: " + moto01.getPlaca());
		System.out.println("Marca: " + moto01.getMarca());
		System.out.println("Valor: " + moto01.getValor());
	}

}
