package daos;

import java.util.List;

import javabeans.Departamento;

public interface DepartamentoDao {

	int altaDepartamento (Departamento departamento);
	Departamento buscarUno (int idDepar);
	int modificarDepartamento (Departamento departamento);
	int eliminarDepartamento (Departamento departamento);
	List<Departamento> buscarTodos();
	
}
