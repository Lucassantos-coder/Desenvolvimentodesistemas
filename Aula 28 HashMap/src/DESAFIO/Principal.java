package DESAFIO;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		//Cril��o e instancia��o do HashMap
		HashMap<String,Integer> pessoas = new HashMap<String,Integer>();
		
		//Inser��o dos valores
		pessoas.put("Lucas", 18);
		pessoas.put("Andr�", 21);
		pessoas.put("Barbara", 21);
		
		//Exibi��o dos valores
		for(String i : pessoas.keySet()) {
			System.out.println(i+", "+pessoas.get(i));
		}
		

	}

}
