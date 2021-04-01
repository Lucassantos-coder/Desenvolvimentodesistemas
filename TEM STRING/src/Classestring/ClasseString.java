package Classestring;

public class ClasseString {
	public static void main(String[] args) {
		String vl = "Abacaxi";
		String vll = "Ambar";
		String vlll = "Choro";
		String vllll = "Amar";
		String subVL = vl.substring(0,1);
		String subVLL = vll.substring(1,2);
		String subVLLL = vlll.substring(2,3);
		String subVLLLL = vllll.substring(3,4);

		System.out.println(vl);
		System.out.println(vll);
		System.out.println(vlll);
		System.out.println(vllll);
		System.out.println("");
		System.out.println(subVL+subVLL+subVLLL+subVLLLL);
	}
}
