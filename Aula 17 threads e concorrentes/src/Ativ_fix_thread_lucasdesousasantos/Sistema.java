package Ativ_fix_thread_lucasdesousasantos;

public class Sistema implements Runnable {
	private String Nome;

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}
	
	public synchronized void iniciarSistema() {
		int i = 0;
		while(i < 10) {
			System.out.println("Sistema executado por: "+ Nome +"!");
			i++;
		}		
	}
	public void run() {
		iniciarSistema();
	}
}
