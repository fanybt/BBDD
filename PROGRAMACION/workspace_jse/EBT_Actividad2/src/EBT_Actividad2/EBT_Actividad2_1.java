import java.util.Scanner;

public class EBT_Actividad2_1 {

	public static void main(String[] args) {
		
		
		Scanner leer = new Scanner (System.in);
		int ladoa=0, ladob=0, ladoc=0;
		System.out.println("teclea tres numeros enteros");
		System.out.println("ladoa");
		ladoa = leer.nextInt();
		System.out.println("ladob");
		ladob= leer.nextInt();
		System.out.println("ladoc");
		ladoc = leer.nextInt();
		/*
		 * Pregunto si es un triangulo sabiendo que la suma de dos de sus lados tiene que ser mayor que el tercer lado
		 */
		
		if ((ladoa+ladob)>ladoc || (ladoa+ladoc)>ladob ||(ladob+ladoc)>ladoa) {
			
			System.out.println("es un triangulo correcto");
			/*
			 * pregunto si es un triangulo equilatero sabiendo que tiene que tener sus tres lados iguales con un si no para que 
			 * siga con la opcion siguiente
			 */
			
		
				
			 if( (ladoa==ladob) && (ladob==ladoc )) 
			
			System.out.println("es un triangulo equilatero");
			 
			 else
				 
				 /*
				  * pregunto si es un triangulo escaleno todos sus lados son distintos 
				  */
			 
			 if ((ladoa != ladob) && (ladob != ladoc) && (ladoc != ladoa)) 
				 System.out.println("es un triangulo escaleno");
			 
			 /*
			  * y pongo un sino para que sea la ultima opcion 
			  */
			 else {
				 System.out.println("es un triangulo isosceles");
			 }
		}
		
		
	}


}