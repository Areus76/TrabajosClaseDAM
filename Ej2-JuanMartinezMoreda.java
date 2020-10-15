// Juan Martínez Moreda
import java.util.Random;
import java.util.Scanner;
public class XandY {
    public static void main (String[]Args){
       Scanner entradaEscaner = new Scanner(System.in);
       int intentos = 10;
       int numeroAleatorio = 0;
       int entrada = 0;
       Random rd = new Random();
       numeroAleatorio = rd.nextInt(100) + 1;
       System.out.print("Se ha generado un numero aleatorio entre 1 y 100. Intente adivinarlo: ");
        while (intentos >=1 && numeroAleatorio != (entrada = entradaEscaner.nextInt())){
        	intentos --;
        	if (entrada >= 101) intentos= intentos;
        		System.out.println("Te has pasado crack");
        		
            if (entrada < numeroAleatorio) 
            	
                System.out.print("No has acertado, el número es mayor. Prueba otra vez: ");
            else
                System.out.print("No has acertado, el número es menor. Prueba otra vez: ");
            
            if (intentos == 0)
                System.out.println("PA FUERA");
        }
        
        if (numeroAleatorio == entrada) {
        System.out.println("LO HAS ADIVINADO");
        
        }
    }   
    
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println(b);
		
		//Ejemplo5
		//String j = "Holiiiiiiiiiii siguiente linea\nQue te den";
		//String k = "Juaaaann tabula poh favoh\t hihihi";
		//System.out.println(j);
		//System.out.println(k);
		
		//Ejemplo6
		int a =3;
		int b =4;
		
		a+= b;
		System.out.println("Valor de a:" + a);
		
		int numero=1;
		for (int i = 0 ; i < 10; i++) {
			System.out.println(numero);
			numero+=numero;
		}
	}


}
