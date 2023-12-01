package Ej02;

import java.util.InputMismatchException;
import java.util.Scanner;

import Ej01.Operaciones;

public class main {

	public static void main(String[] args) {
		// Variable del ancho y alto (un auxiliar)
		double ancho = 0, alto = 0, res=0;
		// Variable para recoger la opcion del menu
		int opc;
		// Varaible para llamar al obejeto
		Rectangulo op;
		// Mostrar el menú
		opc = menu();
		// Pedir el Perimetro y el area
		ancho = pideAncho();
		alto = pideAlto();

		op = new Rectangulo(ancho, alto);
		
		switch (opc) {
		case 1:
			res = op.perimetro();
			break;
		case 2:
			res = op.area();
			break;
		case 0:
			System.out.println("Saliendo ....");
		}
		if(opc==1) {
			System.out.println("El perimetro de "+alto+" alto y "+ancho+" de ancho es : "+res);
		}if(opc==2) {
			System.out.println("El area de "+alto+" alto y "+ancho+" de ancho es : "+res);
		}else {
			System.out.println("Saliendo ...");
		}
	}

	public static int menu() {
		Scanner sc = new Scanner(System.in);
		int opc = -1;
		System.out.println("1.Perimetro");
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

	public static double pideAncho() {
		Scanner sc = new Scanner(System.in);
		double ancho = 0;
		boolean seguir = true;

		do {
			try {
				System.out.println("Introduce el ancho: ");
				ancho = sc.nextDouble();
				sc.nextLine();
				seguir = false;
			} catch (InputMismatchException e) {
				System.out.println("Valor introducido no valido");
				sc.nextLine();
			}
		} while (seguir);

		return ancho;

	}

	public static double pideAlto() {
		Scanner sc = new Scanner(System.in);
		double alto = 0;
		boolean seguir = true;

		do {
			try {
				System.out.println("Introduce el alto: ");
				alto = sc.nextDouble();
				sc.nextLine();
				seguir = false;
			} catch (InputMismatchException e) {
				System.out.println("Valor introducido no valido");
				sc.nextLine();
			}
		} while (seguir);

		return alto;

	}
}
