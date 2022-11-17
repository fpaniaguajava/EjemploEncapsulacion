package paquete2;

import paquete1.Padre;

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
		//System.out.println(p.edad);//No se puede del padre.
		
		
		// ¿Puedo acceder al saldo del padre? No, es privado
		// System.out.println(p.saldo);
		
		//¿Puedo acceder a mi apellido? No, porque está en otro paquete
		//System.out.println(this.apellido);
		
		//¿Puedo acceder a mi edad? Sí, porque es atributo heredado
		System.out.println(this.edad);
	}

}
