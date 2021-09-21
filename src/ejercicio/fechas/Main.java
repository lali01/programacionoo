package ejercicio.fechas;

import java.time.LocalDate;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//deprecado= nunca lo deverian usas por mas que puedan que algun momento ya no va a e
		//existir de funcionar
		
		LocalDate diaHoy = LocalDate.now();//Fecha actual
		LocalDate diaFin = diaHoy.plusDays(15); //aumentar 15 dias
		
		CursoVacacional curso1 = new CursoVacacional();
		curso1.setNombre("Volley principiantes");
		curso1.setFechaInicio(diaHoy);
		curso1.setFechaFin(diaFin);

		System.out.println("Nombre: " + curso1.getNombre());
		System.out.println("Fecha Inicio: " + curso1.getFechaInicio());
		System.out.println("Fecha Fin: " +curso1.getFechaFin());
		
		
		LocalDate diaHoy2 = LocalDate.now();//Fecha actual
		LocalDate diaQueInicio =diaHoy2.minusDays(2);
		LocalDate diaQueFinaliza = diaQueInicio.plusDays(20);
		
		CursoVacacional curso2 = new CursoVacacional();
		curso2.setNombre("Natación principiantes");
		curso2.setFechaInicio(diaQueInicio);
		curso2.setFechaFin(diaQueFinaliza);
		
		System.out.println("Nombre: " + curso2.getNombre());
		System.out.println("Fecha Inicio: " + curso2.getFechaInicio());
		System.out.println("Fecha Fin: " +curso2.getFechaFin());
		
		
		//Fechas especificas
		
		LocalDate fechaEspecifica = LocalDate.of(2022, 2, 15);
		System.out.println(fechaEspecifica);
		
		//Ejercicios
		LocalDate fechaEspeciIni = LocalDate.of(2022, 2, 15);
		LocalDate fechaEspeciFin = LocalDate.of(2022, 7, 10);
		
		CursoVacacional curso3 = new CursoVacacional();
		curso3.setNombre("Karate");
		curso3.setFechaInicio(fechaEspeciIni);
		curso3.setFechaFin(fechaEspeciFin);
		
		LocalDate fechaVista = curso3.getFechaFin();
		LocalDate fechaVistaNueva = fechaVista.plusDays(3);
		
		curso3.setFechaFin(fechaVistaNueva);
		
		System.out.println("Nombre: " + curso3.getNombre());
		System.out.println("Fecha Inicio: " + curso3.getFechaInicio());
		System.out.println("Fecha Fin: " +curso3.getFechaFin());
	}


	}


