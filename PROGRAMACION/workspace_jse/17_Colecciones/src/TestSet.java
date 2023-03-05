import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
		Set<String>lista1 ,lista2,lista3;
		lista1=new HashSet<>();
        lista1.add("tomas");
        lista1.add("sara");
        lista1.add("carmen");
        lista1.add("eva");
        lista1.add("tomas");
        // con el set no saca el repetido y los saca en el orden que quiere//
        
        for(String nombre: lista1) {
        	System.out.println(nombre);
	}

	}
}
