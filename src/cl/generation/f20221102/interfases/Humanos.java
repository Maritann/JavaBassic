package cl.generation.f20221102.interfases;

public class Humanos extends Omnivoro implements Generico{
	private boolean razonamiento;

	public Humanos() {
		super();
	}

	public Humanos(boolean razonamiento) {
		super();
		this.razonamiento = razonamiento;
	}

	public boolean isRazonamiento() {
		return razonamiento;
	}

	public void setRazonamiento(boolean razonamiento) {
		this.razonamiento = razonamiento;
	}

	@Override
	public void respirar() {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void comer() {
		System.out.println("El humano come de todo");
		
	}
	
	

}
