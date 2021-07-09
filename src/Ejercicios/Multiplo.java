package Ejercicios;

import java.util.Scanner;

public class Multiplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner in = new Scanner(System.in);
		
	int residuo = 0;

	System.out.println("Ingrese su primer numero: ");
	int numero1 = in.nextInt();
	System.out.println("Ingrese su segundo Numero: ");
	int numero2 = in.nextInt();
	
	residuo = numero1%numero2;
	
	if(residuo == 0) {
		System.out.println(numero1 + "Es multiplo de: " + numero2);
	
	}else {
		System.out.println(numero1 + "No es multiplo de: " + numero2);
		
	}
	}

}
