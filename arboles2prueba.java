package es.fempa.programaciom;

import java.util.Arrays;
import java.util.Scanner;

public class arboles2prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int taman = 0;
		
		System.out.println("Cuantas zonas quieres repoblar?");
		taman = sc.nextInt();
		
		
		String[] nombrezonas = new String[taman];
		int[] [] datoszonas = new int[2] [taman];
		int[] acum = new int[taman];
		
		for (int i = 0; i < taman; i++) {
			System.out.println("Di el nombre de la zona numero " + i);
			nombrezonas[i] = sc.next();
				System.out.println("Primero di la Densidad que quieres repoblar del numero de zona "+nombrezonas[i]+":");
			datoszonas[0] [i] = sc.nextInt();
			System.out.println("Segundo di el numero de Arboles que quieres repoblar del numero de zona ");
			datoszonas[1] [i] = sc.nextInt();
			}

		for (int i = 0; i < taman; i++){
			System.out.println("Zona correspondiente a los datos "+nombrezonas[i]);
				System.out.println("Tienen una Densidad de: "+datoszonas[0][i]);
				System.out.println("Tienen un numero de Arboles de: "+datoszonas[1][i]);
				
			}
		
		for (int i = 0; i < taman; i++) {
			acum[i] = datoszonas[0][i]*datoszonas[1][i];
			System.out.println("Zona correspondiente a los datos "+nombrezonas[i]+ " Y tienen un Area de "+acum[i]);
		}
		int acumtotal = 0;
		for (int i = 0; i < taman; i++) {
			 acumtotal += acum[i];
		}
		System.out.println("La suma total de todos los arboles es: " + acumtotal);
		
		boolean siono = true;
		System.out.println("Quieres aumentar las zonas?");
		siono = sc.nextBoolean();
		
		if (siono = true) {
			
		System.out.println("Ahora vamos a aumentar el tamaño de la tabla que contiene la Densidad y el Area");
		System.out.println("Di el tamaño nuevo que va a tener");
		int taman2 = 0;
		taman2 = sc.nextInt();
	
		String[] nombrezonas2 = new String[taman2];
		int[] [] datoszonas2 = new int[2] [taman2];
		
		
		
			for (int i = taman; i < taman2; i++) {
			System.out.println("Di el nombre de la zona numero " + i);
			nombrezonas2[i] = sc.next();
				System.out.println("Primero di la Densidad que quieres repoblar del numero de zona "+nombrezonas2[i]+":");
			datoszonas2[0] [i] = sc.nextInt();
			System.out.println("Segundo di el numero de Arboles que quieres repoblar del numero de zona ");
			datoszonas2[1] [i] = sc.nextInt();
			}
		
		
		
		for (int i = 0; i < taman; i++) {
			String sumanombres;
				sumanombres = nombrezonas[i];
				nombrezonas2[i] = sumanombres;
		}
		for (int i = 0; i < taman; i++) {
			int sumadatos0 = 0;
			int sumadatos1 = 0;
			for (int j = 0; j < taman; j++) {
				sumadatos0 = datoszonas[0][i] + datoszonas2[0][j];
				sumadatos1 = datoszonas[1][i] + datoszonas2[1][j];
			}
			datoszonas2[0][i] = sumadatos0;
			datoszonas2[1][i] = sumadatos1;
		}
		for (int i = 0; i < taman2; i++){
			System.out.println("Zona correspondiente a los datos "+nombrezonas2[i]);
				System.out.println("Tienen una Densidad de: "+datoszonas2[0][i]);
				System.out.println("Tienen un numero de Arboles de: "+datoszonas2[1][i]);
		}
		
		for (int i = 0; i < taman2; i++) {
			acum[i] = datoszonas2[0][i]*datoszonas2[1][i];
			System.out.println("Zona correspondiente a los datos "+nombrezonas2[i]+ " Y tienen un Area de "+acum[i]);
		}
	
	}
		else {
			System.out.println("No realizamos ninguna opetacion mas.");
		}
}
}
