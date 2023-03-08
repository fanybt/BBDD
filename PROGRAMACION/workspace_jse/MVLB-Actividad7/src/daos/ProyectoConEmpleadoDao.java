package daos;

import java.util.List;

import javabeans.ProyectoConEmpleado;

public interface ProyectoConEmpleadoDao {
	
	int altaProyectoConEmpleado (ProyectoConEmpleado proyectoConEmpl);
	ProyectoConEmpleado buscarUno (int numeroOrden);
	int modificarProyectoConEmpleado (ProyectoConEmpleado proyectoConEmpl);
	int eliminarProyectoConEmpleado (ProyectoConEmpleado proyectoConEmpl);
	List<ProyectoConEmpleado> buscarTodos();
	List<ProyectoConEmpleado> buscarEmpleadosPorProyecto(String idProyecto);
	//empleadosByProyecto(String codigoProyecto): List<EmpleadosEnProyecto>
	int asignarEmpleadosAProyecto(List<ProyectoConEmpleado> empleados);
	//asignarEmpleadosAProyecto(List<EmpleadosEnProyecto> empleados): int
	//Montar for de los empleados de la lista, inserte dentro de un for
	// Viene un objeto, prepared statment y devolver un entero con todos los que se han insertado
	int horasAsignadasAProyecto(String codigoProyecto);
	//horasAsignadasAProyecto(String codigoProyecto): int. Suma de las horas de los empleados asignados al proyecto.
	double costeActualDeProyecto(String codigoProyecto);
	//costeActualDeProyecto(String codigoProyecto): double. horas*coste-hora de cada empleado asignado al proyecto.
	//COSTE DE HORA ESTA EN PERFIL Y ESTE EN EMPLEADO. EMPLEADO.GETPERFIL.GETPRECIOHORA;
	//Hacer join en el sql
	//select sum(p.precio_hora*pce.horas_asignadas) from empleados e join perfiles p on e.id_perfil = p.id_perfil join proyecto_con_empleados pce on e.id_empl = pce.id_empl;
	//haces una listas de empleados by proyecto y con un foreach usas un acumulador usando el metodo costeahorasasignadas
	double margenActualProyecto(String codigoProyecto);
	//margenActualProyecto(String codigoProyecto): double. Importe_venta del proyecto – costeActual del Proyecto
	

}
