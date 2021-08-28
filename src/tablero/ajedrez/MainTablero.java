package tablero.ajedrez;

public class MainTablero  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// alfiles

		Alfil anegro1 = new Alfil();

		Alfil anegro2 = new Alfil();

		Alfil ablanco1 = new Alfil();

		Alfil ablanco2 = new Alfil();

		// caballos

		Caballo cnegro1 = new Caballo();

		Caballo cnegro2 = new Caballo();

		Caballo cblanco1 = new Caballo();

		Caballo cblanco2 = new Caballo();
		
		//peones
		
		Peon pnegro1 = new Peon();
		
		Peon pnegro2 = new Peon();
		
		Peon pnegro3 = new Peon();
		
		Peon pnegro4 = new Peon();
		
		Peon pnegro5 = new Peon();
		
		Peon pnegro6 = new Peon();
		
		Peon pnegro7 = new Peon();
		
		Peon pnegro8 = new Peon();
		
		Peon pblanco1 = new Peon();
		
		Peon pblanco2 = new Peon();
		
		Peon pblanco3 = new Peon();
		
		Peon pblanco4 = new Peon();
		
		Peon pblanco5 = new Peon();
		
		Peon pblanco6 = new Peon();
		
		Peon pblanco7 = new Peon();
		
		Peon pblanco8 = new Peon();
		
		//Reinas
		
		Reina rblanca = new Reina();
		
		Reina rnegra = new Reina();
		
		//Reyes
		
		Rey rblanco = new Rey();
		
		Rey rnegro = new Rey();
		
		//Torres
		
		Torre tnegra1 = new Torre();
		
		Torre tnegra2 = new Torre();
		
		Torre tblanca1 = new Torre();
		
		Torre tblanca2 = new Torre();
		
		Pieza tablero[][] = new Pieza[8][8];
		tablero[0][0] = tnegra1;
		tablero[0][1] = cnegro1;
		tablero[0][2] = anegro1;
		tablero[0][3] = rnegra;
		tablero[0][4] = rnegro;
		tablero[0][5] = anegro2;
		tablero[0][6] = cnegro2;
		tablero[0][7] = tnegra2;
		
		tablero[1][0] = pnegro1;
		tablero[1][1] = pnegro2;
		tablero[1][2] = pnegro3;
		tablero[1][3] = pnegro4;
		tablero[1][4] = pnegro5;
		tablero[1][5] = pnegro6;
		tablero[1][6] = pnegro7;
		tablero[1][7] = pnegro8;
		
		tablero[6][0] = pblanco1;
		tablero[6][1] = pblanco2;
		tablero[6][2] = pblanco3;
		tablero[6][3] = pblanco4;
		tablero[6][4] = pblanco5;
		tablero[6][5] = pblanco6;
		tablero[6][6] = pblanco7;
		tablero[6][7] = pblanco8;
		
		tablero[7][0] = tblanca1;
		tablero[7][1] = cblanco1;
		tablero[7][2] = ablanco1;
		tablero[7][3] = rblanca;
		tablero[7][4] = rblanco;
		tablero[7][5] = ablanco2;
		tablero[7][6] = cblanco2;
		tablero[7][7] = tblanca2;
		
		System.out.println("Tablero de Ajedres");

		
	}

}
