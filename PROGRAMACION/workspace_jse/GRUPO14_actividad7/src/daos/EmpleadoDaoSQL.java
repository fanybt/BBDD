package daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javabeans.Empleado;

public class EmpleadoDaoSQL extends Abstract implements EmpleadoDao{ 
    
    @Override
    public List<Empleado> empleadosByDepartamento(int idDepar) { // método para devolver una lista de empleados por departamento
        List<Empleado> lista = new ArrayList<Empleado>(); // lista que iremos rellenando
        sql = "Select * from clientes where departamento =? " ; // consulta para obtener empleados select con where que filtra por el id departamento que le pasamos por parámetros
        Empleado empleado = new Empleado(); // objeto empleado que usaremos para rellenar la lista

        try {
            ps = conn.prepareStatement(sql); // ejecuta la consulta
            rs = ps.executeQuery();
            if (rs.next()) { // si encuentra datos rellena el objeto empleado con los setter
                empleado = new Empleado();
                empleado.setId_empl(rs.getInt("id_empl"));
                empleado.setNombre(rs.getString("nombre"));
                empleado.setApellidos(rs.getString("apellidos"));
                empleado.setEmail(rs.getString("email"));
                empleado.setPassword(rs.getString("password"));
                empleado.setFecha_ingreso(rs.getDate("fecha_ingreso"));
                empleado.setFecha_nacimiento(rs.getDate("fecha_nacimiento"));
            }
            lista.add(empleado); //agregar los datos que se encuentra a la lista y devolverlos
        } catch (SQLException exception) {
            exception.printStackTrace(); 
        }

        return lista; // devuelve la lista
    }

    @Override
    public List<Empleado> empleadosBySexo(char sexo) {
        // en la tabla empleados no hay sexo
        return null;
    }

    @Override
    public List<Empleado> empleadosByApellido(String apellido) { // método para devolver una lista de empleados filtrando por apellido
        List<Empleado> lista = new ArrayList<Empleado>(); // se crea la lista que rellenaremos desués
        sql = "Select * from empleados where apellidos = ?" ; // se crea la consulta en la variable sql select con where apellido que busca por el que le hemos pasado
        Empleado empleado = new Empleado(); // objeto empleado que rellenaremos con los datos de la consulta

        try {
            ps = conn.prepareStatement(sql); // ejecuta la consulta
            rs = ps.executeQuery();
            if (rs.next()) {
                empleado = new Empleado(); // se rellena el objeto empleado con los métodos setter
                empleado.setId_empl(rs.getInt("id_empl"));
                empleado.setNombre(rs.getString("nombre"));
                empleado.setApellidos(rs.getString("apellidos"));
                empleado.setEmail(rs.getString("email"));
                empleado.setPassword(rs.getString("password"));
                empleado.setFecha_ingreso(rs.getDate("fecha_ingreso"));
                empleado.setFecha_nacimiento(rs.getDate("fecha_nacimiento"));
            }
            lista.add(empleado); // se agrega el empleado a la lista
        } catch (SQLException exception) {
            exception.printStackTrace(); // si falla sale el error por consola
        }

        return lista; // devuelve la lita
    }

    @Override
    public double salarioTotal() { // método double que devuelve la suma de todos los salarios
        double suma = 0;
        sql = "Select sum(salario) from empleados"; // realiza la consulta de la suma de salarios

        try {
            ps = conn.prepareStatement(sql); // ejecuta la consulta
            rs = ps.executeQuery();
            if (rs.next()) {
                suma = (rs.getDouble(1)); // guarda el dato obtenido en una variable
            }
        } catch (SQLException exception) {
            exception.printStackTrace(); // si falla sale por consola
        }

        return suma; // devuelve el dato obtenido de la consulta
    }

    @Override
    public double salarioTotal(int idDepar) { // método que devuelve el salario total de un departamento
        double suma = 0;
        sql = "Select sum(salario) from empleados where id_depar = ?" ;// se realiza la consulta select sum con where id departamento que le digamos por parámetros

        try {
            ps = conn.prepareStatement(sql); // ejecuta la consulta
            rs = ps.executeQuery();
            if (rs.next()) {
                suma = (rs.getDouble(1)); // guarda el dato de la consulta
            }
        } catch (SQLException exception) {
            exception.printStackTrace(); // si falla sale por consola
        }

        return suma; // devuelve el dato obtenido
    }
}



