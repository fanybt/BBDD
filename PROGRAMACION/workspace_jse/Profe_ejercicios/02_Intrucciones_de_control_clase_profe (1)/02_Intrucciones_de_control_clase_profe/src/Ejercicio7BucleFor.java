
public class Ejercicio7BucleFor {

	public static void main(String[] args) {
		int acumulador = 0, numero = 1;
		
		for (int i = 10; i>= 1; i -= 2) {
			System.out.println(i);
			acumulador += i;
		}
		
		System.out.println("suma de numero : " + acumulador);

	}

}
