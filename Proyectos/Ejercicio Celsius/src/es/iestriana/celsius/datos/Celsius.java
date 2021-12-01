package es.iestriana.celsius.datos;

import java.util.Scanner;

public class Celsius {

	// Conversión de grados Celsius a Fahrenheit

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Grados Celsius: ");
		double gradosCelsius = sc.nextDouble();

		// Convertir a Fahrenheit
		double gradosFahrenheit = (gradosCelsius * 1.8) + 32;

		System.out.println(gradosCelsius + " grados Celsius son " + gradosFahrenheit + " grados Fahrenheit" );
	}
}
