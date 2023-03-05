
public class Ejercicio3SwitchEnterosString {

	public static void main(String[] args) {
		/*
		 * mes es de 31, de 30 de 28-29 erroneo
		 */
		int mes = 22;
		
		switch(mes) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.println("mes de 31 dias");
				break;
			case 4: case 6: case 9: case 11:
				System.out.println("Mes de 30 dias");
				break;
			case 2:
				System.out.println("Mes de 28-29");
				break;
			default:
				System.out.println("mes incorrecto");
		}
		
		String opcion = "Sumar";
		
		switch(opcion) {
		case "alta": 
			System.out.println("procesando alta");
			System.out.println("de forma precisa");
			break;
		case "sumar":
			System.out.println("Sumando .....");
			break;
			
		default:
			System.out.println("opcion incorrecto");
		
		}
	}

}
