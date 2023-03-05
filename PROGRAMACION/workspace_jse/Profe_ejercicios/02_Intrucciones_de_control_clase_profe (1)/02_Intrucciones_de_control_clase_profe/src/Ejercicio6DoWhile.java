
public class Ejercicio6DoWhile {

	public static void main(String[] args) {
		/*
		 * procesamos numeros del 1 al 10
		 * escribir cada uno y sumar los numeros procesados
		 */
		int acumulador = 0, numero = 1;
		do {
			System.out.println(numero);
			acumulador += numero;
			numero++;
		}while (numero <= 10);
		
		
		
		System.out.println("suma de numero : " + acumulador);
	}

}
