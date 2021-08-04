package ejercicio.varios.vectores.matrices;

import java.util.Scanner;

public class MainVector2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declarar un vector X[] cuya longitud se solicite al usuario de tipo int y construya un programa que pida al usuario que
		//ingrese los valores para cada posicion
		// y finalmente que se impriman todos los valores ingresa
	
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ingrese la longitud del vector : " );
		int N = in.nextInt();
		int X[] = new int[N];
		
		for(int i=0; i<N; i++) {
			System.out.println("Ingrese el valor de la posicion : " +i);
			int n = (char)in.next().charAt(0);
			X[i]=n;
			
		}
			for(int i=0; i<N; i++) {
				System.out.println("El valor de la posicion: "+i);
				System.out.println(X[i]);
			
	}
	}
}

	


