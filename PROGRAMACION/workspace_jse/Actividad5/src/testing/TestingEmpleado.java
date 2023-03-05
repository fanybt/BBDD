package testing;

import modelo.javabeans.Departamento;
import modelo.javabeans.Empleado;
import modelo.javabeans.Localidad;
import modelo.javabeans.Trabajo;

public class TestingEmpleado {

	public static void main(String[] args) {
		
		/*
		 * Creamos un objeto Localización, otro de departamento con esa Localización,
		 * un Trabajo, y un Empleado con su departamento y su Trabajo.
		 */
		Localidad localidad1 = new Localidad(1, " av.costa blanca", "alicante", "españa");
		Departamento departamento1 = new Departamento(14, "contabilidad", localidad1);
		Trabajo trabajo1 = new Trabajo("er45", "secretario", 1000, 1250);
		Empleado empleado1 = new Empleado(1, "Andres", "Lopez Arnedo", "andlo@gmail.es", 1100,100, 'h', new Trabajo("er42", "administrativo", 900, 1000), departamento1);
		
		//La información completa de un empleado SIN usar toString
		
		System.out.println(  empleado1.nombreCompleto()+ " " + empleado1.literalSexo()+ " " + empleado1.getDepartamento().getDescripcion() + " " + empleado1.getTrabajo().getDescripcion() + " " + empleado1.getDepartamento().getLocalidad().getDireccion() + " " + empleado1.getDepartamento().getLocalidad().getCiudad() + " " + empleado1.getDepartamento().getLocalidad().getPais());

		//Extraer del empleado su trabajo y su departamento en variables de su tipo. Y pintarlas con syso.
		System.out.println("Nombre y apellidos : " + empleado1.nombreCompleto() + ". Trabaja de " + empleado1.getTrabajo().getIdTrabajo() + " en : " + empleado1.getDepartamento().getDescripcion() + " situado en " + empleado1.getDepartamento().getLocalidad().getCiudad());
				
	}
}

