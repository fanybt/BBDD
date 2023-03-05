import java.util.HashMap;
import java.util.Map;

public class TestMapas {

	public static void main(String[] args) {
		Map<Integer, String> nombresIndexados;
		nombresIndexados=new HashMap<>();
		nombresIndexados.put(1, "tomas");
		nombresIndexados.put(2, "esteban");
		nombresIndexados.put(3, "andrea");
		nombresIndexados.put(3, "carmen");
		//1,2,3 son las llaves y los nombres los values //
		
		for(String ele :nombresIndexados.values())
		System.out.println(ele);
		// como la clave no se repite machaca andrea con carmen//
	}

}
