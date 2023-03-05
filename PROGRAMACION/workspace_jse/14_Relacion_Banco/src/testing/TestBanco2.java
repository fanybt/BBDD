package testing;

import modelo.dao.BancoDaoImplList;
import modelo.javabeans.Oficina;

public class TestBanco2 {

	public static void main(String[] args) {
		BancoDaoImplList mibanco = new BancoDaoImplList("mi banco");
		Oficina of2 = new Oficina(9001,"madrid 17" , "madrid", "912545758");
		System.out.println(mibanco.modificarOficina(of2));
		
		System.out.println("buscar todos ");
		for (Oficina ele:mibanco.buscarTodos()) 
			System.out.println(ele);

		System.out.println("una");
		System.out.println(mibanco.buscarUna(9003));
	}

}
