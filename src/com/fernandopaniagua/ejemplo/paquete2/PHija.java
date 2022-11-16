package com.fernandopaniagua.ejemplo.paquete2;

import com.fernandopaniagua.ejemplo.paquete1.Padre;

public class PHija extends Padre {
	private Padre p;

	public PHija(Padre _p) {
		p = _p;
	}

	public void manipularPadre() {
		// ¿Puedo acceder al nombre del padre? Sí
		System.out.println(p.nombre);
		//¿Puedo acceder al apellido del padre? No, porque está en otro paquete *
		//System.out.println(p.apellido);
		
		//¿Puedo acceder a la edad del padre?
		System.out.println(p.edad);//????????
		
		// ¿Puedo acceder al saldo del padre? No, es privado
		// System.out.println(p.saldo);
	}
}
