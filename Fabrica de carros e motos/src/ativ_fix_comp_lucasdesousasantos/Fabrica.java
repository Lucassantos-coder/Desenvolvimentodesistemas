package ativ_fix_comp_lucasdesousasantos;

public class Fabrica {

	public static void main(String[] args) {
		Cliente cliente; 
	    cliente	= new Cliente();
		Funcionario funcionario;
	    funcionario	= new Funcionario();
		
		cliente.getEndereco().setBairro("Jaqueline");
		cliente.getEndereco().setRua("JAB");
		cliente.getEndereco().setCep("242");
		cliente.getEndereco().setCidade("BH");
		cliente.getEndereco().setComplemento("N/A");
		cliente.setCpf("061");
		cliente.setEstadocivil("S");
		cliente.setLogin("A");
		cliente.setNome("Lucas");
		cliente.setRg("MG");
		cliente.setSenha("2a");
		cliente.setTelefone("3454");
		cliente.setSexo("M");
		
		funcionario.getEndereco().setBairro("SB");
		funcionario.getEndereco().setRua("CCO");
		funcionario.getEndereco().setCep("242");
		funcionario.getEndereco().setCidade("SL");
		funcionario.getEndereco().setComplemento("N/A");
		funcionario.setCpf("61");
		funcionario.setEstadocivil("c");
		funcionario.setCargo("Caixa");
		funcionario.setNome("Gabriel");
		funcionario.setRg("MG");
		funcionario.setSalario(2000.00);
		funcionario.setTelefone("8414");
		funcionario.setSexo("H");
		funcionario.setTurno("Manha");
		
		cliente.exibepessoa();
	}
}
