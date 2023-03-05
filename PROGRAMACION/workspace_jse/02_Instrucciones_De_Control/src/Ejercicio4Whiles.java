import java.util.Scanner;

public class Ejercicio4Whiles {

	public static void main(String[] args) {
		/*
		 * vamos a leer la edad , y sumar contar cuantas edades leo y sumar todas ellas.
		 * Salir cuando pulsen 0.
		 * 
		 */
		int contador = 0,  acumulador = 0, edad = 0;
		Scanner leer = new Scanner (System.in);
		System.out.println("Introduce tu edad");
		edad = leer.nextInt();
		
		
		while(edad!=0){    
		
		acumulador += edad;
		contador++;
		System.out.println("introduce tu edad");
		edad = leer.nextInt();
		
		}
		
		System.out.println("total de edades contadas : " + contador);
		System.out.println("suma de todas las edades : " + acumulador);
		
		
	}

}

