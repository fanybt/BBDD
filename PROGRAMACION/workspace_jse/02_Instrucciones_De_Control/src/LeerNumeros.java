import java.util.Scanner;

public class LeerNumeros {

	public static void main(String[] args) {
		
		int numero = 0;
		int contadorimpares = 0, contadorpares= 0 ;
		int acumuladorimpares =0 , acumuladorpares= 0;
		
		Scanner leer = new Scanner (System.in);
		System.out.println("introduce un numero ");
		numero = leer.nextInt();
		
		while (numero!=0) {
			if(numero %2 == 0) {
				System.out.println("es un numero par ");
				contadorpares++;
				acumuladorpares += numero;
			}else {
				System.out.println("es un numero impar ");
				contadorimpares++;
				acumuladorimpares += numero;
			}
			System.out.println("introduce un numero ");
			numero = leer.nextInt();
			
		}
		System.out.println(" numeros impares leidos  : " + contadorimpares);
		System.out.println(" numeros pares leidos  : " + contadorpares);
		System.out.println(" suma de numeros impares : " + acumuladorimpares);
		System.out.println(" suma de numeros pares : " + acumuladorpares);
	}

}
