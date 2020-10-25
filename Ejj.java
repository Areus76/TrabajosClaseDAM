// Juan Martínez Moreda
package es.fempa.programaciom;
import java.util.Scanner;
public class Ejj {
	
	private static final char Si = 0;



	public static void mostrarSubmenu() {
		Scanner sc = new Scanner(System.in);
		boolean continuar=true;
		int opcion=4;
		
		do {
			System.out.println("Elige una opcion: ");
			System.out.println("1.Holi.");
			System.out.println("2.Adios.");
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 1: {
				System.out.println("HOli.");
				break;	
			}
			case 2: {
				System.out.println("Adios.");
				break;	
			}
		} 
	} while (continuar);
	}
	public static void Accidente() {
		//boolean Lluvia1 = true;
		//boolean Trafico = true;
		//boolean Dia = true;
		//boolean Experto = true;
		//boolean ESP = true;
		
		System.out.println("-Conteste a estas preguntas: ");
		System.out.println("-¿Esta lloviendo?");
		
		Scanner sc = new Scanner (System.in);
		boolean Lluvia = sc.nextBoolean();
		int acumulado = 0;
		if (Lluvia == true) {
			System.out.println("Esta lloviendo");
			acumulado = acumulado + 30;
		} else {
			System.out.println("No esta lloviendo");
			acumulado = acumulado + 0;
		}
		
		System.out.println("-¿Hay mucho trafico?");
		boolean Trafico = sc.nextBoolean();
		
		if (Trafico == true) {
			System.out.println("Mucho Trafico");
			acumulado = acumulado + 30;
		} else {
			System.out.println("Poco Trafico");
			acumulado = acumulado - 5;
		}
		
		System.out.println("-¿Es de Dia o de Noche?");
		boolean Dia = sc.nextBoolean();
		
		if (Dia == true) {
			System.out.println("Es de Dia");
			acumulado = acumulado - 10;
		} else {
			System.out.println("Es de Noche");
			acumulado = acumulado + 20;
		}
		
		System.out.println("-¿Es conductor Experto o Novel?");
		boolean Experto = sc.nextBoolean();
		
		if (Experto == true) {
			System.out.println("Es Experto");
			acumulado = acumulado - 50;
		} else {
			System.out.println("Es Novel");
			acumulado = acumulado + 0;
		}
		
		System.out.println("-¿ESP Activado o Desactivado?");
		boolean ESP = sc.nextBoolean();
		
		if (ESP == true) {
			System.out.println("Esta Activado");
			acumulado = acumulado - 20;
		} else {
			System.out.println("Esta Desactivado");
			acumulado = acumulado + 10;
		}
		if ((ESP == true)&&(Lluvia == true)) {
			System.out.println("Esta Activado Y Llueve");
			acumulado = acumulado - 30;
		} else {
			System.out.println("Esta Desactivado Y No Llueve");
			acumulado = acumulado + 0;
		}
		if ((Dia == true)&&(Lluvia == true)) {
			System.out.println("Es de Dia Y Llueve");
			acumulado = acumulado - 20;
		} else {
			System.out.println("Es de Noche Y No Llueve");
			acumulado = acumulado + 0;
		}
		if ((ESP == true)&&(Experto == true)) {
			System.out.println("Esta Activado Y es Experto");
			acumulado = acumulado - 20;
		} else {
			System.out.println("Esta Desactivado Y es Experto");
			acumulado = acumulado + 0;
		}
		System.out.println("El numero de inflacción es: "+acumulado+"%");
		
	}
	public static void fibonnacci() {
		int n1 = 0;
		int n2 = 1;
		int n3;
		int i;
		int count;
		Scanner sc = new Scanner(System.in);
	    System.out.print("Introduce el puesto que quieras saber de la escala: ");
	    count = sc.nextInt();
	    System.out.println(n1);
	    System.out.println(n2);
	    for (i = 0 ; i < count; i++) {
	    	n3=n1+n2;
	    	System.out.println(""+ n3);
	    	n1=n2;
	    	n2=n3;
	    }
	    	
	}
	
	
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		boolean continuar=true;
		int opcion=4;
		
		do {
			System.out.println("Elige una opcion: ");
			System.out.println("1.Abrir programa Accidentes.");
			System.out.println("2.cerrar programa FibonnacciS.");
			System.out.println("3.Guardar.");
			System.out.println("4.Salir.");
			System.out.println("5.Submenu Copiar.");
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 1: {
				System.out.println("Accidente.");
				// LLamar a una funcion llamada accidente
				Accidente();
				break;	
			}
			case 2: {
				System.out.println("Función Fibonnacci.");
				// llamar a una funcion llamada fibonnacci
				fibonnacci();
				break;	
			}
			case 3: {
				System.out.println("Guardar.");
				// llamar a funcion vector
				break;	
			}
			case 4: {
				System.out.println("Salir.");
				break;	
			}
			case 5: {
				mostrarSubmenu();
				break;	
			}
			
//			if(opcion==1) {
//				System.out.println("Abrir.");
//			}
//			else if(opcion==2) {
//				System.out.println("Cerrar.");
//			}
//			else if(opcion==3) {
//				System.out.println("Guardar.");
//			}
//			else if(opcion==4) {
//				System.out.println("Salir.");
//				continuar=false;
//			}
		}
			
		}	while (continuar); 		
	}
}
