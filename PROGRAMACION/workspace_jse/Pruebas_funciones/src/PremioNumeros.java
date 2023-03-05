import java.util.Scanner;

public class PremioNumeros {

	public static void main(String[] args) {
		/*
		 * compro un cupon y estra premiado si la suma de dos de sus tres numeros es 
		 * superior al tercer numero .
		 * Si los 3 numeros son iguales tendra un premio grande, si tiene solo dos numero iguales 
		 * premio medio y si nunguno es igual premio bajo .
		 */
		
		Scanner leer = new Scanner (System.in);
		int n1,n2,n3;
		System.out.println("Dime 3 numeros");
		n1  =leer.nextInt();
		n2 = leer.nextInt();
		n3 = leer.nextInt();
		
		/*
		 * pregunto si la suma de dos de los numeros es superior a el tercero y 
		 * asi se si tiene premio .
		 */
		
		
		
			        	
		
		if ((n1+n2)>n3 || (n2+n3)>n1 ||(n3+n1)>n2) {
			
			System.out.println("tiene premio");
			/*
			 * pregunto si todos los numeros son iguales si es asi tiene premio grande.
			 */
			
		
				
			 if( (n1==n2) && (n2==n3 )) 
			
			System.out.println("premio grande");
			 
			 else
				 
				 /*
				  * pregunto si todos los numeros son distintos asi tiene un premio bajo 
				  */
			 
			 if ((n1 != n2) && (n2 != n3) && (n3 != n1)) 
				 System.out.println("premio bajo");
			 
			 /*
			  * si no es ninguna de las ateriores tiene dos numeros iguales y uno distinto
			  * y tiene un premio medio .
			  */
			 else {
				 System.out.println("premio medio");
			 }
			
			
		}
		
		
		
		
		
	}
	
	
	

}
