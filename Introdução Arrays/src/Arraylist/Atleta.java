package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Atleta {
	private String nome;
	private int colocacao;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getColocacao() {
		return colocacao;
	}
	public void setColocacao(int colocacao) {
		this.colocacao = colocacao;
	}

	ArrayList listAtleta = new ArrayList();
	
	public void Cadastroatleta(Atleta atleta) {
		listAtleta.add(atleta);
	}

	public void ExibeAtletas() {
		for(int i=0; i<listAtleta.size(); i++) {
			if(listAtleta.get(i))
			System.out.println("O atleta "+nome+);
		}
	}
}
