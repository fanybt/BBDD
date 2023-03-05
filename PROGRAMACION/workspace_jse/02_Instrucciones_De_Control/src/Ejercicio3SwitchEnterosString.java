import java.util.Scanner;

public class Ejercicio3SwitchEnterosString {

	public static void main(String[] args) {
		/*
		 * me llega un mes y decimos si es un mes de 31 dias, 30 , 28-29 o erroneo
		 */
		int mes = 2;
		
		Scanner leer = new Scanner (System.in);
		System.out.println("introdice le mes ");
		mes = leer.nextInt();
		switch (mes) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("mes de 31 dias ");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("mes de 30 dias");
			break;
		case 2:
			System.out.println("mes de 28-29 dias ");
			break;
			default:
				System.out.println("mes erroneo" );
				
				
		
		}
		
		String opcion= "sumar";
		
		switch (opcion) {
		case "alta": 
			System.out.println("procesando alta ");
			System.out.println("de manera precisa");
			break;
		case "sumar":
			System.out.println("sumando");
			break;
		
			default:
				System.out.println("mes erroneo" );
				
				
		
		}
			
	}

}

