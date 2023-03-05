import java.util.Scanner;

public class Parametros {

	public static void main(String[] args) {
		int x =0 , y=0;
		Scanner leer = new Scanner (System.in);
		System.out.println("dime un numero");
		x = leer.nextInt();
		System.out.println("dime un numero");
		y = leer.nextInt();
		System.out.println(maximo (x,y));
		
	}

	
	public static int maximo(int x  ,int y) {
		int z = 0;
		if ( x>y) {
			z = x;
		}else {
			z = y;
		}
		return z;
		
	}
	
	
}
