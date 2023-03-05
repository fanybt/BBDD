import java.util.Scanner;

public class Ejercicio01MenuonOpcionesEnteros {
/*
 * primero crear un metodo que devuelve un entero que es la opcion que se ha leido 
 * para pintar el menu 
 * segundo para leer la opcion poner la variable Scanner,definirla y definir la opcion
 * Pedir que se elija la opcion y leerla 
 * tercero meter bucle dentro del metodo de pintar menu para que ejecute las opciones y vuelva a mostrar el menu
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		int opcion = 0 ;int num1 = 0 ; int num2 = 0;
		opcion = pintarMenu();
		
		while (opcion!= 5) {
		
		System.out.println("teclea dos numeros ");
		num1 = leer.nextInt();
		num2 = leer.nextInt();
		
	
		switch(opcion) {
		case 1:
			sumar(num1 , num2);
			break;
			
		case 2:
			restar(num1,num2);
			break;
		case 3 :
			multiplicar(num1,num2);
			break;
		case 4:
			dividir(num1,num2);
			break;
		default:
			System.out.println("opcion incorrecta");
			
			
			
		}
		opcion = pintarMenu();
		}
		
		System.out.println("fin de programa ");
		
		}
	 public static void sumar(int op1,int op2) {
		  int resultado = 0;
		  resultado = op1 + op2;
		  System.out.println("la suma es  : " + resultado);
		  }
		  
		  public static void restar(int op1,int op2) {
			  
			  System.out.println("la resta es  : " + (op1 - op2));
			  }
		  public static void multiplicar(int op1,int op2) {
			  
			  System.out.println("la multiplicacion es  : " + (op1 * op2));
			  }
		  public static void dividir(int op1,int op2) {
			   if (op2==0)
				  System.out.println("division imposible ");
			   else
			  
			  
			   System.out.println("la division  es  : " + (op1 / op2));
		  }
			  
		 
  public static int pintarMenu() {
	  Scanner leer = new Scanner(System.in);
	  int opcion =0;
		
	 
	  
	  System.out.println("1.- Sumar");
	  System.out.println("2.- Restar");
	  System.out.println("3.- Multilicar");
	  System.out.println("4.- Dividir");
	  System.out.println("5.- Salir");
	  System.out.println("teclea una opcion del 1 al 4 , 5 Salir");
	  opcion = leer.nextInt();
			  

       while(opcion < 1 || opcion > 5 )	{
    	   System.out.println("opcion incorrecta ");
    	   opcion = leer.nextInt();
    	   
    	   
       }
       return opcion;
  }
}
