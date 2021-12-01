package es.iestriana.segundos.datos;
import java.util.Scanner;

//Programa que muestre el tiempo en horas, minutos y segundos

public class Segundos {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Segundos: ");
		int totalsegundos = sc.nextInt();
		
		int horas = totalsegundos / 3600;
		int minutos = (totalsegundos - (horas * 3600)) / 60;
		int segundos = totalsegundos - (horas * 3600) - (minutos * 60);
		
		System.out.println("Horas: " + horas + "\nMinutos: " + minutos + "\nSegundos " + segundos);
		
				
		
				
	}

}
