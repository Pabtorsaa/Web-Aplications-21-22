package es.iestriana.ejercicioa0.datos;

import java.util.Scanner;

public class Numeroa0 {

	/*
	 * Request a positive number. Show all numbers from requested to 0 
	 * 
	 */
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int numero = 0;
		do {
			System.out.println("Nº: ");
			numero = sc.nextInt();
		} while (numero <= 0);
		
		mostrarDesdeNumeroACero(numero);
		
		sc.close();
	}

	private static void mostrarDesdeNumeroACero(int numero) {
		for (int i = numero; i >= 0; i--) {
			System.out.println(i + " ");
		}
	}

}