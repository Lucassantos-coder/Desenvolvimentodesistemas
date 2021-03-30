package Escopos_variáveis;

public class Main {

	public static void main(String[] args) {
		Escopovariavel escopo = new Escopovariavel();
		
		escopo.setValor(10);
		
		System.out.println(escopo.getValor());
		System.out.println(escopo.calculavalor(20));
		System.out.println(escopo.getValor());
	}

}
