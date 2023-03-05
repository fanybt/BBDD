import java.util.Scanner;

public class SalariosSexo {

	public static void main(String[] args) {
		/*
		 * Me introducen el nombre de una persona y tengo que pedirle el sexo y su salario .
		 * si el salario <25000 decir que es un salario bajo , si esta entre 25000 y 40000 
		 * decir que es un salario medio y si esta por encima de 40000 decir que es un salario
		 * alto .
		 * Al final decir cuantos nombre me has introducido , la media de los salarios y su 
		 * suma .
		 * Si me dicen fin no pido mas nombres .
		 */

		String nombre = " ";
		String letrasexo = " ";
		int salario = 0;
		
		int contador = 0;
		double media = 0;
		int sumasalarios= 0;
		 
		 
		
		 
		do {
			
			 Scanner leer = new Scanner(System.in);
			 System.out.println("introduce tu nombre");
			 nombre = leer.next();
		if (!nombre.equalsIgnoreCase("fin")) {
			System.out.println("dime tu sexo ");
			letrasexo=leer.next();
		    System.out.println(" dime tu salario");
		    salario = leer.nextInt();
		    
		    System.out.println("tu nombre es  : " + nombre);
		    sexo(letrasexo);
		    salariopersona(salario);
		    contador++;
		    sumasalarios+=salario;
		    
			
			
			
		}
		
		else {
			System.out.println("fin programa ");
		}
			
		}while (!nombre.equalsIgnoreCase("fin"));
		
	
		media = sumasalarios / contador;
		System.out.println(" total de personas  : " + contador);
		System.out.println("la suma de los salarios : " +sumasalarios);
		System.out.println("la media de los salarios : " + media);
		
	}
		
		
	

	public static void sexo (String letrasexo) {
		
		if ( letrasexo.equals("H")|| letrasexo.equals("h")){
			System.out.println("eres un hombre ");
			
		}
		else if (letrasexo.equals("M") || letrasexo.equals("m")) {
			System.out.println("eres una mujer ");
		}
		else {
			System.out.println("sexo erroneo ");
		}
	}
	
	public static void salariopersona (int salario) {
		if (salario < 25_000) {
		System.out.println("salario bajo");
		}
		
	else if ((salario > 25000 )&& (salario < 40_000)) {
		System.out.println("salario medio");
	}
	else if (salario > 40_000) {
		System.out.println("salario alto");
	}
	}
	
	
	
	
}
