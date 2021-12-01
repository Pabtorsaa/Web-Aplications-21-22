package es.iestriana.examen1;

/*
 * Genera de manera repetida 20 números aleatorios entre 0 y 99
 * Con cada uno de ellos debes realizar las siguientes operaciones:ç
 * -Mostrar el numero
 * -Indicar si es 0
 * -Indicar si es positivo mayor que 50 o menor que 50
 * -Indicar si es primo o no lo es
 * -Indicar si es un numero completo: el número es igual a la suma de sus divisores
 */

import java.util.Random;

public class Ejercicio2 {
			public static void main(String[] args) {
				int numero = 0;
				int primo = 0;
				int suma = 0;
				for (int i = 0; i < 20; i++) {
					numero = new Random().nextInt(100);
					System.out.println(numero);
					if (numero == 0) {
						
						System.out.println(numero + " = 0");
					}else if (numero == 1) {
						
						System.out.println(numero + " = primo");
					}else {
						for (int a = 2; a < numero-1; a++) {
							if (numero%a != 0) {
								primo = 1;
							}else {
								primo = 0;
								break;
							}
						}
					}
					if(numero > 50) {
						System.out.println(numero + " es mayor que 50");
					}else {
						System.out.println(numero + " es menor que 50");
					}
					
					if(primo == 1) {
						System.out.println(numero + " = primo");
					}else {
						System.out.println(numero + " no es primo");
					}
					
					for (int a = 1; a < numero; a++) {
						if (numero % a == 0) {
							suma += a;
						}
					}
					
					if (suma == numero) {
						System.out.println(numero + " = numero completo");
					}
					
				}
			}
}