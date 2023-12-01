 package Ej03;

 public class Circulo {

		double radio;	
		
		public Circulo() {
			
		}

		public Circulo(double radio) {
			this.radio = radio;
			
		}
		
		public double circunferencia() {
			return ((radio*2)*Math.PI);
		}
		public double area() {
			return Math.PI*Math.pow(radio,2);

		}
	}
