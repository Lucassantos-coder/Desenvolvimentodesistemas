package ativ_fix_arrays_01_lucasdesousasantos;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		
		double[] Temperatura = new double[30];
		double Soma = 0;
		
		
		for(int i = 0; i<Temperatura.length; i++) {
			System.out.println("Insira a temperatura do dia "+(i+1)+":");
			Temperatura[i] = Scan.nextDouble();
		}
		for(int i=0; i<Temperatura.length; i++) {
			Soma = Soma + Temperatura[i];
			
		}
		double Media = Soma/Temperatura.length;
		System.out.println("");
		System.out.println("Media das temperaturas do mes: "+Media);
		
	}

}
