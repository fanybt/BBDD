package daos;

import java.util.List;
import javabeans.Proyecto;
import javabeans.EmpleadoEnProyecto;

public interface EmpleadoEnProyectoDao {
    // métodos propios
    List<EmpleadoEnProyecto> empleadosByProyecto(String codigoProyecto);
    int asignarEmpleadosAProyecto(List<EmpleadoEnProyecto> empleados);
    int horasAsignadasAProyecto(List<EmpleadoEnProyecto> empleados);
    double costeActualDeProyecto(String codigoProyecto);
    double margenActualProyecto(String codigoProyecto);

 

}
