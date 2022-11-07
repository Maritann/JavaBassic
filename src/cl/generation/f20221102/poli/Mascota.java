package cl.generation.f20221102.poli;

public class Mascota {
	//atributo
	private String especie;
	private String nombre;
	private String sexo;
	
	//constructores
	public Mascota() {
		super();
	}
	public Mascota(String especie, String nombre, String sexo) {
		super();
		this.especie = especie;
		this.nombre = nombre;
		this.sexo = sexo;
	}
	
	//getter and setter
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	@Override
	public String toString() {
		return "Mascota [especie=" + especie + ", nombre=" + nombre + ", sexo=" + sexo + "]";
	}
	
	
    public void emitirSonido() {
    	System.out.println("El sonido es ...");
    }
    
    //polimorfismo parametrico

    	
        public void horasSiesta(int horas) {
        	System.out.println("La mascota duerme "+horas+ " horas");
    	
    }
        public void horasSiesta() {
        	System.out.println("La mascota no horas");
    	
    }
}
