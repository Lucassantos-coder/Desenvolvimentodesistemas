package Escopos_variáveis;

public class Escopovariavel {
	
	
	private int valor;// Atributo valor

	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public int calculavalor(int valor) {
		
		valor = valor + 10;
		
		//parametro valor
		
		return valor;
	
	}
	
	public int teste() {
		int valor = 5;
	
		if(true) {
			valor--;
		}
	this.valor=valor;
	
	return valor;
	}
	
	public void outroTeste() {
		
		for (int i=0; 1<10; i++) {
			System.out.println(i);
		}
		
		//i++ erro de compilação
	
		int=j;
		for (int j = 0; j<10; j++) {
			System.out.println(j);
		}
	}
	
	public void maisumTeste() {
		boolean flag = true;
		if(flag) {
			int umaVariavel =10;
			umaVariavel++;
			System.out.println(umaVariavel);
		}
		//System.out.println(umaVariavel); erro
	}
	
	public void maisumOutroTeste(int num) {
		
	}
}