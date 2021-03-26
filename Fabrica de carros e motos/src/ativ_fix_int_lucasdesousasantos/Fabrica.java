package ativ_fix_int_lucasdesousasantos;

public class Fabrica {

	public static void main(String[] args) {
		Cliente cliente; 
	    cliente	= new Cliente();
		Funcionario funcionario;
	    funcionario	= new Funcionario();
		
		cliente.setBairro("Jaqueline");
		cliente.setRua("JAB");
		cliente.setCep("242");
		cliente.setCidade("BH");
		cliente.setComplemento("N/A");
		cliente.setCpf("061");
		cliente.setEstadocivil("S");
		cliente.setLogin("A");
		cliente.setNome("Lucas");
		cliente.setRg("MG");
		cliente.setSenha("2a");
		cliente.setTelefone("3454");
		cliente.setSexo("M");
		
		funcionario.setBairro("SB");
		funcionario.setRua("CCO");
		funcionario.setCep("242");
		funcionario.setCidade("SL");
		funcionario.setComplemento("N/A");
		funcionario.setCpf("61");
		funcionario.setEstadocivil("c");
		funcionario.setCargo("Caixa");
		funcionario.setNome("Gabriel");
		funcionario.setRg("MG");
		funcionario.setSalario(2000.00);
		funcionario.setTelefone("8414");
		funcionario.setSexo("H");
		funcionario.setTurno("Manha");
		
		cliente.Exibedados();
		System.out.println();
		funcionario.Exibedados();
	}
}
