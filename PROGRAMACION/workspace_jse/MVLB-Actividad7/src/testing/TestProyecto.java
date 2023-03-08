package testing;

import daos.ClienteDao;
import daos.ClienteDaoImplMy8;
import daos.EmpleadoDao;
import daos.EmpleadoDaoImplMy8;
import daos.ProyectoDao;
import daos.ProyectoDaoImplMy8;
import javabeans.Empleado;
import javabeans.Proyecto;

public class TestProyecto {

	public static void main(String[] args) {
		ProyectoDao prodao = new ProyectoDaoImplMy8();
		Proyecto proyecto = new Proyecto();
		EmpleadoDao empdao = new EmpleadoDaoImplMy8();
		ClienteDao clidao = new ClienteDaoImplMy8();
		
		Proyecto proyecto1 = new Proyecto("FOR2021003", "Formación de emplebilidad", null, null, null, 40000, 24000, 30900, "ACTIVO", empdao.buscarUno(114), clidao.buscarUno("A22222222"));
		
		System.out.println("BUSCAR UNO");
		System.out.println(prodao.buscarUno("FOR2021002"));
		
		//PROBAR
		System.out.println("DAR DE ALTA UN PROYECTO");
		System.out.println("MODIFICAR UNO");
		
		
		System.out.println("DIAS A TERMINO PROYECTO ACTIVO");
		System.out.println(prodao.diasATerminoProyectoActivo("FOR2021002"));
		
		
		System.out.println("BUSCAR TODOS");
		for (Proyecto ele: prodao.buscarTodos())
			System.out.println(ele);

		
		System.out.println("BUSCAR POR ESTADO PROYECTO %IA%");
		for(Proyecto ele: prodao.buscarPorEstado("mina"))
			System.out.println(ele);
		
		System.out.println("BUSCAR POR cif cliente, EL A22222222");
		for(Proyecto ele: prodao.buscarPorCliente("A22222222"))
			System.out.println(ele);
	}

}
