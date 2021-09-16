package prueba4;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String opcionMenu = "";
		String claveIngresada;
		int saldoInicial = 0;
		do {
			
			System.out.println("Ingrese Clave: ");
			Scanner in = new Scanner(System.in);
			Scanner inInt = new Scanner(System.in);
			
			claveIngresada = in.nextLine();
		
			if(claveIngresada.equals("85DB")) {
				do {
				System.out.println("BANCO PICHINCHA, Elija una opcion: ");
				System.out.println("1. Consultar Pagos");
				System.out.println("2. Realizar Transferencia");
				System.out.println("3. SALIR");
				opcionMenu = in.nextLine();
				if(opcionMenu.equals("1")) {
					//todo lo que me pide la opcion 1
					System.out.println("No tiene ningun pago pendiente");
				
				}else if (opcionMenu.equals("2")){
					//todo lo que me pide la opcion 2
					System.out.println("Ingrese la cuenta de destino");
					String cuentaDestino = in.nextLine();
					System.out.println("Ingrese el monto a transferir");
					int montoTransferir = inInt.nextInt();
					saldoInicial = saldoInicial-montoTransferir;
					System.out.println("Su nuevo saldo es: "+saldoInicial);
				}
				
				//}while(opcionMenu.equals("1") opcionMenu.equals("2"));
				}while(!opcionMenu.equals("3"));
				}else {//no
				System.out.println("La clave no es correcta");
			}
			//clave ingresada -1 
			}while(!claveIngresada.equals("-1"));
		System.out.println("Gracias por preferirnos");
}
}