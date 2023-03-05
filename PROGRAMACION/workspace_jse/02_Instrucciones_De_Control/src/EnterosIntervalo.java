import java.util.Scanner;

public class EnterosIntervalo {

	public static void main(String[] args) {
		int a = 0 , b=0;
		Scanner leer=new Scanner (System.in);
		System.out.println("dime un numero entero ");
		a = leer.nextInt();
		System.out.println("dime otro numero entero");
		b = leer.nextInt();
		System.out.println(intervalo (a,b));
		
		

	}
    public static String intervalo (int a , int b ) {
    	for (int i = a ; i <= b ; i++) {
    		System.out.println(i);
    	}
    	return " ";
    }
}
