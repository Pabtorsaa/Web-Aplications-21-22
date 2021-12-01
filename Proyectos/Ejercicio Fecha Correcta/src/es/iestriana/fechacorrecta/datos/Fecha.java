package es.iestriana.fechacorrecta.datos;
import java.util.Scanner;                                     //Pregunta por la fecha y comprueba si es correcta
public class Fecha {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Día: ");
		int dia = sc.nextInt();
		
		System.out.println("Mes: ");
		int mes = sc.nextInt();
		
		System.out.println("Año: ");
		int anyo = sc.nextInt();
		
		boolean fechaCorrecta = false;
		
		//Comprobamos la fecha
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
						fechaCorrecta = true;
					}
					break;
				case 4:
				case 6: 
				case 9:
				case 11:
					if (dia >=1 && dia <= 30) {
						fechaCorrecta = true;
					}
					break;
				case 2: 
					boolean esBisiesto = ((anyo%4==0 && anyo%100!=0) || (anyo%400==0));
					if (esBisiesto && (dia >= 1 && dia <=29)) {
						fechaCorrecta = true;
					} else if (!esBisiesto && (dia >= 1 && dia <=28)) {
						fechaCorrecta = true;
					}
					break;
				}
			}
		}
		
		
		if (fechaCorrecta) {
			System.out.println("La fecha es correcta");
		} else {
			System.out.println("La fecha es incorrecta");
		}
		
		sc.close();
	}

}
