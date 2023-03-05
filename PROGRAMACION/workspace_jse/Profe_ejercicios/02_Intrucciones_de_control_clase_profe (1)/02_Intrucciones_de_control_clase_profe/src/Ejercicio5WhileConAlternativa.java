import java.util.Scanner;

public class Ejercicio5WhileConAlternativa {

	public static void main(String[] args) {
		/*
		 *  leer edad de personas hasta que pulsen un 0
		 *  cuantos mayore y cuantos menores, y cuanto suman sus edades
		 */
		int contadorMayores = 0, contadorMenores = 0, acumulador = 0, edad = 0;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("teclea tu edad como  entero y cero para terminar");
		edad = leer.nextInt();
		
		while(edad != 0) {
			//procesar la edad: tengo que distinguir
			if (edad >= 18) 
				contadorMayores++;
			else 
				contadorMenores++;
					
			acumulador += edad;
			
			//volver a leer
			System.out.println("teclea tu edad como  entero y cero para terminar");
			edad = leer.nextInt();
		}		
		
		System.out.println("mayores : " + contadorMayores);
		System.out.println("menore : " + contadorMenores);
		
		System.out.println("Cuanto suman las edades : " + acumulador);
	 

	}

}
