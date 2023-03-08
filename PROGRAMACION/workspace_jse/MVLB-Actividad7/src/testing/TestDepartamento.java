package testing;

import daos.DepartamentoDao;
import daos.DepartamentoDaoImplMy8;
import javabeans.Departamento;
import javabeans.Perfil;

public class TestDepartamento {

	public static void main(String[] args) {
		
		DepartamentoDao depdao = new DepartamentoDaoImplMy8();
		Departamento departamento = new Departamento(50, "Publicidad", "Valencia");
		
		System.out.println("BUSCAR TODOS");
		for (Departamento ele: depdao.buscarTodos())
			System.out.println(ele);
		
		System.out.println("ALTA IDDEPAR 50");
		System.out.println(depdao.altaDepartamento(departamento));
		
		System.out.println("COMPROBAMOS QUE SE HA CREADO");
		for (Departamento ele: depdao.buscarTodos())
			System.out.println(ele);
		
		System.out.println("BUSCAR UNO, EN ESTE CASO EL 30");
		System.out.println(depdao.buscarUno(30));
		
		System.out.println("MODIFICAR DEPARTAMENTO");
		System.out.println(depdao.buscarUno(50));
		departamento.setNombre("Marketing");
		System.out.println(depdao.modificarDepartamento(departamento));
		
		System.out.println("COMPROBAMOS QUE SE HA MODIFICADO EL NOMBRE");
		System.out.println(depdao.buscarUno(50));

		System.out.println("ELIMINAR UNO");
		System.out.println(depdao.eliminarDepartamento(departamento));
		
		System.out.println("COMPROBAMOS QUE SE HA ELIMINADO");
		for (Departamento ele: depdao.buscarTodos())
			System.out.println(ele);

	}

}
