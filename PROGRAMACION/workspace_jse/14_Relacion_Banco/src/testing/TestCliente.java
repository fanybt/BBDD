package testing;

import modelo.dao.ClienteDaoImplList;
import modelo.javabeans.Cliente;

public class TestCliente {

	public static void main(String[] args) {
		ClienteDaoImplList cliedao = new ClienteDaoImplList();
		System.out.println("lista todos");
		for(Cliente ele: cliedao.buscarTodos()) {
			System.out.println(ele);
			
		}
		System.out.println("lista por oficina");
		
		int idOficina=9007;
		
		
		for(Cliente ele: cliedao.buscarClientesOficina(idOficina)) {
			System.out.println(ele);
		}
		
		System.out.println("lista una");
		System.out.println(cliedao.buscarUno("502258H"));
		
		//optimizar consume menos recursos//
		
		Cliente cliente =cliedao.buscarUno("511258X");
		System.out.println(cliente);
		System.out.println("ciudad oficina  : "+ cliente.getOficina().getCiudad());

	}

}
