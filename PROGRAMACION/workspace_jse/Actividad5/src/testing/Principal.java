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
		
		//damos de alta un empleado nuevo y metemos uno que ya esta y comprobamos que el nuevo "118 se ha metido en la lista // 
		System.out.println("alta empleado");
		Empleado empleado = new Empleado(118, "Adolfo", "Martin Checa", "ad@gmail.com", 10000, 2, 'h',miempresa.buscarTrabajo("21b"),miempresa.buscarDepartamento(3));
		Empleado empleado1 = new Empleado(111, "Ana", "Morales Nieves","anam@gmail.com", 10000, 5, 'm', miempresa.buscarTrabajo("21b"), miempresa.buscarDepartamento(4));
		miempresa.altaEmpleado(empleado);
		miempresa.altaEmpleado(empleado1);
		System.out.println("buscamos todos los empleados");
		for (Empleado ele:miempresa.buscarTodos()) {
			System.out.println(ele);
		}
       
		// buscamos un empleado//
		System.out.println("buscar empleado 111 : "+ miempresa.buscarUna(111));
		
		//buscamos todos los empleados //
		System.out.println("buscamos todos los empleados");
		for (Empleado ele:miempresa.buscarTodos()) {
			System.out.println(ele);
		}
			
		
		// pedimos que nos calcule el salario bruto//
		System.out.println("salario bruto empleado1 : " + empleado1.salarioBruto());
		System.out.println("salario bruto empleado 114 : "+ miempresa.buscarUna(114).salarioBruto());
		
		
		
		//buscamos empleado por departamento//
		System.out.println("buscar empleado por departamento");
		
		 int idDepartamento =3;
		 
		 for (Empleado ele : miempresa.buscarPorDepartamento(idDepartamento)) {
			 System.out.println(ele);
		 }
		
		 // buscamos empleado por trabajo//
		 
		 System.out.println("buscamos por trabajo");

		 String idTrabajo= "22c";
		 
		 for (Empleado ele:miempresa.buscarPorTrabajo(idTrabajo)) {
			 System.out.println(ele);
			 
			 
		 }
		 
		 
		 //buscamos empleado  por pais //
		 
		 
		 System.out.println("buscamos por pais");

		 String pais= "España";
		 
		 for (Empleado ele:miempresa.buscarPorPais(pais)) {
			 System.out.println(ele);
			 
			  }
		 
		 // modificar un empleado y comprobamos los cambios//
		 System.out.println("modificamos empleado 114 cambiando el nombre");
		 Empleado empleado2 = new Empleado(114, "Miriam", "Ballesteros Nieves","mb@gmail.com", 10000, 1, 'm', miempresa.buscarTrabajo("20a"),miempresa.buscarDepartamento(5));
		 miempresa.modificarEmpleado(empleado2);
		 
		 System.out.println("buscamos todos los empleados");
			for (Empleado ele:miempresa.buscarTodos()) {
				System.out.println(ele);
			}
			
			
			// buscamos empleado por sexo//
			 System.out.println("buscamos por sexo");

			 String sexo= "hombre";
			 
			 for (Empleado ele:miempresa.buscarPorSexo(sexo)) {
				 System.out.println(ele);
				 
				  }
		 
			 // eliminamos un empleado//
			 
			 System.out.println("eliminamos el empleado 111 : "+ miempresa.eliminarUno(empleado1));
			 System.out.println("buscamos todos los empleados");
				for (Empleado ele:miempresa.buscarTodos()) {
					System.out.println(ele);
				}
		 
		 

}
}

