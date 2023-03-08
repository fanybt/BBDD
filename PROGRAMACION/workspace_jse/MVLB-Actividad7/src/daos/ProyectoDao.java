package daos;

import java.util.List;

import javabeans.Proyecto;

public interface ProyectoDao {
	
	int altaProyecto (Proyecto proyecto);
	Proyecto buscarUno (String idProyecto);
	int modificarProyecto (Proyecto proyecto);
	int eliminarProyecto (Proyecto proyecto);
	List<Proyecto> buscarTodos();
	List<Proyecto> buscarPorEstado(String estado);
	List<Proyecto> buscarPorCliente(String cif);
	List<Proyecto> buscarPorJefeProyectoYDepartamento(int jefeProyecto, String estado);
	double importesVentaProyectosTerminados();
	double margenBrutoProyectosTerminados();
	//Diferencia suma Importes venta y gastos reales
	int diasATerminoProyectoActivo(String codigoProyecto);
	//Cuantos días quedan para terminar el proyecto (diferencia entre fecha_fin_previsto y la fecha de hoy
	

}
