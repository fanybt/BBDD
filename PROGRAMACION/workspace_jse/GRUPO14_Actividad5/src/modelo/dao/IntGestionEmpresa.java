package modelo.dao;

import java.util.ArrayList;

import modelo.javabeans.Empleado;

	public interface IntGestionEmpresa {
		boolean altaEmpleado (Empleado empleado);
		boolean eliminarUno(Empleado empleado);
		boolean modificarUno (Empleado empleado);
		ArrayList <Empleado>buscarPorSexo(String literalSexo);
		Empleado buscarUna (int idEmpleado);
		ArrayList<Empleado>buscarTodos();
		double masaSalarial();
		ArrayList<Empleado>buscarPorDepartamento(int idDepartamento);
		ArrayList<Empleado>buscarPorTrabajo(String idTrabajo);
		ArrayList<Empleado>buscarPorPais(String pais );
	

	}
