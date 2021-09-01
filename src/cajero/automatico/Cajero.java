package cajero.automatico;
import java.util.Scanner;
public class Cajero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int r = 0;
		int o = 0;
		int c = 0;
		
		while (o != 4) {
			System.out.println("----Banco del Pichincha seleccione una opción----");
			
			System.out.println(" 1. Retirar dinero  ");
			System.out.println(" 2. Cambiar de clave ");
			System.out.println(" 3. Bloquear cuenta");
			System.out.println(" 4. Salir");

			System.out.println("Seleccione un Opccion: ");
			o = in.nextInt();
			
			if (o == 1) {
				System.out.println("Ingrese valor a retirar: ");
				r = in.nextInt();
				System.out.println("El valor a retirar es: " + r);
				
			} else {
				if (o == 2) {
					System.out.println("Ingrese nueva clave: ");
					c = in.nextInt();
					System.out.println("Su clave ha sido cambiada: " );
					
				} else {
					if (o == 3) {
						System.out.println("Su cuenta ha sido bloqueada");
					}
				}
			}
		}
	}
}
