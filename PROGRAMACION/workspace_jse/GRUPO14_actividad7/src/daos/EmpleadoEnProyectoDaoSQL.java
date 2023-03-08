package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javabeans.EmpleadoEnProyecto;

public class EmpleadoEnProyectoDaoSQL extends Abstract implements EmpleadoEnProyectoDao{ // implementa los métodos del interface

    

    @Override
    public List<EmpleadoEnProyecto> empleadosByProyecto(String codigoProyecto) { // método para devolver una lista de empleados en un proyecto
        List<EmpleadoEnProyecto> lista = new ArrayList<EmpleadoEnProyecto>();
        sql = "Select * from proyecto_con_empleados where id_proyecto = ?" ;// consulta select con where que filtra por el id proyecto que le decimos por parámetros
        EmpleadoEnProyecto empleadosEnProyecto = new EmpleadoEnProyecto();

        try {
            ps = conn.prepareStatement(sql); // ejecutar la consulta
            rs = ps.executeQuery();
            if (rs.next()) { // almacena los datos en el objeto con los métodos setter
                empleadosEnProyecto.setNumero_orden(rs.getInt("numero_orden"));
                empleadosEnProyecto.setId_proyecto(rs.getString("id_proyecto"));
                empleadosEnProyecto.setId_empl(rs.getInt("id_empl"));
                empleadosEnProyecto.setHoras_asignadas(rs.getInt("horas_asignadas"));
                empleadosEnProyecto.setFecha_incorporacion(rs.getDate("fecha_incorporacion"));
            }
            lista.add(empleadosEnProyecto); // agregar datos a la lista
        } catch (SQLException exception) {
            exception.printStackTrace(); // si falla sale por consola el error
        }

        return lista; // devuelve la lista
    }

    // no sé muy bien qué tienen que hacer estos métodos

    public int asignarEmpleadosAProyecto(List<EmpleadoEnProyecto> empleados) {
        return 0;
    }

    @Override
    public int horasAsignadasAProyecto(List<EmpleadoEnProyecto> empleados) {
        return 0;
    }

    @Override
    public double costeActualDeProyecto(String codigoProyecto) {
        return 0;
    }

    @Override
    public double margenActualProyecto(String codigoProyecto) {
        return 0;
    }

 

}
