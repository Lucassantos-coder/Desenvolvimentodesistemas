package aula_09_construtores_lucasdesousasantos;

public class Fabrica {

	public static void main(String[] args) {
		
		Carro carro = new Carro("Azul", "2011", "BMW", "abc1234", "BMW", 2011.00);
		System.out.println("Dados do carro cadastrado:");
		System.out.println(carro.getCor());
		System.out.println(carro.getAno());
		System.out.println(carro.getModelo());
		System.out.println(carro.getPlaca());
		System.out.println(carro.getMarca());
		System.out.println(carro.getValor());

	}

}
