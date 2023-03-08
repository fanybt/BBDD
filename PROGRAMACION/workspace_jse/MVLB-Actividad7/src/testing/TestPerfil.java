package testing;

import daos.PerfilDao;
import daos.PerfilDaoImplMy8;
import javabeans.Cliente;
import javabeans.Perfil;

public class TestPerfil {

	public static void main(String[] args) {
		PerfilDao perdao = new PerfilDaoImplMy8();
		Perfil perfil = new Perfil(5, "Marketing", 10);
		
		System.out.println("BUSCAR TODOS");
		for (Perfil ele: perdao.buscarTodos())
			System.out.println(ele);
		
		System.out.println("ALTA PERFIL 5");
		System.out.println(perdao.altaPerfil(perfil));
		
		System.out.println("COMPROBAMOS QUE SE HA CREADO");
		for (Perfil ele: perdao.buscarTodos())
			System.out.println(ele);
		
		System.out.println("BUSCAR UNO, EN ESTE CASO EL IDPERFIL 2");
		System.out.println(perdao.buscarUno(2));
		
		System.out.println("MODIFICAR PERFIL");
		System.out.println(perdao.buscarUno(5));
		perfil.setPrecioHora(11);
		System.out.println(perdao.modificarPerfil(perfil));
		
		System.out.println("COMPROBAMOS QUE SE HA MODIFICADO, EN ESTE CASO EL PRECIOHORA");
		System.out.println(perdao.buscarUno(5));

		System.out.println("ELIMINAR UNO");
		System.out.println(perdao.eliminarPerfil(perfil));
		
		System.out.println("COMPROBAMOS QUE SE HA ELIMINADO");
		for (Perfil ele: perdao.buscarTodos())
			System.out.println(ele);
		
		
	}

}
