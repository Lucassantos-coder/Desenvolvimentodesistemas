package ATIV_SIM_02_LUCASDESOUSASANTOS;

public class Funcionario extends Pessoa {
	//Atributos
	private String Cargo;
	private double Salario;
	private String Turno;
	
	//Metodos get e set
	public String getCargo() {
		return Cargo;
	}
	public void setCargo(String cargo) {
		Cargo = cargo;
	}
	public double getSalario() {
		return Salario;
	}
	public void setSalario(double salario) {
		Salario = salario;
	}
	public String getTurno() {
		return Turno;
	}
	public void setTurno(String turno) {
		Turno = turno;
	}
	
	
}
