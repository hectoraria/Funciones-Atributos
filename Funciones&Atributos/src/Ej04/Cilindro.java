package Ej04;


public class Cilindro {

	double radioBase, altura;

	public Cilindro() {
		super();

	}

	public Cilindro(double radioBase, double altura) {
		super();
		this.radioBase = radioBase;
		this.altura = altura;
	}

	public double volumen() {
		return Math.pow(radioBase, 2) * altura;
	}

	public double area() {
		return 2 * radioBase * (altura + radioBase);
	}

}
