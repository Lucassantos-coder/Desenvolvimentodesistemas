package ativ_fix_comp_lucasdesousasantos;

public class Funcionario extends Pessoa {
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
}
