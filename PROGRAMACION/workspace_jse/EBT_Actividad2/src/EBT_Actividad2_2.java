import java.util.Scanner;

public class EBT_Actividad2_2 {

	public static void main(String[] args) {
		
		
				int n = (int)(Math.random()*40+1), numero=0; 
				int contador=0;
				Scanner leer = new Scanner(System.in);
				System.out.println("introduce un numero y acierta si es el aleatorio");
				
				numero = leer.nextInt();
				
				/*
				 * pregunto si el numero es distinto
				 */
                 
				while (n != numero) {
					
					/*
					 * pregunto si el numero es menor o mayor
					 */
					
					if ( numero > n)
						System.out.println("El numero introducido es mayor");
					
					else 
						System.out.println("El numero introducido es menor ");
					
					/*
					 * cuento total de numeros contados y pido que se introduzca otro numero
					 */
					contador++;
					System.out.println("total de numeros : " + contador);
					System.out.println(" vuelve a introducir un numero");
					
					numero = leer.nextInt();
					
					if (n==numero) {
						/*
						 * pregunto si el numero es igual e informo de que se ha acertado ademas de contar 
						 */
						System.out.println("numero acertado ");
							contador++;
							System.out.println("numeros contados ; " + contador);}
				
				
				
		
		

	}

}
}
