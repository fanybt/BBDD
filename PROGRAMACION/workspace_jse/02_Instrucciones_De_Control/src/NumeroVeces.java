import java.util.Scanner;

public class NumeroVeces {

	public static void main(String[] args) {
		
		int n =0;
		Scanner leer = new Scanner (System.in);
		System.out.println("dime un numero");
		n = leer.nextInt();
		System.out.println(nVeces(n));
		/*leer.close();
		
		/*public static void main(String[] args) {
			Scanner leer = new Scanner(System.in);
			int x = 0;
			System.out.println("Introduce un número.");
			x = leer.nextInt();
			System.out.println(nVeces(x));
			leer.close();*/
		
		
		
	}
    public static String nVeces (int n) {
    	for (int i = 0 ; i< n ; i++) {
    		System.out.println("modulo ejecutandose");
    		
    		}
    	return"";
		
    }
}
