package Ej01;

public class Operaciones {

	double num1, num2;	
	
	public Operaciones() {
		
	}

	public Operaciones(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public double suma() {
		return num1 + num2;
	}
	public double resta() {
		return num1 - num2;
	}
	public double multiplicacion() {
		return num1 * num2;
	}
	public double division() {
		return num1 / num2;
	}
	public double maximo() {
		return num1 > num2? num1:num2;
	}
	public double minimo() {
		return num1 < num2? num1:num2;
	}
	
}
