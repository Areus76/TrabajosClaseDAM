// Juan Martínez Moreda
package es.fempa.programaciom;
import java.util.Scanner;
public class MenuJava {
	
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
	
	
	
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		boolean continuar=true;
		int opcion=4;
		
		do {
			System.out.println("Elige una opcion: ");
			System.out.println("1.Abrir programa.");
			System.out.println("2.cerrar programa.");
			System.out.println("3.Guardar.");
			System.out.println("4.Salir.");
			System.out.println("5.Submenu Copiar.");
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 1: {
				System.out.println("Abrir.");
				break;	
			}
			case 2: {
				System.out.println("Cerrar.");
				break;	
			}
			case 3: {
				System.out.println("Guardar.");
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
