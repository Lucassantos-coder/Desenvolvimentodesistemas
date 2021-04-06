package foreach;
import java.util.Random;
public class ForEach {

	public static void main(String[] args) {
		
		int[] notas = new int[5];

		Random random = new Random();
		//GERA NUMEROS ALEATORIOS
		for (int i=0; i<notas.length;i++) {
			notas[i] = random.nextInt(5);
		}
		for(int i=0; i<notas.length; i++) {
			System.out.println(notas[i]);
		}
		System.out.println("Usando o FOR EACH");
		for(int nota : notas) {
			System.out.println(nota);
		}
	}

}
