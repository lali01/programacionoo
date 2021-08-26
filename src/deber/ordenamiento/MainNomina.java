package deber.ordenamiento;

import java.util.Arrays;

public class MainNomina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado jorge = new Empleado();
		jorge.setNombre("Jorge");
		jorge.setApellido("Medina");
		jorge.setEdad(29);
		jorge.setSalario(350);
		
		Empleado fernando = new Empleado();
		fernando.setNombre("Fernando");
		fernando.setApellido("Padilla");
		fernando.setEdad(28);
		fernando.setSalario(500);
		
		Empleado cesar = new Empleado();
		cesar.setNombre("Cesar");
		cesar.setApellido("Cruz");
		cesar.setEdad(58);
		cesar.setSalario(800);
		
		Empleado angie = new Empleado();
		angie.setNombre("Angie");
		angie.setApellido("Espinoza");
		angie.setEdad(20);
		angie.setSalario(200);
		
		Empleado manuel = new Empleado();
		manuel.setNombre("Manuel");
		manuel.setApellido("Bendoval");
		manuel.setEdad(32);
		manuel.setSalario(350);
		
		Empleado laura = new Empleado();
		laura.setNombre("Laura");
		laura.setApellido("Mejia");
		laura.setEdad(56);
		laura.setSalario(700);
		
		Empleado rodrigo = new Empleado();
		rodrigo.setNombre("Rodrigo");
		rodrigo.setApellido("Rodriguez");
		rodrigo.setEdad(47);
		rodrigo.setSalario(350);
		
		Empleado pablo = new Empleado();
		pablo.setNombre("Pablo");
		pablo.setApellido("Hernandez");
		pablo.setEdad(50);
		pablo.setSalario(400);
		
		Empleado romel = new Empleado();
		romel.setNombre("Romel");
		romel.setApellido("Hinojosa");
		romel.setEdad(36);
		romel.setSalario(400);
		
		Empleado daniel = new Empleado();
		daniel.setNombre("Daniel");
		daniel.setApellido("Montesdeoca");
		daniel.setEdad(33);
		daniel.setSalario(500);
		
		Empleado salario[] = new Empleado[10];
		salario[0] = jorge;
		salario[1] = fernando;
		salario[2] = cesar;
		salario[3] = angie;
		salario[4] = manuel;
		salario[5] = laura;
		salario[6] = rodrigo;
		salario[7] = pablo;
		salario[8] = romel;
		salario[9] = daniel;

		//Vector antes de ordenar
		System.out.println("Nomina antes de ordenar");
		System.out.println(Arrays.toString(salario));

		//Aqui ordeno la lista
		Arrays.sort(salario);
		System.out.println("Nomina ordenada");
		System.out.println(Arrays.toString(salario));

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
