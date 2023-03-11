package n2ejercicio1;

import n1ejercicio2.GenericMethods;
import n1ejercicio2.Persona;

public class TestEjercicio1 {

	public TestEjercicio1() {
		// TODO Auto-generated constructor stub
	}
    public static void main( String[] args )
    {

		String generico = "cadena generico";
		int    numero   = 12;
		GenericMethods  genericMethods = new GenericMethods();
		
		genericMethods.ImprimeObjetosejercicio(new Persona("David", "Perez", 34)  , generico, numero  );
       
		
		genericMethods.ImprimeObjetosejercicio(generico ,new Persona( "Ana", "MAria Matutes", 45), 80);
    }
    
}
