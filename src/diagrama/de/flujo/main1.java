package diagrama.de.flujo;

import java.util.Scanner;

public class main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		int N = in.nextInt();
		
		for(int C=N+1; C<=N+5; C++ ) {
			System.out.println(C);
		
		}
	}
}


