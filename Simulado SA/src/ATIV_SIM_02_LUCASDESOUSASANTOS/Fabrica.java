package ATIV_SIM_02_LUCASDESOUSASANTOS;

import java.util.Scanner;

public class Fabrica {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Carro carro = new Carro();
		Moto moto = new Moto();
		Cliente cliente = new Cliente();
		Funcionario funcionario  = new Funcionario();
		
		
		System.out.println("Concessionária de carros e motos");
		System.out.println("Bem-Vindo ao sistema!");
		System.out.println("");
		System.out.println("Deseja cadastrar um cliente?(1=sim 2=Não)");
		int resp = scan.nextInt();
		while(resp == 1) {
		if(resp == 1){
			System.out.println("");
			System.out.println("Insira o nome desjado: ");
			cliente.setNome(scan.next());
			System.out.println("Insira o Cpf desjado: ");
			cliente.setCpf(scan.next());
			System.out.println("Insira o Rg desjado: ");
			cliente.setRg(scan.next());
			System.out.println("Insira o estado civil desjado: ");
			cliente.setEstadocivil(scan.next());
			System.out.println("Insira o sexo desjado: ");
			cliente.setSexo(scan.next());
			System.out.println("Insira a cidade desjada: ");
			cliente.setCidade(scan.next());
			System.out.println("Insira o bairro desjado: ");
			cliente.setBairro(scan.next());
			System.out.println("Insira a rua desjada: ");
			cliente.setRua(scan.next());
			System.out.println("Insira o Cep desjado: ");
			cliente.setCep(scan.next());
			System.out.println("Insira o complemento desjado: ");
			cliente.setComplemento(scan.next());
			System.out.println("Insira o login desjado: ");
			cliente.setLogin(scan.next());
			System.out.println("Insira a senha desjada: ");
			cliente.setSenha(scan.next());
			cliente.Cadastropessoas(cliente);
		}
		System.out.println("");
		System.out.println("Deseja realizar outro cadasro?(1=Sim 2=Não)");
		resp = scan.nextInt();
	}
		
		System.out.println("");
		System.out.println("Deseja cadastrar um funcionário?(1=sim 2=Não)");
		resp = scan.nextInt();
		while(resp == 1) {
		if(resp == 1) {
			System.out.println("");
			System.out.println("Insira o nome desjado: ");
			funcionario.setNome(scan.next());
			System.out.println("Insirnexta o Cpf desjado: ");
			funcionario.setCpf(scan.next());
			System.out.println("Insira o Rg desjado: ");
			funcionario.setRg(scan.next());
			System.out.println("Insira o estado civil desjado: ");
			funcionario.setEstadocivil(scan.next());
			System.out.println("Insira o sexo desjado: ");
			funcionario.setSexo(scan.next());
			System.out.println("Insira a cidade desjada: ");
			funcionario.setCidade(scan.next());
			System.out.println("Insira o bairro desjado: ");
			funcionario.setBairro(scan.next());
			System.out.println("Insira a rua desjada: ");
			funcionario.setRua(scan.next());
			System.out.println("Insira o Cep desjado: ");
			funcionario.setCep(scan.next());
			System.out.println("Insira o complemento desjado: ");
			funcionario.setComplemento(scan.next());
			System.out.println("Insira o cargo desjado: ");
			funcionario.setCargo(scan.next());
			System.out.println("Insira a salario desjada: ");
			funcionario.setSalario(scan.nextDouble());
			System.out.println("Insira o turno desejado: ");
			funcionario.setTurno(scan.next());
			funcionario.Cadastropessoas(funcionario);
		}
		System.out.println("");
		System.out.println("Deseja realizar outro cadasro?(1=Sim 2=Não)");
		resp = scan.nextInt();
	}
		
		System.out.println("");
		System.out.println("Deseja cadastrar um veículo?(1=sim 2=Não)");
		resp = scan.nextInt();
		if(resp == 1) {
			while(resp == 1) {
				System.out.println();
				System.out.println("Qual tipo de veículo deseja cadastrar?(1=Carro 2=Moto)");
			resp = scan.nextInt();
			if(resp == 1) {
				System.out.println("");
				System.out.println("Insira a marca desejada:");
				carro.setMarca(scan.next());
				System.out.println("Insira o modelo desejado:");
				carro.setModelo(scan.next());
				System.out.println("Insira a cor desejada:");
				carro.setCor(scan.next());
				System.out.println("Insira o ano desejado:");
				carro.setAno(scan.next());
				System.out.println("Insira a placa desejada:");
				carro.setPlaca(scan.next());
				System.out.println("Insira o valor desejado:");
				carro.setValor(scan.nextDouble());
				carro.Cadastroveiculo(carro);
				System.out.println("Veículo cadastrado com sucesso!");
			}
			if(resp == 2) {
				System.out.println("Insira a marca desejada:");
				moto.setMarca(scan.next());
				System.out.println("Insira o modelo desejado:");
				moto.setModelo(scan.next());
				System.out.println("Insira a cor desejada:");
				moto.setCor(scan.next());
				System.out.println("Insira o ano desejado:");
				moto.setAno(scan.next());
				System.out.println("Insira a placa desejada:");
				moto.setPlaca(scan.next());
				System.out.println("Insira o valor desejado:");
				moto.setValor(scan.nextDouble());
				moto.Cadastroveiculo(moto);
				System.out.println("Veículo cadastrado com sucesso!");
			}
			System.out.println("");
			System.out.println("Deseja cadastrar outro veículo?(1=Sim 2=Não)");
			resp = scan.nextInt();
		}
	}
		
		System.out.println("");
		System.out.println("Deseja ver a lista de veículos cadastrados?(1=sim 2=Não)");
		resp = scan.nextInt();
		switch(resp){
		case 1:
			System.out.println("Lista de carros:");
			carro.Exibedados();
			System.out.println(" ");
			System.out.println("Lista de motos:");
			moto.Exibedados();
		}
		
		System.out.println("");
		System.out.println("Deseja comprar um veículo?(1=sim 2=Não)");
		resp = scan.nextInt();
		while(resp == 1) {
		if(resp == 1) {
			System.out.println("Qual veículo deseja comprar?(1=Carro 2=Moto)");
			resp = scan.nextInt();
			if(resp == 1) {
				carro.Venderveiculo(carro);
				System.out.println("Compra realizada com sucesso!");
			}
			if(resp == 2) {
				moto.Venderveiculo(moto);
				System.out.println("Compra realizada com sucesso!");
			}
		}
		System.out.println("");
		System.out.println("Deseja comprar outro veículo?(1=Sim 2=Não)");
		resp = scan.nextInt();
	}
		
		System.out.println("Obrigado por ultilizar o sistema!");
	}

}
	
