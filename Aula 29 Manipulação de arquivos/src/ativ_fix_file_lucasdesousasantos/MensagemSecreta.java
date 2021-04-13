package ativ_fix_file_lucasdesousasantos;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MensagemSecreta {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {
			File myObj = new File("Mensagem secreta.txt");
			if(myObj.createNewFile()) {
				System.out.println("O arquivo "+myObj.getName()+" foi criado com sucesso!");
			}else {
				System.out.println("O arquivo "+myObj.getName()+" já existe!");
			}
		}catch(IOException e) {
			System.out.println("Ocorreu um erro.");
			e.printStackTrace();
		}
		try {
			FileWriter myWriter = new FileWriter("Mensagem secreta.txt");
			myWriter.write("Insira aqui uma mensagem criativa e/ou reflexiva");
			myWriter.close();
			System.out.println("Mensagem registrada com sucesso!");
		}catch(IOException e) {
			System.out.println("Ocorreu um erro.");
			e.printStackTrace();
		}

		try {
			File myObj = new File("Mensagem secreta.txt");
			Scanner myReader = new Scanner(myObj);
			System.out.println("Deseja Ver a mensagem?(1=Sim 2=Não)");
			int resp = scan.nextInt(); 
			if(resp == 1) {
				while(myReader.hasNextLine()) {
					String data = myReader.nextLine();
					System.out.println(data);
				}
				myReader.close();
			}
			if(resp == 2) {
				myReader.close();
				System.out.println("Obrigaso por usar o sistema!");
			}
		}catch(FileNotFoundException e) {
			System.out.println("Ocorreu um erro.");
			e.printStackTrace();
		}
		
		File myObj = new File("Mensagem secreta.txt");
		if(myObj.exists()) {
			System.out.println("");
			System.out.println("File name:"+myObj.getName());
			System.out.println("Absolute path:"+myObj.getAbsolutePath());
			System.out.println("Writeble:"+myObj.canWrite());
			System.out.println("Readble:"+myObj.canRead());
			System.out.println("File size in bytes:"+myObj.length());
			
		}else {
			System.out.println("O arquivo "+myObj.getName()+" não existe.");
		}
		if(myObj.delete()) {
		System.out.println("O arquivo "+myObj.getName()+" Foi deletado com sucesso!");	
		}else {
			System.out.println("Falha ao deletar o arquivo");
		}

	}

}
