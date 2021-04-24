package ativ_fix_gu_swing_LucasdeSousaSantos;

import java.text.DecimalFormat;

public class SomaBeam {
	private float Num1;
	private float Num2;
	public SomaBeam() {
		
	}
	public SomaBeam(String Num1, String Num2) {
		setNum1(Num1);
		setNum2(Num2);
	}
	
	public float getNum1() {
		return Num1;
	}
	public void setNum1(String num1) {
		Num1 = (num1.matches("[0-9.]+")==false ? 0f:Float.parseFloat(num1));
	}
	public float getNum2() {
		return Num2;
	}
	public void setNum2(String num2) {
		Num2 = (num2.matches("[0-9.]+")==false ? 0f:Float.parseFloat(num2));
	}
	
	public String getResultado() {
		Float Resultado = Num1 + Num2;
		if(Resultado.isNaN()) {
			return "Deu ruim";
		}else {
			return new DecimalFormat("#.##").format(Resultado);
		}
	}
	@Override
	public String toString() {
		return "SomaBeam [Num1=" + Num1 + ", Num2=" + Num2 + ", getResultado()=" + getResultado() + "]";
	}
	
	
}
