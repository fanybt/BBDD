import java.util.Scanner;

public class EBT_Actividad_3 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int opcion = 0;
		int numero = 0 ;
		double n1 = 0, n2 = 0 ;
		String operador = " ";
		String palabra = " ";
		
		/*
		 * Utilizo do while para que aparezca el menu desde el principio 
		 * mientras la opcion sea distinta a 4.
		 * Con el switch ejecuta cada metodo dependiendo de la opcion elegida.
		 * 
		 */
		do {
			opcion  = pintarMenu();
			switch (opcion) {
			
			case 1:
				System.out.println("introduce un numero");
				 numero = leer.nextInt();
				 numeroconversor(numero);
				 break;
			case 2:
				System.out.println("introduce un numero decimal ");
				n1 = leer.nextDouble();
				System.out.println("introduce un numero decimal ");
				n2 = leer.nextDouble();
				System.out.println("introduce un operador");
				operador = leer.next();
				operacion(n1,n2,operador);
				break;
			case 3:
				System.out.println("introduce una palabra");
				palabra = leer.next();
				frase(palabra);
				break;
			default:
				break;
				
			}
			
			
		}while (opcion!= 4) ;
		
			
		
		
		
			
			
			
		
			
		
		
	}
	//metodos
	/*
	 * para el método conversor he utilizado la funcion Integer.toBinaryString para pasarlo el numero
	 * recogido a binario.
	 * para el metodo de frase he utilizado la funcion palabra.replaceAll para que me remplace 
	 * en cada caso consonantes o vocales por espacios .Tambien he utilizado .length para saber 
	 * cuanto media la palabra
	 */
	
	public static void numeroconversor (int conversion ) {
		
		System.out.println("el numero "+ conversion + " en binario es : " + Integer.toBinaryString(conversion) );
		
	}
	
	public static void operacion (double n1 ,double n2 ,String operador ) {
		switch (operador) {
		case "+":
			System.out.println(n1 +  " + " + n2 + " = " + (n1 + n2));
			break;
		case "-":
			System.out.println(n1 +  " - " + n2 + " = " + (n1 - n2));
			break;
		case "*":
			System.out.println(n1 +  " * " + n2 + " = " + (n1 * n2));
			break;
		case "/":
			System.out.println(n1 +  " / " + n2 + " = " + (n1 / n2));
			break;
		case "%":
			
			System.out.println(n1 +  " % " + n2 + " = " + (n1 % n2));	
			break;
		default:
			System.out.println("simbolo no valido");
			break;
			
			
		}
		
	}
	
	
	public static void frase (String palabra) {
      String consonantes = palabra.replaceAll("[aeiouAEIOU]", "");
      String vocales = palabra.replaceAll("[^aeiouAEIOU\\s\\W_0-9]", "");
      
		
		System.out.println("palabra     consonantes      vocales     longitud");
		System.out.println("-------------------------------------------------");
		System.out.println(palabra +"     "+ consonantes +"    "+ vocales+"     "+ palabra.length()  );
	}
	
	/*
	 * He creado el metodo pintar menu para invocarlo desde el principio y 
	 * es int para que devuelva la opcion que recibe que es un numero .
	 */
	 public static int pintarMenu() {
		  Scanner leer = new Scanner(System.in);
		  int opcion =0;
			
		 
		  System.out.println("********Menu***********");
		  System.out.println("1.Conversor decimal binario");
		  System.out.println("2. Calculadora");
		  System.out.println("3.Analizador de frase");
		  System.out.println("4.Salir");
		  
		  System.out.println("teclea una opcion del 1 al 3 , 4 Salir");
		  opcion = leer.nextInt();
		  return opcion;
				  
}
	 }
