package oop.pojos2;

public class Persona extends oop.pojos.Persona {
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Persona(Long id, String nombre, String apellidos) {
		super(id, nombre, apellidos);
		// TODO Auto-generated constructor stub
	}

	public Persona(Long id, String nombre) {
		super(id, nombre);
		// TODO Auto-generated constructor stub
	}

	public Persona(oop.pojos.Persona persona) {
		super(persona);
		// TODO Auto-generated constructor stub
	}

	public Persona(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	public void getFullName() {
		System.out.println(this.getNombre() + " " + this.getApellidos());
	}
}
