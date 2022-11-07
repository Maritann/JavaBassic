package cl.generation.f20221102;

public class Directivos extends Colegio {

	private String cargo;
	private String profesión;

	public Directivos() {
		super();
	}

	public Directivos(String cargo, String profesión) {
		super();
		this.cargo = cargo;
		this.profesión = profesión;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getProfesión() {
		return profesión;
	}

	public void setProfesión(String profesión) {
		this.profesión = profesión;
	}

	@Override
	public String toString() {
		return "Directivos [cargo=" + cargo + ", profesión=" + profesión + "]";
	}



}
