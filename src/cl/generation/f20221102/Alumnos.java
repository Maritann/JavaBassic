package cl.generation.f20221102;

public class Alumnos extends Colegio{

	private Integer edad;
	private String curso;
	public Alumnos() {
		super();
	}
	public Alumnos(Integer edad, String curso) {
		super();
		this.edad = edad;
		this.curso = curso;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	@Override
	public String toString() {
		return "Alumnos [edad=" + edad + ", curso=" + curso + "]";
	}
	
	
}
