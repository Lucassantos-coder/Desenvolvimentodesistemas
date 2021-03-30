package Ativ_fix_autoboxing_lucasdesousasantos;

public class Livraria {

	public static void main(String[] args) {
		Livros Livro = new Livros();
		Livro.setTitulo("Harry Potter");
		Livro.setAutor("J.K Rowling");
		Livro.setAnolancamento("1999");
		Livro.setGenero("Fantasia");
		Livro.setEditora("Slá");
		Livro.Cadastrarlivro(Livro);
		Livro.Exibelivros();

	}

}
