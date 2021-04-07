package Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Exibe atletas por ordem de calssificação
		//Instanciação do array e da classe scanner
		ArrayList<String> atleta = new ArrayList<String>();
		Scanner scaner = new Scanner(System.in);
		
		//Adição dos elementos no array
		for(int i=3; i>0; i--) {
			System.out.println("Insira o nome do "+i+"º colocado:");
			atleta.add(scaner.next());
		}
		//Ordenação dos elementos inseridos acima
		Collections.sort(atleta);
		
		//Exibe os elementos ordenados
		System.out.println("Ordem de classificação:");
		for(String i : atleta) {			
			System.out.println(i);
		}
	}

}
