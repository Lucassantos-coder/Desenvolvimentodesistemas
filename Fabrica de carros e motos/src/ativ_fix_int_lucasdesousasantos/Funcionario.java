package ativ_fix_int_lucasdesousasantos;

public class Funcionario extends Pessoa implements Dados {
	private String Cargo;
	private Double Salario;
	private String Turno;
	
	public String getCargo() {
		return Cargo;
	}
	public Double getSalario() {
		return Salario;
	}
	public String getTurno() {
		return Turno;
	}
	public void setCargo(String Cargo) {
		this.Cargo = Cargo;
	}
	public void setSalario(Double Salario) {
		this.Salario = Salario;
	}
	public void setTurno(String Turno) {
		this.Turno = Turno;
	}
	public void Exibedados() {
		System.out.println(getNome());
		System.out.println(getTelefone());
		System.out.println(getRg());
		System.out.println(getCpf());
		System.out.println(getEstadocivil());
		System.out.println(getSexo());
		System.out.println(getRua());
		System.out.println(getBairro());
		System.out.println(getCidade());
		System.out.println(getCep());
		System.out.println(getComplemento());
		System.out.println(getCargo());
		System.out.println(getSalario());
		System.out.println(getTurno());
	}
}
