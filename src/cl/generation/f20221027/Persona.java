package cl.generation.f20221027;

public class Persona {
	//atributo
	private String nombre;
	private String apellidoP;
	private Float edad;
	private String nacionalidad;
	private Float estatura;

	//constructor
	public Persona() {
		super();
	}

	public Persona(String nombre, String apellidoP, Float edad, String nacionalidad, Float estatura) {
		super();
		this.nombre = nombre;
		this.apellidoP = apellidoP;
		this.edad = edad;
		this.nacionalidad = nacionalidad;
		this.estatura = estatura;
	}

	//getters and setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoP() {
		return apellidoP;
	}

	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
	}

	public Float getEdad() {
		return edad;
	}

	public void setEdad(Float edad) {
		this.edad = edad;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public Float getEstatura() {
		return estatura;
	}

	public void setEstatura(Float estatura) {
		this.estatura = estatura;
	}

	

	//metodos no lo pide
	
	//tostring
	
	@Override
	public String toString() {
		return "PersonaActObjeto [nombre=" + nombre + ", apellidoP=" + apellidoP + ", edad=" + edad + ", nacionalidad="
				+ nacionalidad + ", estatura=" + estatura + "]";
	}
	
}
