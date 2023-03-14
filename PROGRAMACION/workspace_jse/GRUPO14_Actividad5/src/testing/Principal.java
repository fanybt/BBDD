package testing;

import java.util.ArrayList;

import modelo.dao.EmpresaDaoImplList;
import modelo.javabeans.Departamento;
import modelo.javabeans.Empleado;
import modelo.javabeans.Localidad;
import modelo.javabeans.Trabajo;

public class Principal {

	public static void main(String[] args) {
		EmpresaDaoImplList miempresa = new EmpresaDaoImplList("miempresa");
		
		//buscamos todos los empleados
		System.out.println("BUSCAMOS TODOS LOS EMPLEADOS");
		for (Empleado ele:miempresa.buscarTodos())
			System.out.println(ele);
		
		//damos de alta un empleado nuevo y metemos uno que ya esta y comprobamos que el nuevo "118 se ha metido en la lista 
		System.out.println("ALTA EMPLEADO");
		Empleado empleado = new Empleado(118, "Adolfo", "Martin Checa", "ad@gmail.com", 10000, 2, 'h', miempresa.buscarTrabajo("21b"),miempresa.buscarDepartamento(3));
		Empleado empleado1 = new Empleado(111, "Ana", "Morales Nieves","anam@gmail.com", 10000, 5, 'm', miempresa.buscarTrabajo("21b"), miempresa.buscarDepartamento(4));
		System.out.println(miempresa.altaEmpleado(empleado));//este será true y lo añade
		System.out.println(miempresa.altaEmpleado(empleado1));//este será false y no lo añade
		System.out.println("Comprobamos que ha añadido el 118: ");
		for (Empleado ele:miempresa.buscarTodos())
			System.out.println(ele);
       
		//buscamos un empleado
		System.out.println("BUSCAR UN EMPLEADO, 111 : "+ miempresa.buscarUna(111));
		
		//masa salarial. Suma de salarios brutos de todos los empleados
		System.out.println("MASA SALARIAL: " + miempresa.masaSalarial());
		
		//buscamos empleado por departamento
		System.out.println("BUSCAR POR DEPARTAMENTO. El 3 en este caso: ");
			int idDepartamento =3;
			for (Empleado ele : miempresa.buscarPorDepartamento(idDepartamento))
			 System.out.println(ele);
		
		// buscamos empleado por trabajo
		System.out.println("BUSCAR POR TRABAJO. El 22c en este caso: ");
		String idTrabajo= "22c";
		for (Empleado ele:miempresa.buscarPorTrabajo(idTrabajo)) {
			System.out.println(ele); 
		}
		 
		//buscamos empleado  por pais
		System.out.println("BUSCAR POR PAÍS. España en este caso: ");
		String pais= "España";
		for (Empleado ele:miempresa.buscarPorPais(pais)) {
			System.out.println(ele);
		}
		 
		//modificar un empleado y comprobamos los cambios
		System.out.println("MODIFICAMOS EMPLEADO. El nombre y el email del 114 en este caso: ");
		Empleado empleado2 = new Empleado(114, "Antonia", "Martin Ayala","anb@gmail.com", 9000, 1, 'm', miempresa.buscarTrabajo("23d"),miempresa.buscarDepartamento(4));
		miempresa.modificarUno(empleado2);
		 
		System.out.println("Comprobamos buscando todos los empleados");
		for (Empleado ele:miempresa.buscarTodos()) {
			System.out.println(ele);
		}
			
		//buscamos empleado por sexo
		System.out.println("BUSCAMOS POR SEXO. Hombre");
		String sexo= "hombre";	 
		for (Empleado ele:miempresa.buscarPorSexo(sexo)) {
			System.out.println(ele);
		}
		 
		//eliminamos un empleado
		System.out.println("ELIMINAMOS UN EMPLEADO. El 111 en este caso: "+ miempresa.eliminarUno(empleado1));
		System.out.println("Comprobamos buscando todos los empleados");
		for (Empleado ele:miempresa.buscarTodos())
			System.out.println(ele);
		 
	}
}

