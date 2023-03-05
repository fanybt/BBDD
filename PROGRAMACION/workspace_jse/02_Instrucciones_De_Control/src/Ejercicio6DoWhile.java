
public class Ejercicio6DoWhile {

	public static void main(String[] args) {
		/*
		 * contar del 1-10 y sumar todos los numeros 
		 * 
		 */

		int acumulador = 0,numero = 1;
				
				do {
					System.out.println(numero);
				acumulador+=numero;
				numero++;
				}
				while(numero <=10);
				
				
				
				
				
				System.out.println( "suma de numero : " + acumulador);
		
		
		
		
 }
}