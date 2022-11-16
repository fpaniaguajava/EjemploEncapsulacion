package com.fernandopaniagua.ejemplo.paquete1;

public class Hija extends Padre{
	private Padre p;
	public Hija(Padre _p) {
		p=_p;
	}
	public void manipularPadre() {
		//¿Puedo acceder al nombre del padre? Sí
		System.out.println(p.nombre);
		//¿Puedo acceder al apellido del padre? Sí, comparte paquete
		System.out.println(p.apellido);
		//¿Puedo acceder a la edad del padre? Sí, porque hereda
		System.out.println(p.edad);
		//¿Puedo acceder al saldo del padre? No, es privado
		//System.out.println(p.saldo);
	}
}
