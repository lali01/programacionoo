package ejercicio.varios.vectores.matrices;

import java.util.Scanner;

public class MainMatriz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2.Desarrollar un programa que imprima la siguiente imagen

		int A[][] = new int[5][5];
		for (int fila = 0; fila < 5; fila++) {
			for (int columna = 0; columna < 5; columna++) {
				if (fila == columna) {
					A[fila][columna] = 1;
				} else {
					A[fila][columna] = 0;
				}

				System.out.println("Iniciamos a imprimir matriz");

				System.out.print(A[fila][columna] + " ");
			}
			System.out.println();
		}
	}
}