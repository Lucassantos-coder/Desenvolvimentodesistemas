package DESAFIO;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		//Crilção e instanciação do HashMap
		HashMap<String,Integer> pessoas = new HashMap<String,Integer>();
		
		//Inserção dos valores
		pessoas.put("Lucas", 18);
		pessoas.put("André", 21);
		pessoas.put("Barbara", 21);
		
		//Exibição dos valores
		for(String i : pessoas.keySet()) {
			System.out.println(i+", "+pessoas.get(i));
		}
		

	}

}
