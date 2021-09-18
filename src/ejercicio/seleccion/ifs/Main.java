package ejercicio.seleccion.ifs;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		String opcion = "";
		
		do {
		System.out.println("Seleccione la Opcion");
		System.out.println("1. Realizar Transferencia");
		System.out.println("2. Consultar Pagos");
		System.out.println("3. SALIR");
		opcion = in.nextLine();
		
		if(opcion.equals("1") ) {
			System.out.println("Ingrese numero de cuenta");
		}else if(opcion.equals("2")) {
			System.out.println("No existen pagos");
		}else if(opcion.equals("3")) {
			System.out.println("No ha elegido ninguna opcion");
		}	
		}while(opcion.equals("3"));//similar a: opcion!=3
			System.out.println("Gracias por preferirnos");
		}
	}


			

	


