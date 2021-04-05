package ATIV_SIM_02_LUCASDESOUSASANTOS;

import java.util.ArrayList;

public class Pessoa {
	//Atributos
	private String Nome;
	private String Cpf;
	private String Rg;
	private String Estadocivil;
	private String Sexo;
	private String cidade;
	private String Bairro;
	private String Rua;
	private String Cep;
	private String Complemento;
	
	//Métodos get e set
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
	public String getRg() {
		return Rg;
	}
	public void setRg(String rg) {
		Rg = rg;
	}
	public String getEstadocivil() {
		return Estadocivil;
	}
	public void setEstadocivil(String estadocivil) {
		Estadocivil = estadocivil;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
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
	public String getComplemento() {
		return Complemento;
	}
	public void setComplemento(String complemento) {
		Complemento = complemento;
	}
	
	//Criação da lista
	ArrayList listPessoa = new ArrayList();
	
	//Cadastro de pessoas
	public void Cadastropessoas(Pessoa pessoa) {
		listPessoa.add(pessoa);
		System.out.println("Cadasro realizado com sucesso!");
	}
	
	//Exibição dos dados
	public void Exibedados() {
		for(int i = 0; i < listPessoa.size(); i++) {
			if(listPessoa.get(i) instanceof Cliente) {
				Cliente cliente = new Cliente();
				System.out.println("Nome: "+cliente.getNome());
				System.out.println("CPF: "+cliente.getCpf());
				System.out.println("RG: "+cliente.getRg());
				System.out.println("Estado civil: "+cliente.getEstadocivil());
				System.out.println("Sexo: "+cliente.getSexo());
				System.out.println("Cidade: "+cliente.getCidade());
				System.out.println("Bairro: "+cliente.getBairro());
				System.out.println("Rua: "+cliente.getRua());
				System.out.println("Cep: "+cliente.getCep());
				System.out.println("Complemento:"+cliente.getComplemento());
				System.out.println("Login: "+cliente.getLogin());
				System.out.println("Senha: "+cliente.getSenha());
			}else if(listPessoa.get(i) instanceof Funcionario) {
				Funcionario funcionario = new Funcionario();
				System.out.println("Nome: "+funcionario.getNome());
				System.out.println("CPF: "+funcionario.getCpf());
				System.out.println("RG: "+funcionario.getRg());
				System.out.println("Estado civil: "+funcionario.getEstadocivil());
				System.out.println("Sexo: "+funcionario.getSexo());
				System.out.println("Cidade: "+funcionario.getCidade());
				System.out.println("Bairro: "+funcionario.getBairro());
				System.out.println("Rua: "+funcionario.getRua());
				System.out.println("Cep: "+funcionario.getCep());
				System.out.println("Complemento: "+funcionario.getComplemento());
				System.out.println("Cargo: "+funcionario.getCargo());
				System.out.println("Salario: "+funcionario.getSalario());
				System.out.println("Turno: "+funcionario.getTurno());
			}
		}
	}
}
