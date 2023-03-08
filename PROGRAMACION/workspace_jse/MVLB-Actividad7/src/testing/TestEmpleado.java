package testing;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import daos.DepartamentoDao;
import daos.DepartamentoDaoImplMy8;
import daos.EmpleadoDao;
import daos.EmpleadoDaoImplMy8;
import daos.PerfilDao;
import daos.PerfilDaoImplMy8;
import javabeans.Departamento;
import javabeans.Empleado;
import javabeans.Perfil;

public class TestEmpleado {

	public static void main(String[] args) throws ParseException {
		EmpleadoDao empdao = new EmpleadoDaoImplMy8();
		PerfilDao perdao = new PerfilDaoImplMy8();
		DepartamentoDao depdao = new DepartamentoDaoImplMy8();
		
		//PRUEBAS DE FECHAS
		/*
		Date fechaSql = new Date(System.currentTimeMillis());
		String fechaN = "1981-01-11";
		String fechaI = "2000-10-11";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date fecha = sdf.parse(fechaN);
		
		//fechaSql = fecha;
		fechaSql.setTime(fecha.getTime());

		System.out.println(fechaSql);
		*/
		/*
		Date fechaSql = new Date(System.currentTimeMillis());
		System.out.println(fechaSql);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		String fechaNacimiento = "1981-01-11";
		java.util.Date fechaN = sdf.parse(fechaNacimiento );
		String fechaIngreso = "2000-10-11";
		java.util.Date fechaI = sdf.parse(fechaIngreso );
		
		fechaSql.setTime(fechaN.getTime());
		fechaSql.setTime(fechaI.getTime());
		*/
		
		Empleado empleado = new Empleado(121, "Antonio", "Montoro", 'h', "ant@edix.es", "123456", 10300, null, null, perdao.buscarUno(4), depdao.buscarUno(10));
		
		System.out.println("BUSCAR TODOS");
		for (Empleado ele: empdao.buscarTodos())
			System.out.println(ele);
		
		System.out.println("ALTA EMPLEADO");
		System.out.println(empdao.altaEmpleado(empleado));
		
		System.out.println("COMPROBAMOS QUE SE HA CREADO EL 121");
		for (Empleado ele: empdao.buscarTodos())
			System.out.println(ele);
		
		System.out.println("MODIFICAR EMPLEADO");
		System.out.println(empdao.buscarUno(121));
		empleado.setApellidos("López");
		System.out.println(empdao.modificarEmpleado(empleado));
		
		System.out.println("BUSCAR UNO");
		System.out.println(empdao.buscarUno(121));
		
		System.out.println("ELIMINAR EMPLEADO");
		System.out.println(empdao.eliminarEmpleado(empleado));
		
		System.out.println("COMPROBAMOS QUE HA ELIMINADO EL 121");
		for (Empleado ele: empdao.buscarTodos())
			System.out.println(ele);
		
		System.out.println("BUSCAR POR DEPARTAMENTO, EL 10");
		for(Empleado ele: empdao.buscarPorDepartamento(10))
			System.out.println(ele);
		
		System.out.println("BUSCAR POR APELLIDOS %IA%");
		for(Empleado ele: empdao.buscarPorApellido("ia"))
			System.out.println(ele);
		
		//NO FUNCIONA BUSCAR POR SEXO
		System.out.println("BUSCAR POR SEXO");
		for(Empleado ele: empdao.buscarPorSexo('M'))
			System.out.println(ele);
		
		System.out.println("SALARIO TOTAL EMPLEADOS");
		System.out.println(empdao.salarioTotal());
		
		System.out.println("SALARIO TOTAL POR DEPARTAMENTO");
		System.out.println(empdao.salarioTotal(10));
		
		System.out.println("");
		System.out.println("MÉTODOS DE LA CLASE EMPLEADO: ");
		System.out.println("OBTENER EMAIL");
		System.out.println(empdao.buscarUno(120).obtenerEmail());
		System.out.println("NOMBRE COMPLETO");
		System.out.println(empdao.buscarUno(120).nombreCompleto());
		System.out.println("LITERAL SEXO");
		System.out.println(empdao.buscarUno(120).literalSexo());
		System.out.println("SALARIO MENSUAL, 12 MESES");
		System.out.println(empdao.buscarUno(120).salarioMensual(12));
		System.out.println("SALARIO BRUTO");
		System.out.println(empdao.buscarUno(120).salarioBruto());
	}

}
