
//Mostrar y calcular las longitudes de un rect�ngulo

package es.iestriana.rect�ngulo.datos;
import java.util.Scanner;
public class Rect�ngulo {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Base: ");
		int base = sc.nextInt();
		
		System.out.println("Altura: ");
		int altura = sc.nextInt();
		
		int area = base * altura;
		int perimetro = 2 * (base + altura);
		
		System.out.println("Perimetro : " + perimetro);
		System.out.println("Area: " + area);
	}

}
