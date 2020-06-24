public class Casillero<T extends Number> {
	
	//extends Number si incluyo esto me fallan todos los String
	private T contenido;
	private static T elemento;//No puedo crear  una definicion static en genéricos
	public static T get_elem() {return elemento;}//No puedo crear  una definicion static en genéricos


	public Casillero(T cont) {
		contenido = cont;
	}

	public Casillero() {
	}

	public void setContenido(T cont) {
		contenido = cont;
	}

	public T getContenido() {
		return contenido;
	}

	public static void main(String args[]) {
		
		Casillero casilleroTres= new Casillero();
		Casillero <Number> casilleroTres,  casilleroCuatro; //YA DEFINO casilleroTres ARRIBA
		Casillero <String> casilleroUno = new Casillero<String>();
		Casillero <Integer> casilleroDos = new Casillero<Integer>(new Integer(30));
		casilleroTres= new Casillero<Number>(new Number(45.8)); //NO PUEDO INSTANCIARLO COMO NUMBER
		casilleroCuatro = new Casillero<Double>(new Double(45.8)); //HAY QUE PASARLE new Casillero<Number>(new Double(45.8))
	
		casilleroTres=casilleroUno; //a casilleroTres que es genérico le estoy tratando de asignar casilleroUnoque es un String
		casilleroUno=casilleroDos; //casilleroUno es String y casilleroDos es Integer
		casilleroUno.setContenido("Hola");
		String pp = casilleroDos.getContenido(); //Le trato de asignar a un String un Integer
		casilleroDos.setContenido(2.0); //A un Integer le trato de asignar un Double
		casilleroUno.setContenido(new Float()); //A new Float() le debería definir un número del tipo float y a casilleroUno no le puedo setear un float
	}

}
