package ativ_fix_arrays_03_lucasdesousasantos;

import java.util.ArrayList;

public class Cliente {
	private String Nome;
	private String Cpf;
	private String Estado;
	private String Cidade;
	private String Bairro;
	private String Rua;
	private String Cep;
	private String Numero;
	private String Complemento;
	private Double Limite;
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCpf() {
		return Cpf;
	}
	public void setCpf(String cpf) {
		Cpf = cpf;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	public String getCidade() {
		return Cidade;
	}
	public void setCidade(String cidade) {
		Cidade = cidade;
	}
	public String getBairro() {
		return Bairro;
	}
	public void setBairro(String bairro) {
		Bairro = bairro;
	}
	public String getRua() {
		return Rua;
	}
	public void setRua(String rua) {
		Rua = rua;
	}
	public String getCep() {
		return Cep;
	}
	public void setCep(String cep) {
		Cep = cep;
	}
	public String getNumero() {
		return Numero;
	}
	public void setNumero(String numero) {
		Numero = numero;
	}
	public String getComplemento() {
		return Complemento;
	}
	public void setComplemento(String complemento) {
		Complemento = complemento;
	}
	public Double getLimite() {
		return Limite;
	}
	public void setLimite(Double limite) {
		Limite = limite;
	}
	
	ArrayList listClientes = new ArrayList();
	
	public void Cadastroclientes(Cliente cliente) {
		listClientes.add(cliente);
	}
	
	public void Exibeclientes() {
		for(int i=0; i<listClientes.size(); i++) {
			if(listClientes.get(i) instanceof Cliente) {
				Cliente cliente = (Cliente) listClientes.get(i);
				System.out.println("Nome do cliente: "+cliente.getNome());
				System.out.println("CPF do cliente: "+cliente.getCpf());
				System.out.println("Estado do cliente: "+cliente.getEstado());
				System.out.println("Cidade do cliente: "+cliente.getCidade());
				System.out.println("Bairro do cliente: "+cliente.getBairro());
				System.out.println("Rua do cliente: "+cliente.getRua());
				System.out.println("CEP do cliente: "+cliente.getCep());
				System.out.println("Número da residência do cliente: "+cliente.getNumero());
				System.out.println("Complemento do endereço do cliente: "+cliente.getComplemento());
				System.out.println("Limite de credito do cliente: "+cliente.getLimite());
			}else if(listClientes.get(i) instanceof ClienteEspacial) {
				ClienteEspacial Espacial = (ClienteEspacial) listClientes.get(i);
				System.out.println("Nome do cliente: "+Espacial.getNome());
				System.out.println("CPF do cliente: "+Espacial.getCpf());
				System.out.println("Estado do cliente: "+Espacial.getEstado());
				System.out.println("Cidade do cliente: "+Espacial.getCidade());
				System.out.println("Bairro do cliente: "+Espacial.getBairro());
				System.out.println("Rua do cliente: "+Espacial.getRua());
				System.out.println("CEP do cliente: "+Espacial.getCep());
				System.out.println("Número da residência do cliente: "+Espacial.getNumero());
				System.out.println("Complemento do endereço do cliente: "+Espacial.getComplemento());
				System.out.println("Limite de credito do cliente: "+Espacial.getLimite_especial());
			}else if(listClientes.get(i) instanceof ClienteDevedor) {
				ClienteDevedor Devedor = (ClienteDevedor) listClientes.get(i);
				System.out.println("Nome do cliente: "+Devedor.getNome());
				System.out.println("CPF do cliente: "+Devedor.getCpf());
				System.out.println("Estado do cliente: "+Devedor.getEstado());
				System.out.println("Cidade do cliente: "+Devedor.getCidade());
				System.out.println("Bairro do cliente: "+Devedor.getBairro());
				System.out.println("Rua do cliente: "+Devedor.getRua());
				System.out.println("CEP do cliente: "+Devedor.getCep());
				System.out.println("Número da residência do cliente: "+Devedor.getNumero());
				System.out.println("Complemento do endereço do cliente: "+Devedor.getComplemento());
				System.out.println("Divida do cliente: "+Devedor.getDivida());
			}
		}
	}
}
