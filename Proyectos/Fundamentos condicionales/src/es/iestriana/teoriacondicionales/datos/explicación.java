package es.iestriana.teoriacondicionales.datos;

import java.util.Scanner;

public class explicaci�n {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("N� 1: ");                              // N�mero 1
		int num1 = sc.nextInt();
		
		System.out.println("N� 2: ");                              // N�mero 2
		int num2 = sc.nextInt();           
		
		if  (num1 == num2) {                                       // Doble igual para comparar
			System.out.println("Son iguales");
		} else if (num1 > num2 ) {                                 // else if al ser la segunda posible respuesta
			System.out.println(num1 + " es mayor que" + num2);  
		} else {                                                   // solo else al ser la �ltima posible repsuesta 
			System.out.println(num2 + " es mayor que" + num1);
			
		}

		
		boolean condicion = num1 == num2;
		
		if (condicion) {                                           // !condicion para poner que no son iguales (falso), cambiando de orden los System.out
			System.out.println("Son iguales");
		} else {
			System.out.println("Son distintos");
		}
		
		
		
		if (num1 % num2 == 0)
			System.out.println(num1+ " es m�ltiplo de " + num2);
		else if (num2 % num1 == 0)
			System.out.println(num2+ " es m�ltiplo de " + num1);
		else
			System.out.println("No son multiplos");
		
		System.out.println("N� 3: ");
		int num3 = sc.nextInt();
		
		//Sacar los 3 n�meros en orden de mayor a menor
		if (num1 > num2 && num1 > num3) {                          // && se usa como "y", ambas cosas a cada lado del y deben cumplirse
			 if (num2 > num3) { 
				 System.out.println(num1 + " " + num2 + " " + num3);
			 } else {
				 System.out.println(num1 + " " + num3 + " " + num2);
			 }
		} else if (num2 > num1 && num2 > num3) {
			if (num1 > num3) {
				System.out.println(num2 + " " + num1 + " " + num3);
			} else {
				System.out.println(num2 + " " + num3 + " " + num1);
			}
		} else {
			if (num1 > num2) {
				System.out.println(num3 + " " + num1 + " " + num2);
			} else {
				System.out.println(num3 + " " + num2 + " " + num1);
			}
		}
				
		sc.close();
	}
}
