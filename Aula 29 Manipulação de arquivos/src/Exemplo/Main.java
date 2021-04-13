package Exemplo;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		try {
			File myObj = new File("filename.txt");
			if(myObj.createNewFile()) {
				System.out.println("File created"+myObj.getName());
			}else {
				System.out.println("Arquivi já existe.");
			}
			
		}catch(IOException e) {
			System.out.println("An error acurred.");
			e.printStackTrace();
		}
	}

}
