package Main;

public class Fabrica {
	public static void main(String[] args) {
		
		Carro carro01;
		carro01 = new Carro();
		
		carro01.setCor("Azul");
		carro01.setAno("2011");
		
		System.out.println("Dados do carro");
		System.out.println("Cor: " + carro01.getCor());
		System.out.println("Ano: " + carro01.getAno());
		
	}

}
