package Ej01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		// Variable para recoger la opcion del menu
		int opc;
		// Variable para recoger los numeros y poder hacer las operaciones
		double num1, num2, res=0;
		// Mostrar el menú
		opc = menu();
		// Pedir los números al usuario
		num1 = pedirNumero();
		num2 = pedirNumero();
		
		Operaciones op = new Operaciones(num1, num2);
		
		switch(opc) {
		case 1: res=op.suma();
		case 2: res=op.resta();
		case 3: res=op.multiplicacion();
		case 4: res=op.division();
		case 5: res=op.maximo();
		case 6: res=op.minimo();
		case 0: System.out.println("Saliendo ....");
		}
		if(opc>0&&opc<7) {
			System.out.println("El resultado es: "+res);
		}
	}
	public static int menu() {
		Scanner sc = new Scanner (System.in);
		int opc=-1;
		System.out.println("1.Suma");
		System.out.println("2.Resta");
		System.out.println("3.Multiplicaciones");
		System.out.println("4.Divisiones");
		System.out.println("5.Maximo");
		System.out.println("6.Minimo");
		System.out.println("0.Salir");
		
		do {
			try {
				System.out.println("Elige una opcion: ");
				opc=sc.nextInt();
				sc.nextLine();
			}catch(InputMismatchException e) {
				System.out.println("Valor introducido no valido");
				sc.nextLine();
			}
		}while(opc<0||opc>6);
		
		
		return opc;
		
	}
	public static double pedirNumero() {
		Scanner sc = new Scanner (System.in);
		double num=0;
		boolean seguir=true;
		
		
		
		do {
			try {
				System.out.println("Introduce un numero: ");
				num=sc.nextDouble();
				sc.nextLine();
				seguir=false;
			}catch(InputMismatchException e) {
				System.out.println("Valor introducido no valido");
				sc.nextLine();
			}
		}while(seguir);
		
		return num;
		
	}
}
