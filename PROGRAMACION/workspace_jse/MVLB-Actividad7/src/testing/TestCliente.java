package testing;

import daos.ClienteDao;
import daos.ClienteDaoImplMy8;
import javabeans.Cliente;

public class TestCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClienteDao cdao = new ClienteDaoImplMy8();
		Cliente cliente = new Cliente("C4444444", "Luis", "Morales", "Ciudad Real", 1437, 20);
		
		System.out.println("BUSCAR TODOS");
		for (Cliente ele: cdao.buscarTodos())
			System.out.println(ele);
		
		System.out.println("ALTA CLIENTE C4444444");
		System.out.println(cdao.altaCliente(cliente));
		
		System.out.println("COMPROBAMOS QUE SE HA CREADO");
		for (Cliente ele: cdao.buscarTodos())
			System.out.println(ele);
		
		System.out.println("BUSCAR UNO, EN ESTE CASO EL A22222222");
		System.out.println(cdao.buscarUno("A22222222"));
		
		System.out.println("MODIFICAR CLIENTE");
		Cliente cliente2 = cdao.buscarUno("A22222222");
		cliente2.setDomicilio("Cuenca");
		System.out.println(cdao.modificarCliente(cliente2));
		
		System.out.println("COMPROBAMOS QUE SE HA MODIFICADO, EL DOMICILIO");
		System.out.println(cdao.buscarUno("A22222222"));
		
		System.out.println("ELIMINAR UNO");
		System.out.println(cdao.eliminarCliente(cliente));
		
		System.out.println("COMPROBAMOS QUE SE HA ELIMINADO");
		for (Cliente ele: cdao.buscarTodos())
			System.out.println(ele);
		
		
		

	}

}
