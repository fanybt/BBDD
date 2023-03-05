import java.util.Scanner;

public class NumeroAleatorio {

	public static void main(String[] args) {
		/*
		 * pedimos que se introduzcan numeros hasta coincidir con el aleatorio que 
		 * es de 1-40.
		 * indicar si el numero introducido es menor o mayor a el aleatorio
		 * y avisar cuando se acierte .
		 * contar cuantos numeros se han introducido hasta acertar .
		 */

		
		int n = (int)(Math.random()*10+1);
		int numero = 0;
		int contador = 0;
		Scanner leer = new Scanner (System.in);
		System.out.println("introduce un numero del 1 al 40 hasta acertar");
		numero = leer.nextInt();
		
		while (numero != n) {
			if (numero>n)
				System.out.println("el numero es mayor");
			else
				System.out.println("el numero es menor ");
			
			contador++;
			System.out.println("vuelve a introducir un numero");
			numero = leer.nextInt();
			
		}
		
		if (numero == n ) {
			System.out.println("numero acertado");
			contador++;
			System.out.println("numeros hasta acertar  : " + contador);
			
		}
		
		
	}

}
