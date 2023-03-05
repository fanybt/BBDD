import java.util.Scanner;

public class FuncionCoeficientePequeñosMayores {

	public static void main(String[] args) {
		
		String letra = " ";
		int coeficiente = 0;
		String nombre = " ";
		int contador = 0;
		int sumacoeficientes= 0;
		
		
		do {
			Scanner leer = new Scanner (System.in);
			
			System.out.println("introduce nombre");
			nombre = leer.nextLine();
			System.out.println("introduce m si eres mayor y p si eres pequeño");
			letra = leer.nextLine();
			System.out.println("introduce tu coeficiente");
			coeficiente = leer.nextInt();
			
			edad(letra);
			coeficiente(coeficiente);
			contador++;
			sumacoeficientes += coeficiente ;
			
			
		}while (coeficiente!=0);
		
	}












 public static void edad (String letra) {
	 if (letra.equals("M" )|| letra.equals("m")) {
		 System.out.println("eres mayor");
	 }
	 else if (letra.equals("P")|| letra.equals("p")) {
		  System.out.println("eres pequeño");
	 }
	 
	 
 }
 public static void coeficiente (int numero) {
	 if (numero <= 50) {
		 System.out.println("coeficiente insuficiente");
	 }
	 else if (numero >=50) {
		 System.out.println("coeficiente satisfactorio");
	 }
 }
 
 }