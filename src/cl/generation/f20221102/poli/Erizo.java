package cl.generation.f20221102.poli;

public class Erizo extends Mascota{
	private String sonido;
	
	public Erizo() {
		super();
	}


	public Erizo(String especie, String nombre, String sexo) {
		super(especie, nombre, sexo);

	}

	public Erizo(String especie, String nombre, String sexo, String sonido) {
		super(especie, nombre, sexo);
		this.sonido = sonido;
	}
	
	
    public String getSonido() {
		return sonido;
	}


	public void setSonido(String sonido) {
		this.sonido = sonido;
	}


	@Override
	public void emitirSonido() {
    	System.out.println("El sonido es (chillido) es kjjj");
    }


}
