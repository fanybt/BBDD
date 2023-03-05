import java.util.Scanner;

public class NumeroCuadrado {

	public static void main(String[] args) {
		double n = 0;
		
		do {
			Scanner leer = new Scanner (System.in);
			System.out.println("introduce un numero");
			n = leer.nextDouble();
			if ( n > -1) {
				double cuadrado = Math.pow(n, 2);
				System.out.println("cuadrado : " + cuadrado);
			}
				}
			
			
		while(n >-1);
		
	}	
}

		
		
		
		
		