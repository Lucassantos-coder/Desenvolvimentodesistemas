package ativ_fix_hashmap_01_lucasdesousasantos;

import java.util.HashMap;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		//Crilção e instanciação do HashMap e da classe Scanner
		HashMap<String,Integer> pessoas = new HashMap<String,Integer>();
		Scanner scan = new Scanner(System.in);
		
		//Inserção dos valores
		System.out.println("Insira quantas pessoas que deseja cadastrar:");
		int Qtd = scan.nextInt();
		for(int i=0; i<Qtd; i++) {
			System.out.println("Insira o nome e a idade da " +(i+1)+ "º pessoas que deseja cadastrar:");
			pessoas.put(scan.next(), scan.nextInt());
		}
		
		
		//Exibição dos valores
		System.out.println("");
		for(String i : pessoas.keySet()) {
			System.out.println(i+", "+pessoas.get(i));
		}
		
		//Busca de valores
		System.out.println("Deseja realizar uma busca de elementos?(1=sim 2=não)");
		int resp = scan.nextInt();
		if(resp == 1) {
			System.out.println("Insira o nome que deseja Pesquisar:");
			System.out.println(pessoas.get(scan.next()));
		}
		
		//Remoção de valores
		System.out.println("Deseja remover um item da lista?(1=sim 2=não)");
		resp = scan.nextInt();
		if(resp == 1) {
			System.out.println("Insira o nome que deseja remover:");
			pessoas.remove(scan.next());
			System.out.println("Lista atualizada:");
			for(String i : pessoas.keySet()) {
				System.out.println(i+", "+pessoas.get(i));
			}
		}
		
		//Tamanho do HashMap
		System.out.println("Deseja ver o tamanho da lista?(1=sim 2=não)");
		resp = scan.nextInt();
		if(resp == 1) {
			System.out.println("Tamanho atual da lista: "+pessoas.size());
		}
		
		//Limpeza dos dados
		System.out.println("Deseja limpar todos os dados cadastrados?(1=sim 2=não)");
		resp = scan.nextInt();
		if(resp == 1) {
			pessoas.clear();
			System.out.println("Limpeza dos dados realizada com sucesso!");
			System.out.println("Tamanho atual da lista: "+pessoas.size());
		}
	}
}
