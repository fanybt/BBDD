import java.util.Scanner;

public class NumerosParesImparesDo {

	public static void main(String[] args) {
		int numero =0, contadorpares = 0, contadorimpares = 0;
		int sumapares =0 , sumaimpares =0;
		
		do{
			Scanner leer = new Scanner (System.in);
			System.out.println("dime un numero o 0 para terminar ");
			numero = leer.nextInt();
			
			if (numero%2==0) {
				System.out.println("numero par ");
				contadorpares++;
				sumapares+=numero;
			}else {
				System.out.println("numero impar ");
				contadorimpares++;
				sumaimpares+=numero;
			}
			
				
			}while(numero!=0);
		
		System.out.println("total numero pares  :" + contadorpares);
		System.out.println("total numero impares  :" + contadorimpares);
		System.out.println("suma numero pares  :" + sumapares);
		System.out.println("suma numero impares  :" + sumaimpares);
		}
	}


