package es.iestriana.examen1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {

	private static Scanner sc = new Scanner(System.in);
	
	private static int [] numeros;
	private static int [] sinrepe;
	
	public static void main(String[] args) {
		int n = 0;
		do {
			System.out.println("Números: ");
			n = sc.nextInt();
		} while (n < 0);
		
		numeros = new int[n];
		sinrepe = new int[n];
		
		inicializar();
		
		System.out.println(Arrays.toString(numeros));
		
		quitarRepetidos();
		
		System.out.println(Arrays.toString(sinrepe));
		
		sc.close();
	}

	private static void quitarRepetidos() {
		int j = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (!buscarEnSinRepe(numeros[i])) {
				sinrepe[j] = numeros[i];
				j++;
			}
		}
	}

	private static boolean buscarEnSinRepe(int num) {
		boolean enc = false;
		for (int i = 0; i < sinrepe.length; i++) {
			if (sinrepe[i] == num) {
				enc = true;
			}
		}
		
		return enc;
	}

	private static void inicializar() {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(15)+1;
		}
	}

}