package Ativ_fix_iterator_lucasdesousasantos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Double> emprestimo = new ArrayList<Double>();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira a quantidade de valores que deseja cadastrar:");
		int Qtd = scan.nextInt();
		for(int i=0; i<Qtd; i++) {
			System.out.println("Insira o "+(i+1)+"º valor desejado:");
			emprestimo.add(scan.nextDouble());
		}
		
		Iterator<Double> it = emprestimo.iterator();
		
		while(it.hasNext()) {
			Double i = it.next();
			if(i<500) {
				it.remove();
			}
		}
		
		System.out.println(emprestimo);

	}

}
