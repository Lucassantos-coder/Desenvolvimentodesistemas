package ativ_fix_arrays_03_lucasdesousasantos;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		Cliente cliente = new Cliente();
		ClienteEspacial Espacial = new ClienteEspacial();
		ClienteDevedor Devedor = new ClienteDevedor();
		
		System.out.println("Sistema de cadastro de Clientes");
		System.out.println("Bem-Vindo!");
		System.out.println("Deseja cadastrar cliente comum?(1=Sim 2=Não)");
		int resp = Scan.nextInt();				
			if(resp == 1) {
				System.out.println("Quantos clientes deseja cadastrar?");
				int Qtd_cadastro = Scan.nextInt();
				for(int i=0; i<Qtd_cadastro; i++) {
					System.out.println("Insira o nome do cliente "+(i+1)+":");
					cliente.setNome(Scan.next());
					System.out.println("Insira o CPF do cliente "+(i+1)+":");
					cliente.setCpf(Scan.next());
					System.out.println("Insira o estado do cliente "+(i+1)+":");
					cliente.setEstado(Scan.next());
					System.out.println("Insira a cidade do cliente "+(i+1)+":");
					cliente.setCidade(Scan.next());
					System.out.println("Insira o bairro do cliente "+(i+1)+":");
					cliente.setBairro(Scan.next());
					System.out.println("Insira a rua do cliente "+(i+1)+":");
					cliente.setRua(Scan.next());
					System.out.println("Insira o Cep do cliente "+(i+1)+":");
					cliente.setCep(Scan.next());
					System.out.println("Insira o número da residência do cliente "+(i+1)+":");
					cliente.setNumero(Scan.next());
					System.out.println("Insira o complemento do endereço do cliente "+(i+1)+":");
					cliente.setComplemento(Scan.next());
					System.out.println("Insira o limite de credito do cliente "+(i+1)+":");
					cliente.setLimite(Scan.nextDouble());
					cliente.Cadastroclientes(cliente);
					System.out.println("");
				}
			}
			
			System.out.println("Deseja cadastrar um cliente espacial?(1=sim 2=não)");
			resp =Scan.nextInt();
			if(resp == 1) {
				System.out.println("Quantos clientes deseja cadastrar?");
				int Qtd_cadastro = Scan.nextInt();
				for(int i=0; i<Qtd_cadastro; i++) {
					System.out.println("Insira o nome do cliente "+(i+1)+":");
					Espacial.setNome(Scan.next());
					System.out.println("Insira o CPF do cliente "+(i+1)+":");
					Espacial.setCpf(Scan.next());
					System.out.println("Insira o estado do cliente "+(i+1)+":");
					Espacial.setEstado(Scan.next());
					System.out.println("Insira a cidade do cliente "+(i+1)+":");
					Espacial.setCidade(Scan.next());
					System.out.println("Insira o bairro do cliente "+(i+1)+":");
					Espacial.setBairro(Scan.next());
					System.out.println("Insira a rua do cliente "+(i+1)+":");
					Espacial.setRua(Scan.next());
					System.out.println("Insira o Cep do cliente "+(i+1)+":");
					Espacial.setCep(Scan.next());
					System.out.println("Insira o número da residência do cliente "+(i+1)+":");
					Espacial.setNumero(Scan.next());
					System.out.println("Insira o complemento do endereço do cliente "+(i+1)+":");
					Espacial.setComplemento(Scan.next());
					Espacial.setLimite("Ilimitado");
					Espacial.Cadastroclientes(Espacial);
					System.out.println("");
				}
			}
			
			System.out.println("Deseja cadastrar um cliente devedor?(1=sim 2=não)");
			resp = Scan.nextInt();
			if(resp == 1) {
				System.out.println("Quantos clientes deseja cadastrar?");
				int Qtd_cadastro = Scan.nextInt();
				for(int i=0; i<Qtd_cadastro; i++) {
					System.out.println("Insira o nome do cliente "+(i+1)+":");
					Devedor.setNome(Scan.next());
					System.out.println("Insira o CPF do cliente "+(i+1)+":");
					Devedor.setCpf(Scan.next());
					System.out.println("Insira o estado do cliente "+(i+1)+":");
					Devedor.setEstado(Scan.next());
					System.out.println("Insira a cidade do cliente "+(i+1)+":");
					Devedor.setCidade(Scan.next());
					System.out.println("Insira o bairro do cliente "+(i+1)+":");
					Devedor.setBairro(Scan.next());
					System.out.println("Insira a rua do cliente "+(i+1)+":");
					Devedor.setRua(Scan.next());
					System.out.println("Insira o Cep do cliente "+(i+1)+":");
					Devedor.setCep(Scan.next());
					System.out.println("Insira o número da residência do cliente "+(i+1)+":");
					Devedor.setNumero(Scan.next());
					System.out.println("Insira o complemento do endereço do cliente "+(i+1)+":");
					Devedor.setComplemento(Scan.next());
					System.out.println("Insira o limite de credito do cliente "+(i+1)+":");
					Devedor.setLimite(Scan.nextDouble());
					Devedor.Cadastroclientes(Devedor);
					System.out.println("");
				}
			}
			
			System.out.println("Deseja ver a lista de clientes cadastrados?(1=sim 2=não)");
			resp = Scan.nextInt();
			if(resp == 4) {
				System.out.println("Lista de clientes comuns:");
				cliente.Exibeclientes();
				System.out.println("");
				System.out.println("Lista de clientes especiais:");
				Espacial.Exibeclientes();
				System.out.println("");
				System.out.println("Lista de clientes devedores:");
				Devedor.Exibeclientes();
			}
	
		System.out.println("Obrigado por utilizar o sistama!");
	}

}
