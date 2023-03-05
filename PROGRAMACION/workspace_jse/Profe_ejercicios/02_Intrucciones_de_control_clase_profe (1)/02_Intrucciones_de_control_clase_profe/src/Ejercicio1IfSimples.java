
public class Ejercicio1IfSimples {

	public static void main(String[] args) {
		/*
		 * variable entera que representa la edad
		 * si es mayor = 18 le informamos que es mayor.
		 * pase lo que pase ponemos fin fde programa
		 */
		int edad = 18;
		
		if (edad >= 18)
			System.out.println("Eres mayor de edad");
		
		System.out.println("FIN DE PROGRAMA");
		
		/*
		 * 2.- tambien si eres menor de edad te informamos
		 */
		
		if (edad >= 18) {
			System.out.println("Eres mayor de edad 2");
			System.out.println("Hola");
		}
		else {
			System.out.println("Eres menor de edad 2");
			System.out.println("Adios");
		}
		System.out.println("FIN DE PROGRAMA DOS");

	}

}
