package clientedeestaticos;

//Importar todo lo estático de una clase
import static estaticos.Clase1.*;
//Importar atributos y métodos estáticos de forma explícita
import static estaticos.Clase1.saldo;
import static estaticos.Clase1.sumar;
//import static estaticos.Clase1.restar;//NO COMPILA al no ser restar un método estático

public class Clase2 {
	public static void main(String[] args) {
		sumar(3);
		System.out.println(saldo);
	}
}
