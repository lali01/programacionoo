package ejercicio.seleccion.switchs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		String opcion = "";
		
		switch(opcion) {
		case "1":
			System.out.println("Ingrese numero de cuenta");
			System.out.println();
			break;
			
		case "2":
			System.out.println("No existen pagos");
			System.out.println();
			break;	
			default:
				System.out.println("No ha elegido ninguna opcion");
				break;
			
		case "3":
			System.out.println("Cerrando el sistema");
			break;
		}
	}
}		
		


