package Ejercicios;

import java.util.Scanner;
	
public class Condición {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese el Valor del Suelo: ");
		
		int S = 400;
		int B = 40;
		
		if(S<300) {
			System.out.println("Su Bonificacion es de: " + B );
			
		}else {
			System.out.println("No Recibe Bonificacion" );
			
			
		}
		
	}

}
