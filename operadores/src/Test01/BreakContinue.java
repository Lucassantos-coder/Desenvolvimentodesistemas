package Test01;

import java.util.Scanner;

public class BreakContinue {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número mínomo: ");
		int Min = scan.nextInt();
		
		System.out.println("Digite o número limite: ");
		int Max = scan.nextInt();
		
		
		System.out.println("Número devisível por 7");
		for(int i = Min; i <= Max; i++) {
			if(i % 7 == 0) {
				System.out.println("O valor de i é igual a: "+i);
				System.out.println("");
				break;
			}
		}
		
		System.out.println("Números não devisíveis por 7");
		for(int i = Min; i <= Max; i++) {
			if(i % 7 != 0) {
				System.out.println("O valor de i é igual a: "+i);
				continue;
			}
		}
	}

}
