package paquete2;

import paquete1.Padre;

public class MHijo {
	private Padre p;
	public MHijo(Padre _p) {
		p=_p;
	}
	public void manipularPadre() {
		//¿Puedo acceder al nombre del padre? Sí
		System.out.println(p.nombre);
		//¿Puedo acceder al apellido del padre? No comparte paquete
		//System.out.pritnln(p.apellido);
		//¿Puedo acceder a la edad del padre? No, por que no hereda
		//System.out.pritnln(p.edad);
		//¿Puedo acceder al saldo del padre? No, es privado
		//System.out.println(p.saldo);
	}
}
