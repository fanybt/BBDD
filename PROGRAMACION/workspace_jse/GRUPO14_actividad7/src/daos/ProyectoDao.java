package daos;

import java.util.List;

import javabeans.Proyecto;

public interface ProyectoDao {
    // métodos propios
    List<Proyecto> buscarTodos();

    Proyecto buscarUna(String id_proyecto);

    int altaProyecto(Proyecto proyecto);

    boolean eliminarProyecto(int id);

    List<Proyecto> proyectosByEstado(String estado);

    List<Proyecto> proyectosByCliente(String cif);

    List<Proyecto> proyectosByJefeProyectoAndByEstado(int jefeProyecto, String estado);

    double importesVentaProyectosTerminados();

    double margenBrutoProyectosTerminados();

    int diasATerminoProyectoActivo(String codigoProyecto);

}
