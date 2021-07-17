package diagrama;

import java.util.Scanner;

public class main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Excelente trabajo

		System.out.print("Ingrese el número de filas: ");
		Scanner in = new Scanner(System.in);// TECLADO
		int n = in.nextInt();
		for (int fila = 1; fila <= n; fila++) {
			for (int ast = n; ast >= fila; ast--) {
				System.out.print("*");
			}
			System.out.println();// Salto de linea
		}

	}

}
