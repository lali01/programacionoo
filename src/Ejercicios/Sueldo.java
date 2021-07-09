package Ejercicios;

import java.util.Scanner;

public class Sueldo {

        public static void main(String[] args) {
		// TODO Auto-generated method stub
        
    	int B1 = 100;
    	int B2 = 70;
    	int B3 = 50;
    	int bono;
        
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese el Valor del Suelo: ");
		int Sueldo = in.nextInt();
		
		//menor de 300 es 100
		//entre 300 y 400 es 70
		//mayor 400 es 50 
		
		if(Sueldo<300) {
			bono = B1;
			
		}else if (Sueldo>=300 && Sueldo<=400) {
			bono = B2;
		
		}else 
			bono = B3;
		
		System.out.println("Su sueldo total es: " + (Sueldo+bono));
		
		}	
}
			
		
	


