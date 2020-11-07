// Juan Martínez Moreda
package es.fempa.programaciom;

public class EjercicioAreusArray {

	public static void main(String[] args) {
		
		int[] Fdensidad = new int[] {2,4,1,6};
		int[] Area = new int[] {4,2,6,7};
		int[] multtotal = new int[Area.length];
		
		for (int i = 0; i < Area.length; i++) {

			multtotal[i] = Fdensidad[i] * Area[i];

			System.out.println("La multiplicacion de la DENSIDAD y del AREA es: " + multtotal[i]);
			
			
		}
		int sumat = multtotal[0]+multtotal[1]+multtotal[2]+multtotal[3];
		System.out.println("Suma total de arboles es: "+ sumat);
	}

}
