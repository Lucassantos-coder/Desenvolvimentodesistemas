package Para_casa;

import java.util.HashMap;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Cria��o e instancia��o das classes
		HashMap<String,Integer> Agenda = new HashMap<String,Integer>();
		Scanner scan = new Scanner(System.in);
		
		//Cadastro de pessoas
		int QtdInicial = 16;
		for(int i=0; i<QtdInicial; i++) {
			System.out.println("Insira o login e a senha da "+(i+1)+"� pessoa a ser cadastrada:");
			Agenda.put(scan.next(), scan.nextInt());
			
			double loadFactor = 0.75;
			double QtdAumentada = QtdInicial*loadFactor;
			QtdInicial = (int)QtdAumentada;
			System.out.println("Deseja parar o cadastro?(1=sim 2=n�o)");
			int decisao = scan.nextInt();
			if(decisao == 1) {
				i = QtdInicial;
			}
		}
		
		//Exibi��o dos dados
		System.out.println("");
		System.out.println("Pessoas cadastradas");
		for(String i : Agenda.keySet()) {
			System.out.println(i+", "+Agenda.get(i));
		}
	}

}
