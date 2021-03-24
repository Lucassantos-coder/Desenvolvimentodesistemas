package Exercício6;

public class Principal {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if(i%3 <= 0 && i%5 <= 0) {
				System.out.println(i+" é divisivel de 3 e 5");
			}else {
				System.out.println(i+" não é divisivel de 3 e  5");
			}
		}
	}
}