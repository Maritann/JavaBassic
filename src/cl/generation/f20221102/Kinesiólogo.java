package cl.generation.f20221102;

public class Kinesiólogo extends EquipoBasquetball {

	private String titulo;
	private String especialidad;
	
	//contructor
	public Kinesiólogo() {
		super();
	}
	public Kinesiólogo(String titulo, String especialidad) {
		super();
		this.titulo = titulo;
		this.especialidad = especialidad;
	}
	
	//getter and setter
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	@Override
	public String toString() {
		return "Kinesiólogo [titulo=" + titulo + ", especialidad=" + especialidad + ", getNombre()=" + getNombre()
				+ ", getApellido()=" + getApellido() + ", getEdad()=" + getEdad() + ", toString()=" + super.toString()
				+ "]";
	}
	//sobreescribiendo

	@Override
	public void metodoImprimir () {
		System.out.println("Estoy en el metodo de la clase hija kine");
	

	
	
}
}
