package es.iestriana.examen1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

	private static Scanner sc = new Scanner(System.in);
	
	private static int [] arrayPares;
	private static int [] arrayImpares;
	
	public static void main (String[] args) {
		int n = 0;
		do {
			 System.out.println("Número: ");
			 n = sc.nextInt();
		 } while (n <= 0);
		
		arrayPares = new int[n];
		arrayImpares = new int[n];
		
		inicializar();
		
		System.out.println("PARES: " + Arrays.toString(arrayPares));
		System.out.println("IMPARES: " + Arrays.toString( arrayImpares));
		
		cambiar();
		
		System.out.println("-------");
		System.out.println("PARES: " + Arrays.toString(arrayPares));
		System.out.println("IMPARES: " + Arrays.toString( arrayImpares));
	}

	private static void cambiar() {
		for (int i = 0; i < arrayPares.length; i++) {
			if (arrayPares[i]%2 != 0) {
				arrayPares[i] = arrayPares[i] + 1;
			}
			if (arrayImpares[i]%2 == 0) {
				arrayImpares[i] = arrayImpares[i] - 1;
			}
			
		}		
	}

	private static void inicializar() {
		for (int i = 0; i < arrayPares.length; i++) {
			arrayPares[i] = new Random().nextInt(50)+1;
			arrayImpares[i] = new Random().nextInt(50)+1;
		}
	}
 
}