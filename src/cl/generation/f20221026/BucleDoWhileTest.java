package cl.generation.f20221026;

import java.util.Scanner;

public class BucleDoWhileTest {

	public static void main(String[] args) {
		// doWhile
		// a lo menos se ejecuta una vez
		Scanner scanner = new Scanner(System.in);
		int edad = 0;
		Float kilos = 0f;
		Float estatura = 0f;

		do {

			System.out.println("Ingresa tu edad");
			edad = scanner.nextInt();

		} while (edad < 18 || edad > 120);

		System.out.println(edad);

		// peso
		do {

			System.out.println("Ingresa tu peso");
			kilos = scanner.nextFloat();

		} while (kilos < 40 || kilos > 120);
		System.out.println("kilos ingresados" + kilos);
		scanner.close();

		//estatura
		do {

			System.out.println("Ingresa tu estatura en metros");
			estatura = scanner.nextFloat();

		} while (estatura < 1 || estatura > 2.3);
		System.out.println("kilos ingresados" + estatura);
		scanner.close();
	}

}
