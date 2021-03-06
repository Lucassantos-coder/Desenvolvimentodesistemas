package ativ_fix_comp_lucasdesousasantos;

import java.util.ArrayList;

public class Pessoa {
	private String Nome;
	private String Telefone;
	private String Rg;
	private String Cpf;
	private String Estadocivil;
	private String Sexo;
	private Endereco endereco;
	
	public String getNome() {
		return Nome;
	}
	public String getTelefone() {
		return Telefone;
	}
	public String getRg() {
		return Rg;
	}
	public String getCpf() {
		return Cpf;
	}
	public String getEstadocivil() {
		return Estadocivil;
	}
	public String getSexo() {
		return Sexo;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	public void setTelefone(String Telefone) {
		this.Telefone = Telefone;
	}
	public void setRg(String Rg) {
		this.Rg = Rg;
	}
	public void setCpf(String Cpf) {
		this.Cpf = Cpf;
	}
	public void setEstadocivil(String Estadocivil) {
		this.Estadocivil = Estadocivil;
	}
	public void setSexo(String Sexo) {
		this.Sexo = Sexo;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	ArrayList listPessoas = new ArrayList();
	
	public void adicionarpessoa(Pessoa pessoa) {
		listPessoas.add(pessoa);
	}
	public void removerpessoa(Pessoa pessoa) {
		listPessoas.remove(pessoa);
	}
	public void exibepessoa() {
		for(int i = 0; i < listPessoas.size();i++) {
			if(listPessoas.get(i)instanceof Cliente) {
				Cliente cliente = (Cliente) listPessoas.get(i);
				System.out.println("Nome: "+cliente.getNome());
				System.out.println("Telefone: "+cliente.getTelefone());
				System.out.println("RG: "+cliente.getRg());
				System.out.println("CPF: "+cliente.getCpf());
				System.out.println("Estado civil: "+cliente.getEstadocivil());
				System.out.println("Sexo: "+cliente.getSexo());
				System.out.println("Login: "+cliente.getLogin());
				System.out.println("Senha: "+cliente.getSenha());
				System.out.println("Bairro: "+cliente.getEndereco().getBairro());
				System.out.println("Cep: "+cliente.getEndereco().getCep());
				System.out.println("Cidade: "+cliente.getEndereco().getCidade());
				System.out.println("Complemento: "+cliente.getEndereco().getComplemento());
				System.out.println("Rua: "+cliente.getEndereco().getRua());
			}else if(listPessoas.get(i)instanceof Funcionario) {
				Funcionario funcionario = (Funcionario) listPessoas.get(i);
				System.out.println("Nome: "+funcionario.getNome());
				System.out.println("Telefone: "+funcionario.getTelefone());
				System.out.println("RG: "+funcionario.getRg());
				System.out.println("CPF: "+funcionario.getCpf());
				System.out.println("Estado civil: "+funcionario.getEstadocivil());
				System.out.println("Sexo: "+funcionario.getSexo());
				System.out.println("Endereco: "+funcionario.getEndereco());
				System.out.println("Login: "+funcionario.getCargo());
				System.out.println("Senha: "+funcionario.getSalario());
				System.out.println("Turno: "+funcionario.getTurno());
			}
		}
	}
}
