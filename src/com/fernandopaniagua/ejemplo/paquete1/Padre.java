package com.fernandopaniagua.ejemplo.paquete1;

public class Padre {
	public String nombre;
	String apellido;//Default-paquete
	protected int edad;
	private int saldo;
	
	public Padre() {	
	}
	
	public void setSaldo(int nuevoSaldo) throws Exception {
		if (nuevoSaldo<0) throw new Exception("El saldo no puede ser negativo");
		this.saldo = nuevoSaldo;
	}
	
	public Padre(String nombre, int saldo) {
		this.nombre = nombre;
		this.saldo = saldo;
	}
	
	public void consultarSaldo(Padre hermano) {
		System.out.println("El saldo de " + hermano.nombre + " es " + hermano.saldo);
	}
}
