package prueba.uno;

public class PasajeroVip extends Pasajero {

	private String codigoMembresia;
			
	
	public PasajeroVip(String nombre, String apellido, String codigoMembresia, int edad ) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.codigoMembresia = codigoMembresia;
		this.edad = edad;
	}
	
	public PasajeroVip() {
		// TODO Auto-generated constructor stub
	}

	public String getCodigoMembresia() {
		return codigoMembresia;
	}

	public void setCodigoMembresia(String codigoMembresia) {
		this.codigoMembresia = codigoMembresia;
	}
	
}
