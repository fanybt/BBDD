package daos;

import java.util.List;

import javabeans.Empleado;

public interface EmpleadoDao {

	int altaEmpleado (Empleado empleado);
	Empleado buscarUno (int idEmpl);
	int modificarEmpleado (Empleado empleado);
	int eliminarEmpleado (Empleado empleado);
	List<Empleado> buscarTodos();
	List<Empleado> buscarPorDepartamento(int idDepar);
	List<Empleado> buscarPorSexo(char sexo);
	List<Empleado> buscarPorApellido(String apellido);//subcadena
	double salarioTotal();
	double salarioTotal(int idDepar);//Salario total de un departamento
	
}
