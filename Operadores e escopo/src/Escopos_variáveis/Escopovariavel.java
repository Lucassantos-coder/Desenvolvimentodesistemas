package Escopos_variáveis;

public class Escopovariavel {
	private int valor;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public int calculavalor(int valor) {
		valor = valor + 10;
		return valor;
	}
}