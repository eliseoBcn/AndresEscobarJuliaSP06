package n1ejercicio2;

public class GenericMethods {

	public GenericMethods() {
	}

	
	public static void main(String[] args) {

		
		String generico = "cadena generico";
		int    numero   = 12;
		GenericMethods  genericMethods = new GenericMethods();
		
		genericMethods.ImprimeObjetos(new Persona("David", "Perez", 34)  , generico, numero  );

		genericMethods.ImprimeObjetos(generico,numero,  new Persona("David", "Perez", 50)      );

	}

	public   <T,R,S> void ImprimeObjetos ( T primero, R segundo, S tercero) {
		
		System.out.println ( primero.toString() + " \n " + segundo.toString() + "\n  " + tercero.toString()  ); 
	
	}
	public   <T,R> void ImprimeObjetosejercicio ( T  o1, R o2 ,  int  numero) {
		
		System.out.println ( o1.toString() + " \n " + o2.toString() + "\n  " + numero  ); 
	
	}
 

	public static <T> void   ListaIndefinidaParametros( T... objetos) {

		System.out.println ( " Lista parámetros\n");
		for ( int i = 0 ; i < objetos.length; i++ )
		System.out.println ( objetos[i].toString() ); 
 
	}

}
