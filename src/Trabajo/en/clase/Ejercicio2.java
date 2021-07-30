package Trabajo.en.clase;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// crear un programa que solicite ingresar un numero solo positivos y asi
		// seguira solicitando
		// ingresar un numero hasta que se ingrese el numero(-1), ya no solicitara mas
		// numeros y en ese
		// momento el programa debe imprimir la suma de los numeros pares ingresados y
		// el promedio solo
		// de los numeros impares ingresados hasta ese momento

		Scanner in = new Scanner(System.in);

		int i = 1;
		int sumap = 0;
		int sumai = 0;
		int promedioi = 0;
		int contimpar = 0;
		int contpar = 0;
		int n = 0;

		do {
			System.out.println("Escribe un número: ");
			n = in.nextInt();

			if (n % 2 == 1) {
				sumai = sumai + n;
				contimpar++;
				
				if (n % 2 == 0) {
					sumap = sumap + n;
					contpar++;
					
				}

			} else {
				contimpar = contimpar + 1;
				promedioi = sumai/i;
				

			}
			i++;

		} while (n != -1);
		System.out.println("El promedio de numeros impares es: " + promedioi);
		System.out.println("La suma de los numeros pares es: " + sumap);

	}

}
