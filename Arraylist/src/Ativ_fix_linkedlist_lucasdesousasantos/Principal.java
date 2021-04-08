package Ativ_fix_linkedlist_lucasdesousasantos;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LinkedList<String> carros = new LinkedList<String>();
		
		//Adicionando elementos no LinkedList
		System.out.println("Insira quantos carros deseja adicionar:");
		int Qtd = scan.nextInt();
		for(int i=0; i<Qtd; i++) {
			System.out.println("Insira o "+(i+1)+"º carro desejado:");
			carros.add(scan.next());
		}
		
		//Ordenação dos itens cadastrados
		Collections.sort(carros);
		
		//Exibição dos dados
		System.out.print("Carros cadastrados: ");
		for(String i : carros) {
			System.out.print(i+" ");
		}
		
		
		//AddFirst
		System.out.println("");
		System.out.println("Insira o veículo Que deseja adicionar no topo da lista:");
		carros.addFirst(scan.next());
		
		//Exibição dos dados
		System.out.print("Lista de carros cadastrados: ");
		for(String i : carros) {
			System.out.print(i+" ");
		}
				
		//AddLast
		System.out.println("");
		System.out.println("Insira o veículo que deseja adicionar ao final da lista:");
		carros.addLast(scan.next());
		
		//Exibição dos dados
		System.out.print("Lista de carros cadastrados: ");
		for(String i : carros) {
			System.out.print(i+" ");
		}
		
		//removeFirst
		//Ordenação dos itens cadastrados
		Collections.sort(carros);
		//Exibição dos dados
		System.out.println("");
		System.out.println("");
		System.out.print("Lista de carros cadastrados: ");
		for(String i : carros) {
			System.out.print(i+" ");
		}
		System.out.println("");
		System.out.println("");
		System.out.println("Deseja remover o primeiro item da lista?(1=sim 2=não)");
		int resp = scan.nextInt();
		if(resp == 1) {
			carros.removeFirst();
			System.out.print("Lista de carros Atualizada: ");
			for(String i : carros) {
				System.out.print(i+" ");
			}
		}
		//removeLast
		//Ordenação dos itens cadastrados
		Collections.sort(carros);
		//Exibição dos dados
		System.out.println("");
		System.out.println("");
		System.out.print("Lista de carros cadastrados: ");
		for(String i : carros) {
			System.out.print(i+" ");
		}
		System.out.println("");
		System.out.println("");
		System.out.println("Deseja remover o primeiro item da lista?(1=sim 2=não)");
		resp = scan.nextInt();
				if(resp == 1) {
			carros.removeLast();
			System.out.print("Lista de carros Atualizada: ");
			for(String i : carros) {
				System.out.print(i+" ");
			}
		}
		//getFirst
		//Ordenação dos itens cadastrados
		Collections.sort(carros);
		
		System.out.println("");
		System.out.println("Deseja ver o primeiro item da lista?(1=sim 2=não)");
		resp = scan.nextInt();
		if(resp == 1) {
			System.out.println(carros.getFirst()); 
		}
		//getLast
		Collections.sort(carros);
		
		System.out.println("");
		System.out.println("");
		System.out.println("Deseja ver o último item da lista?(1=sim 2=não)");
		resp = scan.nextInt();
		if(resp == 1) {
			System.out.println("");
			System.out.println(carros.getLast()); 
		}

	}

}
