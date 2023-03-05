import java.util.Scanner;

public class Ejercicio4Whiles {

	public static void main(String[] args) {
		/*
		 *  leer edad de personas hasta que pulsen un 0
		 *  cuantos he leido buenos, y cuanto suman sus edades
		 */
		int contador = 0, acumulador = 0, edad = 0;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("teclea tu edad como  entero y cero para terminar");
		edad = leer.nextInt();
		
		while(edad != 0) {
			//procesar la edad: lo mismo para todos
			contador++;
			acumulador += edad;
			
			//volver a leer
			System.out.println("teclea tu edad como  entero y cero para terminar");
			edad = leer.nextInt();
		}		
		
		System.out.println("Edadades procesadas : " + contador);
		System.out.println("Cuanto suman las edades : " + acumulador);
	}

}
