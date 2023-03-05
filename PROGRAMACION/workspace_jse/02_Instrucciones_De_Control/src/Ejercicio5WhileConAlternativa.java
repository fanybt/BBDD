import java.util.Scanner;

public class Ejercicio5WhileConAlternativa {

	/*
	 * voy a saber cuantos tengo mayores de edad y menores y sumar todas las edades .
	 */
	
	
	
	public static void main(String[] args) {
		int contadorMayores = 0, contadorMenores = 0, acumulador = 0, edad = 0;
		Scanner leer = new Scanner (System.in);
		System.out.println("Introduce tu edad");
		edad = leer.nextInt();
		
		
		while(edad!=0){ 
			
			if(edad>18) {
				System.out.println("eres mayor de edad");
				contadorMayores++;
			}
				
			else {
				System.out.println("eres menor de edad");
				contadorMenores++;
			}
		
		acumulador += edad;
		
		System.out.println("introduce tu edad");
		edad = leer.nextInt();
		
		}
		
		System.out.println("total de edades contadas mayores de edad : " + contadorMayores);
		System.out.println("total de edades contadas menores de edad : " + contadorMenores);
		System.out.println("suma de todas las edades : " + acumulador);
		

	}

}
