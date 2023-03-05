package testing;

import modelo.dao.BancoDaoImplList;
import modelo.javabeans.Oficina;

public class TestBanco {

	public static void main(String[] args) {
		
		BancoDaoImplList mibanco = new BancoDaoImplList("mi banco");
		System.out.println("buscar todos ");
		for (Oficina ele:mibanco.buscarTodos()) {
			System.out.println(ele);
		}
		System.out.println("alta oficina ");
		Oficina of1 = new Oficina(9005, "madrid 3", "madrid"," 915248755");
		Oficina of2 = new Oficina(9001,"madrid 1" , "madrid", "912545758");
		
		System.out.println(mibanco.altaOficina(of1));
		System.out.println(mibanco.altaOficina(of2));
		
		System.out.println("buscar todos ");
		for (Oficina ele:mibanco.buscarTodos()) 
			System.out.println(ele);
		
		System.out.println("baja oficina");
		System.out.println(mibanco.eliminarOficina(of1));
		System.out.println("buscar todos ");
		for (Oficina ele:mibanco.buscarTodos()) 
			System.out.println(ele);
		
		System.out.println(mibanco.eliminarOficina(0));
		System.out.println("buscar todos ");
		for (Oficina ele:mibanco.buscarTodos()) 
			System.out.println(ele);
		

	}}
	
