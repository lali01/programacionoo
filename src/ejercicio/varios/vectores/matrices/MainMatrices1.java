package ejercicio.varios.vectores.matrices;
import java.util.Scanner;
public class MainMatrices1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.Declare una matriz A[3,4} de tipo char, y desarrolle une programa que vaya solicitando
		// cada una de sus posiciones
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ingrese el numero de filas del Vector: ");
		//el usuario digita el numero de filas y yo debo leer desde teclado
		int longitudfila = in.nextInt();
		
		System.out.println("Ingrese el numero de columnas del Vector: ");
		//el usuario digita el numero de filas y yo debo leer desde teclado
		int longitudcolumna = in.nextInt();
		
		 char A[][] = new char[longitudfila][longitudcolumna];
		for (int fila = 0; fila < longitudfila; fila++) {
		for (int columna = 0; columna < longitudfila; columna++) {
		System.out.println("Ingrese el valor fila:" + fila + "columna: " + columna);
		// El usuario digital el valor por teclado y a continuaicón lo leo
		
		char n = in.next().charAt(0);
		A[fila][columna] = n;
		}
		}

		System.out.println("Iniciamos a imprimir matriz");
		
		 for (int fila = 0; fila < longitudfila; fila++) {
		for (int columna = 0; columna < longitudcolumna; columna++) {
		System.out.print(A[fila][columna]+ " ");
		}
		System.out.println();
		}
	}
	

}
