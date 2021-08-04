package ejercicio.varios.vectores.matrices;

import java.util.Scanner;

public class MainVector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declarar un vector X[3] de tipo char y construya un programa que pida al usuario que
		//ingrese los valores para cada posicion
		// y finalmente que se impriman todos los valores ingresados
		
		Scanner in = new Scanner(System.in);
				
		char X[] = new char[3];
		
		for(int i=0; i<3; i++) {
			System.out.println("Ingrese el valor de la posicion : " +i);
			char n = (char)in.next().charAt(0);
			X[i]=n;
			
		}
			for(int i=0; i<3; i++) {
				System.out.println("El valor de la posicion: "+i);
				System.out.println(X[i]);
			
		}
	}

}
