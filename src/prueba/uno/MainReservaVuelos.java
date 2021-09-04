package prueba.uno;

import java.util.Scanner;

public class MainReservaVuelos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inInt = new Scanner(System.in);
		Scanner inString = new Scanner(System.in);
		
		System.out.println("Ingrese Informacion de Usuario");
		System.out.println("Ingrese nombre");
		String nombre = inString.nextLine();
		System.out.println("Ingrese apellido");
		String apellidos = inString.nextLine();
		System.out.println("Ingrese edad");
		int edad = inInt.nextInt();
		System.out.println("Que tipo de Pasajero es: ");
		int opcion = inInt.nextInt();
		
		
		String membresia = "";
		String descuento = "";
		
		if(opcion==1) {
			System.out.println("Ingrese codigo de membresia");
			membresia = inString.nextLine();
		
		}else{
			System.out.println("Ingrese codigo de descuento");
			descuento = inString.nextLine();
		}
		
		
		PasajeroVip pasajero1 = new PasajeroVip();
		pasajero1.setApellido("Teran");
		pasajero1.setNombre("Daniel");
		pasajero1.setCodigoMembresia("as5689jgg");
		pasajero1.setEdad(25);
		
		PasajeroVip pasajero2 = new PasajeroVip();
		pasajero2.setApellido("Cruz");
		pasajero2.setNombre("Jorge");
		pasajero2.setCodigoMembresia("lojgf5");
		pasajero2.setEdad(33);

		PasajeroEconomico pasajeroEconomico1 = new PasajeroEconomico();
		pasajeroEconomico1.setApellido("Cayambre");
		pasajeroEconomico1.setNombre("Edison");
		pasajeroEconomico1.setCodigoDescuento("daefyhh6");
		pasajeroEconomico1.setEdad(54);
		
		
		PasajeroVip[][] asientos = new PasajeroVip[4][5];
		asientos[0][0] = pasajero1;
		asientos[0][1] = pasajero2;
		asientos[0][2] = pasajeroEconomico1;
		asientos[3][2] = pasajeroEconomico2;
		
		
		
		int opcionSalir = 0;
		
		do {
		System.out.println("Ingrese datos del asiento, 0 Continuar , -1 Salir");
		opcionSalir = inInt.nextInt();
		if(opcionSalir==0) {
		System.out.println("Ingrese fila del asiento");
		int fila = inInt.nextInt();
		System.out.println("Ingrese columna del asiento");
		int columna = inInt.nextInt();
		
		System.out.println("Los datos del pasajero son: ");
		System.out.println(asientos[fila][columna]);
		}else {
			System.out.println("Va a salir del sistema");
		}
			
		}while(opcionSalir ! == -1);
	}

}

