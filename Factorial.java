//Juan Martínez Moreda
package es.fempa.programaciom;
import java.util.Scanner;

class Factorial {
public static void main (String [] args) {
	long factorial=1;
    int num;
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    num = sc.nextInt();
    for (int i = num; i > 0; i--) {
        factorial = factorial * i;
    }
    System.out.println("El factorial de " + num + " es: " + factorial);
}
} 