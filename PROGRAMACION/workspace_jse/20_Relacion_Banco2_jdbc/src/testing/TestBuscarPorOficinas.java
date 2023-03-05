package testing;

import modelo.dao.BancoDaoImplList;
import modelo.javabeans.Oficina;

public class TestBuscarPorOficinas {

	public static void main(String[] args) {
		BancoDaoImplList banco= new BancoDaoImplList("Banco");
		String ciudad ="Madrid";
		System.out.println("listar oficinas por ciudad");
		for (Oficina oficina:banco.buscarPorCiudad(ciudad)) {
			System.out.println(oficina);	
		}
		String prefijo ="9125";
		System.out.println("listar oficinas por prefijo");
		for (Oficina oficina:banco.buscarPorPrefijo(prefijo)) {
			System.out.println(oficina);	
		}
		
	}

}
