package ejercicio.clases.wrappers;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// byte
		byte datoByte = 2; // primitivo
		Byte datoByteWrapper = 3; // wrapper
		System.out.println("primitivo" + datoByte);
		System.out.println("wrapper" + datoByteWrapper);
		// conversiones
		byte datoByte1 = 6;
		Byte datoConvertido = datoByte1;
		System.out.println("byte convertido" + datoConvertido);

		// short
		short datoShort = 1; // primitivo
		Short datoShortWrapper = 1; // wrapper
		System.out.println("primitivo" + datoShort);
		System.out.println("wrapper" + datoShortWrapper);
		// conversiones
		short datoshort1 = 6;
		Short datoConvertido2 = datoshort1;
		System.out.println("short convertido" + datoConvertido2);

		// int
		int edad = 45; // primitivo
		Integer edadWrapper = 48; // wrapper
		System.out.println("primitivo" + edad);
		System.out.println("wrapper" + edadWrapper);
		// conversiones
		int edad1 = 45;
		Integer integerconvertido = 45;
		System.out.println("integer convertido" + datoConvertido);
		// conversiones2
		Integer integerConvertido2 = 46;
		int edad2 = integerConvertido2.intValue();
		System.out.println("int convertido" + edad2);

		// long
		long valorGrande = 123455L; // primitivo
		Long valorGrandeWrapper = 1233455L; // wrapper
		System.out.println("primitivo" + valorGrande);
		System.out.println("wrapper" + valorGrandeWrapper);
		// conversiones
		long valorGrande1 = 6;
		Long datoConvertido3 = valorGrande1;
		System.out.println("long convertido" + datoConvertido3);

		// boolean
		boolean confirmar = true; // primitivo
		Boolean confirmarWrapper = true; // wrapper
		// conversiones
		boolean confirmar1 = true;
		Boolean datoConvertido4 = confirmar1;
		System.out.println("boolean convertido" + datoConvertido4);

		// float char
		float datoFloat = 12.454F; // primitivo
		Float datoFloatWrapper = 12.454F; // wrapper
		// conversiones
		float datoFloat1 = 6;
		Float datoConvertido5 = datoFloat1;
		System.out.println("float convertido" + datoConvertido5);

		// double
		double datoDouble = 123.654; // primitivo
		Double datoDoubleWrapper = 123.654; // wraper
		// conversiones
		double datoDouble1 = 6;
		Double datoConvertido6 = datoDouble1;
		System.out.println("double convertido" + datoConvertido6);

		// char
		char datochar = 'A'; // primitivo
		Character datoCharWrapper = 'A'; // primitivo
		// conversiones
		char datoChar1 = 6;
		Character datoConvertido7 = datoChar1;
		System.out.println("char convertido" + datoConvertido7);

	}

}
