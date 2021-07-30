package Trabajo.en.clase;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int suma = 0;
		int promedio = 0;
		int cantidad = 0;
		int i = 1;
		
		while (i!= 0) {
			System.out.println("Ingrese un numero: ");
			int n = in.nextInt();
			
			if (n == 0) {
				i = -1;
				
			} else {
				
				cantidad = cantidad + 1;
				suma = suma + n;
				promedio = suma / i;
			}
				i++;
		}
		System.out.println("La Cantidad de numeros ingresados es: " + cantidad);
		System.out.println("Suma: " + suma);
		System.out.println("Promedio: " + promedio);
	}

}
