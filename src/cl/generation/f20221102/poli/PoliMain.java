package cl.generation.f20221102.poli;

public class PoliMain {

	public static void main(String[] args) {
		// Polimorfismo

		Mascota mascota = new Mascota();
		mascota.emitirSonido();

		Gato Luna = new Gato();
		Luna.emitirSonido();

		Erizo Chitrina = new Erizo();
		Chitrina.emitirSonido();

		/**************************/

		// para que exista la herencia debe haber jerarquía de clase
		// una super clase se comporta como una clase hija, pero no es la clase hija

		Mascota regalon = new Erizo();
		regalon.emitirSonido();
		regalon.setEspecie(null); // solo me da los atributos del padre, no me da sonido porque no es un erizo
		System.out.println(regalon.toString());

		Mascota michi = new Gato(); // la clase se comporta como la clase pero no es la clase
		michi.emitirSonido();
		michi.horasSiesta(16);
	}
	// polimorfismo parametrico, el metodo se escribe igual pero recibe distintos parametros
    // polimorfismo de inclusión
}

