import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		/*si hago una variable de tipo list de java util lo implemento como quiero*/
		List<String>lista1 ,lista2,lista3;
		/*lista 1,2y3 son variables de tipo clase y entonces puedo hacer un new arrayList 
		 * de cualquiera de ellas */
		 
				lista1=new ArrayList<>();
        lista1.add("tomas");
        lista1.add("sara");
        lista1.add("carmen");
        lista1.add("eva");
        lista1.add("tomas");
        
        for(String nombre: lista1) {
        	System.out.println(nombre);
        }
        /* como he creado lista1,2y3 lo bueno de que es un List es que puedo hacer un 
         * linkedList*/
         
        lista2=new LinkedList<>();
        lista2=lista1;
        //puedo igualar dos variables //
        for(String ele : lista2) {
        	System.out.println(ele);
        	
        }
        		
	}

}
