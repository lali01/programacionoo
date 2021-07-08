package Ejercicios;

import java.util.Scanner;

public class Primero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ingrese dos numeros ");
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		//System.out.println("Numero Ingresado 1" + A);
		int B = in.nextInt();
		//System.out.println("Numero Ingresado 2" + B);
		
		int S = A+B;
		int R = A-B;
		int P = A*B;
		
		System.out.println("La suma es: " + S);
		System.out.println("La resta es: " + R);
		System.out.println("El producto es: " + P);
		
		
	}

}
