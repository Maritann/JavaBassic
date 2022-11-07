package cl.generation.f20221102;

public class Profesores extends Colegio{
	
	private String asignatura;
	private String cargo;
	public Profesores() {
		super();
	}
	public Profesores(String asignatura, String cargo) {
		super();
		this.asignatura = asignatura;
		this.cargo = cargo;
	}
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	@Override
	public String toString() {
		return "Profesores [asignatura=" + asignatura + ", cargo=" + cargo + "]";
	}

	
}
