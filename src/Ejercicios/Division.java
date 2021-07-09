package Ejercicios;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner in = new Scanner(System.in);
	
	System.out.println("Ingrese su primer numero: ");
	int A = in.nextInt();
	System.out.println("Ingrese su segundo Numero: ");
	int B = in.nextInt();
	
	int D = A/B;
	
	
	if(A!= 0) { 
		System.out.println("La division es: " + D);
		
	}else {
		System.out.println("La division no se puede realizar");
	
	}
	
	}
}
