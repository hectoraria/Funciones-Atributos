package Ej04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	// Scanner para leer del teclado
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Variable para saber la opcion
		int opc;

		// Variable para el radio de la base, la altura y el resultado
		double radioBase = 0, altura = 0, res = 0;

		//Variable para llamar al objeto
		Cilindro operacion;

		// Llamo a la función del menú
		opc = menu();

		while (opc != 0) {

		radioBase = pideRadioBase();

		altura = altura();

		operacion = new Cilindro(radioBase, altura);

		switch (opc) {
		case 1 -> {
			res = operacion.volumen();
		}
		case 2 -> {
			res = operacion.area();
		}
		}

		// Muestro el resultado de la operación
		System.out.println("El resultado de la operación es: " + res);
		
		// Llamo a la función del menú
		opc = menu();
		}
		System.out.println("Saliendo...");
		
		sc.close();
	}

	public static int menu() {
		int opc = -1;
		System.out.println("1.Volumen");
		System.out.println("2.Area");
		System.out.println("0.Salir");
		do {
			try {
				System.out.println("Elige una opción");
				opc = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Valor introducido no válido");
			} finally {
				sc.nextLine();
			}
		} while (opc < 0 || opc > 2);
		return opc;
	}

	public static double pideRadioBase() {
		double radioBase = 0;
		boolean seguir = true;
		do {
			try {
				System.out.println("Introduzca el radio de la base");
				radioBase = sc.nextDouble();
				seguir = false;
			} catch (InputMismatchException e) {
				System.out.println("Valor introducido no válido");
			} finally {
				sc.nextLine();
			}
		} while (seguir);
		return radioBase;
	}

	public static double altura() {
		double altura = 0;
		boolean seguir = true;
		do {
			try {
				System.out.println("Introduzca la altura");
				altura = sc.nextDouble();
				seguir = false;
			} catch (InputMismatchException e) {
				System.out.println("Valor introducido no válido");
			} finally {
				sc.nextLine();
			}
		} while (seguir);
		return altura;
	}
}