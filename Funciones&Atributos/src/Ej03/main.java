package Ej03;

import java.util.InputMismatchException;
import java.util.Scanner;

import Ej02.Rectangulo;

public class main {

	public static void main(String[] args) {
		// Variable del radio(un auxiliar)
		double radio = 0, res=0;
		// Variable para recoger la opcion del menu
		int opc;
		// Varaible para llamar al obejeto
		Circulo op;
		// Mostrar el menú
		opc = menu();
		// Pedir el Perimetro y el area
		radio = pideRadio();
		

		op = new Circulo(radio);

		switch (opc) {
		case 1:
			res = op.circunferencia();
			break;
		case 2:
			res = op.area();
			break;
		case 0:
			System.out.println("Saliendo ....");
		}
		System.out.println("El resultado es: "+res);
	
	}

	public static int menu() {
		Scanner sc = new Scanner(System.in);
		int opc = -1;
		System.out.println("1.Circunferencia");
		System.out.println("2.Area");
		System.out.println("0.Salir");

		do {
			try {
				System.out.println("Elige una opcion: ");
				opc = sc.nextInt();
				sc.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("Valor introducido no valido");
				sc.nextLine();
			}
		} while (opc < 0 || opc > 2);

		return opc;

	}

	

	public static double pideRadio() {
		Scanner sc = new Scanner(System.in);
		double radio = 0;
		boolean seguir = true;

		do {
			try {
				System.out.println("Introduce el radio: ");
				radio = sc.nextDouble();
				sc.nextLine();
				seguir = false;
			} catch (InputMismatchException e) {
				System.out.println("Valor introducido no valido");
				sc.nextLine();
			}
		} while (seguir);

		return radio;

	}
}