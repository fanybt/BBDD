import java.util.Scanner;

public class CifrasNumero {

	public static void main(String[] args) {
		int n = 0;
		Scanner leer = new Scanner (System.in);
		System.out.println("dime un numero");
		n = leer.nextInt();
		String numero = String.valueOf(n);
		int cifras= numero.length ();
		System.out.println("el numero : " + n + "tiene estas cifras : " + cifras);
		
		
	}

}
