package com.fernandopaniagua.ejemplo;

import com.fernandopaniagua.ejemplo.paquete1.Hija;
import com.fernandopaniagua.ejemplo.paquete1.Hijo;
import com.fernandopaniagua.ejemplo.paquete1.Padre;
import com.fernandopaniagua.ejemplo.paquete2.MHijo;
import com.fernandopaniagua.ejemplo.paquete2.PHija;

public class App {

	public static void main(String[] args) {
		Padre p = new Padre();
		Hija ha = new Hija(p);
		Hijo ho = new Hijo(p);
		MHijo mho = new MHijo(p);
		PHija pha = new PHija(p);
		
		Padre peter = new Padre("Peter",1000);
		Padre john = new Padre("John",500);
		peter.consultarSaldo(john);
	}

}
