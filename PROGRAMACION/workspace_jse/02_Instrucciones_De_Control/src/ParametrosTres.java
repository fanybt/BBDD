import java.util.Scanner;

public class ParametrosTres {

	public static void main(String[] args) {
		int x = 0 , y=0 , z=0;
		Scanner leer = new Scanner (System.in);
		System.out.println("dime un numero");
		x = leer.nextInt();
		System.out.println("dime un numero");
		y = leer.nextInt();
		System.out.println("dime un numero");
		z = leer.nextInt();
		System.out.println(maximo (x,y,z));
	}

	
	
	
	public static int maximo (int x, int y , int z) {
		int m=0;
		if ( x>y && x > z) {
			m=x;
		}else if (y>x && y >z ){
			m=y;
			
		}else {
			m=z;
			
		}
		return m;	
		
	}
}
