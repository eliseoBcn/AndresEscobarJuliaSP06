package n2ejercicio2;

import n1ejercicio2.GenericMethods;
import n1ejercicio2.Persona;

public class TestEjercicio2 {

	public TestEjercicio2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		String generico = "cadena generico";
		int    numero   = 12;
		GenericMethods  genericMethods = new GenericMethods();
		
	
		genericMethods.ListaIndefinidaParametros( "rojo", 3666, new Persona("David", "Perez", 34),"verde",  444, 666, "negro");
	

		
		genericMethods.ListaIndefinidaParametros( "violin", new Persona("Maria", "Perez", 54),"piano");

	
	}

}
