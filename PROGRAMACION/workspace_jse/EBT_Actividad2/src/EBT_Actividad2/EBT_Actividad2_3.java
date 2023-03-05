import java.util.Locale;
import java.util.Scanner;

public class EBT_Actividad2_3 {

	public static void main(String[] args) {
		/*
		 * /*
        Dos funciones y un algoritmo:
            A. Función sexo, devuelve Hombre o Mujer si se introduce H o M, si no Sexo Erróneo
            B. Función salario, devuelve:
                - < 25000: Salario bajo
                - 25000 - 40000: Salario Medio
                - > 45000: Salario Alto
            C. Do while que recibe un String nombre, si se introduce FIN termina.
                Desde el do while llamar a los métodos y mostrar el nombre y los resultados de los métodos
                Contar los nombres, la suma y la media de los salarios.
         */

		 
		
		String nombre = " ";
		String letra = " ";
		int salario = 0;
		int contador = 0;
		int sumasalarios = 0;
		double media = 0;
		
		/*
		 * Utilizo un do while por que tiene que preguntar el nombre como primer paso se cumpla
		 * o no la condicion .
		 * Si el nombre es distinto a fin entonces ejecuta el bucle .
		 */
		
		do {
			Scanner leer = new Scanner (System.in);
			System.out.println("introduce un nombre : ( fin para terminar)");
			nombre = leer.nextLine();
			if ( !nombre.equalsIgnoreCase("fin")) {
				System.out.println("introduce tu sexo");
				letra = leer.nextLine();
				
				System.out.println("dime tu salario");
				salario = leer.nextInt();
				
				System.out.println("nombre : " + nombre);
				sexo(letra);
				salario(salario);
				contador++;
				sumasalarios+=salario;
				
				
			}else {
				System.out.println("fin de programa");
			}
			
			
		}while(!nombre.equalsIgnoreCase("fin"));
		
		/*
		 * doy la media , las personas y suma de salarios cuando ya se ha pulsado fin.
		 * y la media la calcula cuando ya se ha pulsado fin .
		 */
		media = sumasalarios / contador;
		
		System.out.println(" personas totales : " + contador);
		System.out.println(" salarios suma : " + sumasalarios);
		System.out.println(" media salarios : " + media);
	   
				
			}
			
	    	
	    	
	    
		
		
		/*
		 * creo los dos metodos con un si no para sexo y salario
		 */
		
		
	
    public static void sexo (String letra) {
    	if (letra.equals("H") || letra.equals("h")){
    		System.out.println("Hombre");
    		
    	}
    	else if (letra.equals("M") || letra.equals("m") ) {
    		System.out.println("Mujer");
    	}
    	else	{
    		System.out.println("sexo erroneo");
    	}
    	}

    public static void salario (int numero) {
    	if ( numero < 25000) {
    		System.out.println("salario bajo");
        	
    	}
    	else if (numero >= 25000 && numero <= 40000)
    	{
    		
    		System.out.println("salario medio");
    	}
    	else if ( numero > 45000) {
    		System.out.println("salario alto ");
    	}
    }
    }


