package es.iestriana.fechacorrectaseguida.datos;

import java.util.Scanner;

	/* Pregunta por el día, mes y año y muestra la del día siguiente (fecha correcta).
	 * Solo con meses de 28, 30 y 31 días sin años bisiestos */
	 
public class FechaCorrectaSeguida {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Día: ");
		int dia = sc.nextInt();
		System.out.println("Mes: ");
		int mes = sc.nextInt();
		System.out.println("Año: ");
		int anyo = sc.nextInt();
		
		if (FechaCorrectaSeguida(dia,mes,anyo)) {
			int diasdelmes = 0;
			switch (mes) {
			case 2:
				diasdelmes = 28;
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				diasdelmes = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11: 
				diasdelmes = 30;
				break;
			default:
				break;
			}
			
			dia++;
			if (dia > diasdelmes) {
				dia = 1;
				mes++;
				if (mes > 12 ) {
					mes = 1;
					anyo++;
				}
			}
			System.out.println("Fecha Nueva: " + dia + "/" + mes + "/" + anyo);
		} else { 
			System.out.println("Fecha Incorrecta");
			// dia = dia + 1;
			// dia += 1;
			// dia++;
			
			sc.close();	
		}
	}
	
	private static boolean FechaCorrectaSeguida(int dia, int mes, int anyo) {
		boolean FechaCorrectaSeguida = false;
		if (anyo >= 0) {                                       // comprobamos que el año sea correcto
 			if (mes >= 1 && mes <= 12); {                      // comprobamos que el mes sea correcta
				switch (mes) {                                 // meses de 31 días
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12: 
					if (dia >= 1 && dia <= 31) {
						FechaCorrectaSeguida = true;
					}
					break;
				case 4:
				case 6: 
				case 9:
				case 11:
					if (dia >=1 && dia <= 30) {
						FechaCorrectaSeguida = true;
					}
					break;
				case 2: 
					boolean esBisiesto = ((anyo%4==0 && anyo%100!=0) || (anyo%400==0));
					if (esBisiesto && (dia >= 1 && dia <=29)) {
						FechaCorrectaSeguida = true;
					} else if (!esBisiesto && (dia >= 1 && dia <=28)) {
						FechaCorrectaSeguida = true;
					}
					break;
				}
			}
		}
		
		return FechaCorrectaSeguida;
	}
}
