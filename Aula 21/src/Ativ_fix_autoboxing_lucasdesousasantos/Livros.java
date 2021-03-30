package Ativ_fix_autoboxing_lucasdesousasantos;

import java.util.ArrayList;

public class Livros {
	private String Titulo;
	private String Autor;
	private String Anolancamento;
	private String Genero;
	private String Editora;
	
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getAutor() {
		return Autor;
	}
	public void setAutor(String autor) {
		Autor = autor;
	}
	public String getAnolancamento() {
		return Anolancamento;
	}
	public void setAnolancamento(String anolancamento) {
		Anolancamento = anolancamento;
	}
	public String getGenero() {
		return Genero;
	}
	public void setGenero(String genero) {
		Genero = genero;
	}
	public String getEditora() {
		return Editora;
	}
	public void setEditora(String editora) {
		Editora = editora;
	}
	
	ArrayList listLivros = new ArrayList();
	
	public void Cadastrarlivro(Livros Livro) {
		listLivros.add(Livro);
	}
	
	public void Exibelivros() {
		for(int i = 0;i<listLivros.size();i++) {
			Livros Livro = (Livros) listLivros.get(i);
			System.out.println("Título: "+Titulo);
			System.out.println("Autor(a): "+Autor);
			System.out.println("Ano de lançamento: "+Anolancamento);
			System.out.println("Gênero: "+Genero);
			System.out.println("Editora: "+Editora);
			System.out.println("");
		}
	}
}
