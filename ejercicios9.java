public class ejercicios9 {


	public static void main(String[] args) {

		Cliente persona = new Cliente();
		persona.nombre = "Daniel";
		persona.edad = 30;
		persona.telefono =  4162764;
		persona.credito = 120;


		System.out.println(persona.getNombre());
		System.out.println(persona.getEdad());
		System.out.println(persona.getTelefono());
		System.out.println(persona.getCredito());



		Trabajador trabajador = new Trabajador();
		trabajador.nombre = "Andres";
		trabajador.edad = 25;
		trabajador.telefono = 451397;
		trabajador.salario = 1200; 
		

		System.out.println(trabajador.getNombre());
		System.out.println(trabajador.getEdad());
		System.out.println(trabajador.getTelefono());
		System.out.println(trabajador.getSalario());

	}

}


class Persona {
	 String nombre;
	 int edad;
	int telefono;
}

class Cliente extends Persona {

	int  credito;

	public void  cliente(String nombre, int edad, int telefono ) {
		this.nombre = nombre;
		this.edad = edad;
		this.telefono = telefono;

	} 

	public String getNombre() {
		return "nombre: " + this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdad() {
		return "edad: " + this.edad + " años";
	}

	public void setEdad (int edad) {
		this.edad =  edad;
	}

	public String getTelefono() {
		return "Telefóno: " + this.telefono;
	} 

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getCredito() {
		return "Credito: " + this.credito + "$";
	} 

	public void setCredito(int credito) {
		this.credito = credito;
	}


}


class Trabajador extends Persona {

	int salario;

	public void  trabajador(String nombre, int edad, int telefono ) {
		this.nombre = nombre;
		this.edad = edad;
		this.telefono = telefono;

	} 

	public String getNombre() {
		return "nombre: " + this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdad() {
		return "edad: " + this.edad + " años";
	}

	public void setEdad (int edad) {
		this.edad =  edad;
	}

	public String getTelefono() {
		return "Telefóno: " + this.telefono;
	} 

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getSalario() {
		return "Salario: " + this.salario + "$";
	} 

	public void setSalario(int salario) {
		this.salario = salario;
	}

}