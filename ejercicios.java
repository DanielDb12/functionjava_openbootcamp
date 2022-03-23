public class ejercicios {

 //ejercicio1
	public static void main(String[] args) {
		int resultado;

		resultado = sumar( 30,  50, 60 );

		System.out.println(resultado);

		coche MiCoche = new coche();
		MiCoche.SumarPuerta();
		MiCoche.SumarPuerta();
		MiCoche.SumarPuerta();
		MiCoche.SumarPuerta();

		System.out.println(" mi coche tiene: "  +  MiCoche.puertas + " puertas ");


	}

	//tipo de dato vacio void

	public static int sumar(int a, int b, int c) {
		
		return a + b + c;

	


	}
}

	 /*
 ejercicio2
- Crear una clase coche.
- Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
- Una función que incremente el número de puertas que tiene el coche.
- Crear un objeto miCoche en el main y añadirle una puerta.
- Mostrar el número de puertas que tiene el objeto.
*/
	

	class coche {

		public int puertas = 0;


		public void SumarPuerta() {
			this.puertas++;
		}

		

	
	}	
	



