package cl.generation.f20221102;

public class Basquebolista extends EquipoBasquetball {
	
	private Float peso;
	private Float altura;
	
	//contructor
	public Basquebolista() {
		super();
	}
	public Basquebolista(Float peso, Float altura) {
		super();
		this.peso = peso;
		this.altura = altura;
	
	}
	
	//getter and setter
	public Float getPeso() {
		return peso;
	}
	public void setPeso(Float peso) {
		this.peso = peso;
	}
	public Float getAltura() {
		return altura;
	}
	public void setAltura(Float altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "Basquebolista [peso=" + peso + ", altura=" + altura + ", getNombre()=" + getNombre()
				+ ", getApellido()=" + getApellido() + ", getEdad()=" + getEdad() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	@Override
	public void metodoImprimir () {
		System.out.println("Estoy en el metodo de la clase hija basquebolista");
	}
} 
