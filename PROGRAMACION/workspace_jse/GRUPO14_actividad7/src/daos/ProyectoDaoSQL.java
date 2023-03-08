package daos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javabeans.Proyecto;

public class ProyectoDaoSQL extends Abstract implements ProyectoDao{
    

    // escritura de los métodos del interface
    @Override
    public List<Proyecto> buscarTodos() {
        // este método devuelve una lista completa con todos los proyectos de la base de datos
        List lista = new ArrayList<Proyecto>();
        
        do { // se van agregando los datos hasta que no encuentre más
            lista.add(buscarUna("i"));
        }while (buscarUna("i") != null);
        return lista;
    }

    @Override
    public Proyecto buscarUna(String id_proyecto) {
        // para buscar un proyecto se pide por parámetros un id
        // se da valor a la variable sql con la consulta que se va a aplicar
        sql = "Select * from proyectos where id_proyecto=?"; // en la condición de la consulta se deja una ? para después darle el dato que va a comparar
        Proyecto proyecto = new Proyecto();

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, id_proyecto); // la variable id se da como parámetro para la consulta que previamente era ?
            rs = ps.executeQuery();
            if (rs.next()) { // cuando se encuentra el dato que coincide por id se rellena el objeto Proyecto con los datos de este
                proyecto = new Proyecto();
                proyecto.setId_proyecto(rs.getString("id_proyecto"));
                proyecto.setDescripcion(rs.getString("descripcion"));
                proyecto.setFecha_inicio(rs.getDate("fecha_inicio"));
                proyecto.setFecha_fin_previsto(rs.getDate("fecha_fin_previsto"));
                proyecto.setFecha_fin_real(rs.getDate("fecha_fin_real"));
                proyecto.setVenta_previsto(rs.getDouble("venta_previsto"));
                proyecto.setCostes_previsto(rs.getDouble("costes_previsto"));
                proyecto.setCoste_real(rs.getDouble("coste_real"));
                proyecto.setEstado(this.rs.getString("estado"));
                proyecto.setJefe_proyecto(rs.getInt("jefe_proyecto"));
                proyecto.setCif(rs.getString("cif"));
            }
        } catch (SQLException exception) {
            exception.printStackTrace(); // si falla la consulta devuelve el error por consola
        }

        return proyecto; // devuelve el objeto proyecto una vez relleno con los datos
    }

    @Override
    public int altaProyecto(Proyecto proyecto) { // para agregar un proyecto se da un objeto Proyecto
        // con el objeto proyecto se crea la consulta insert into y se pasan todos los value del objeto con los métodos getter
        sql = "Insert into proyectos values (?,?,?,?,?,?,?,?,?,?,?)";
        filas=0;
        try {
			ps=conn.prepareStatement(sql);
               ps.setString(1, proyecto.getId_proyecto());
               ps.setString(2, proyecto.getDescripcion());
                ps.setDate(3,(Date) proyecto.getFecha_inicio());// no puedo poner set date , he hecho casting//
                ps.setDate(4,(Date) proyecto.getFecha_fin_previsto());
               ps.setDate(5,(Date) proyecto.getFecha_fin_real());
                ps.setDouble(6,proyecto.getVenta_previsto());
                ps.setDouble(7,proyecto.getCostes_previsto());
                ps.setDouble(8,proyecto.getCoste_real());
                ps.setString(9,proyecto.getEstado());
                ps.setInt(10,proyecto.getJefe_proyecto());
                ps.setString(11, proyecto.getCif());
                filas= ps.executeUpdate();
    			filas=1;
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filas;
	}
       

    @Override
    public boolean eliminarProyecto(int id) { // para eliminar un proyecto se pide también un id
        sql = "Drop from proyectos where id_proyecto = ?" ; // se utiliza el id pasado por parámetros para realizar la consulta de eliminar el dato de la bbdd

        try {
            ps = conn.prepareStatement(sql); // se prueba dentro del try a ejecutar la consulta
            rs = ps.executeQuery();
        } catch (SQLException exception) {
            exception.printStackTrace(); // si falla sale el error por consola
        }
        return true; // cuando acaba devuelve true
    }

    @Override
    public List<Proyecto> proyectosByEstado(String estado) { // para buscar una lista de proyectos filtrando por estado se pide el estado que se quiera buscar
        List<Proyecto> lista = new ArrayList<Proyecto>(); // creamos un List para ir agregando los datos que salgan de la consulta
        sql = "Select * from proyectos where estado = ?" ; // se hace un select con una condición que filtre por el estado que le hayamos pasado por parámetros
        Proyecto proyecto = new Proyecto(); // se define un objeto Proyecto para ir rellenando con los datos que encuentre

        try {
            ps = conn.prepareStatement(sql); // se establece conexión con la bbdd y se hace la consulta
            rs = ps.executeQuery();
            if (rs.next()) { // si encuentra datos en la consulta rellena el objeto Proyecto con los setter
                proyecto = new Proyecto();
                proyecto.setId_proyecto(rs.getString("id_proyecto"));
                proyecto.setDescripcion(rs.getString("descripcion"));
                proyecto.setFecha_inicio(rs.getDate("fecha_inicio"));
                proyecto.setFecha_fin_previsto(rs.getDate("fecha_fin_previsto"));
                proyecto.setFecha_fin_real(rs.getDate("fecha_fin_real"));
                proyecto.setVenta_previsto(rs.getDouble("venta_previsto"));
                proyecto.setCostes_previsto(rs.getDouble("costes_previsto"));
                proyecto.setCoste_real(rs.getDouble("coste_real"));
                proyecto.setEstado(this.rs.getString("estado"));
                proyecto.setJefe_proyecto(rs.getInt("jefe_proyecto"));
                proyecto.setCif(rs.getString("cif"));
            }
            lista.add(proyecto); // agrega ese objeto al List
        } catch (SQLException exception) {
            exception.printStackTrace(); // si falla devuelve el error en consola
        }

        return lista; // finalmente devuelve el List de proyectos que se ha ido encontrando en la consulta
    }

    @Override
    public List<Proyecto> proyectosByCliente(String cif) { // para buscar proyectos por cliente de da un cif del cliente
        List<Proyecto> lista = new ArrayList<Proyecto>(); // se crea la lista para ir agregando los datos que salgan de la consulta
        sql = "Select * from proyectos where cif = ?" ; // se crea la consulta en la variable sql con un select que filtre por cif
        Proyecto proyecto = new Proyecto(); // se crea un objeto Proyecto para después irlo rellenando con los datos que salgan

        try {
            ps = conn.prepareStatement(sql); // se establece conexión y se realiza la consulta
            rs =ps.executeQuery();
            if (rs.next()) { // si encuentra datos va rellenando el objeto Proyecto
                proyecto = new Proyecto();
                proyecto.setId_proyecto(rs.getString("id_proyecto"));
                proyecto.setDescripcion(rs.getString("descripcion"));
                proyecto.setFecha_inicio(rs.getDate("fecha_inicio"));
                proyecto.setFecha_fin_previsto(rs.getDate("fecha_fin_previsto"));
                proyecto.setFecha_fin_real(rs.getDate("fecha_fin_real"));
                proyecto.setVenta_previsto(rs.getDouble("venta_previsto"));
                proyecto.setCostes_previsto(rs.getDouble("costes_previsto"));
                proyecto.setCoste_real(rs.getDouble("coste_real"));
                proyecto.setEstado(this.rs.getString("estado"));
                proyecto.setJefe_proyecto(rs.getInt("jefe_proyecto"));
                proyecto.setCif(rs.getString("cif"));
            }
            lista.add(proyecto); // lo agrega a la liusta
        } catch (SQLException exception) {
            exception.printStackTrace(); // si falla devuelve el error en consola
        }

        return lista; // finalmente devuelve el List de proyectos que se ha ido encontrando en la consulta
    }

    @Override
    public List<Proyecto> proyectosByJefeProyectoAndByEstado(int jefeProyecto, String estado) { // se crea un método para buscar pryectos filtrando por jefe de proyecto y estado
        List<Proyecto> lista = new ArrayList<Proyecto>(); // se crea una lista para rellenar con los datos que encuentre
        sql = "Select * from proyectos where jefe_proyecto = ?"  + " and estado = ?" ;
        // se define la variable sql con la consulta select con un where que filtra por el id del jefe de proyecto y el estado
        Proyecto proyecto = new Proyecto(); // objeto Proyecto para rellenar con los datos que encuentra

        try {
            ps = conn.prepareStatement(sql); // se ejecuta la consuolta
            rs = ps.executeQuery();
            if (rs.next()) { // si encuentra datos los va asignando al objeto proyecto
                proyecto = new Proyecto();
                proyecto.setId_proyecto(rs.getString("id_proyecto"));
                proyecto.setDescripcion(rs.getString("descripcion"));
                proyecto.setFecha_inicio(rs.getDate("fecha_inicio"));
                proyecto.setFecha_fin_previsto(rs.getDate("fecha_fin_previsto"));
                proyecto.setFecha_fin_real(rs.getDate("fecha_fin_real"));
                proyecto.setVenta_previsto(rs.getDouble("venta_previsto"));
                proyecto.setCostes_previsto(rs.getDouble("costes_previsto"));
                proyecto.setCoste_real(rs.getDouble("coste_real"));
                proyecto.setEstado(this.rs.getString("estado"));
                proyecto.setJefe_proyecto(rs.getInt("jefe_proyecto"));
                proyecto.setCif(rs.getString("cif"));;
            }
            lista.add(proyecto); // agrega el objeto proyecto a la lista
        } catch (SQLException exception) {
            exception.printStackTrace(); // si falla devuelve el error en consola
        }

        return lista; // devuelve la lista
    }

    @Override
    public double importesVentaProyectosTerminados() { // método para buscar la suma de las ventas de proyectos
        double suma = 0;
        sql = "Select sum(coste_real) from proyectos"; // se crea la consulta que realiza la suma y devuelve el dato directamente

        try {
            ps = conn.prepareStatement(this.sql); // se ejecuta la consulta
            rs = ps.executeQuery();
            if (rs.next()) {
                suma = (rs.getDouble(1)); // guarda el dato en una variable double
            }
        } catch (SQLException exception) {
            exception.printStackTrace(); // si falla devuelve el error en consola
        }

        return suma; // se devuelve la suma total
    }

    @Override
    public double margenBrutoProyectosTerminados() { // método para buscar el margen de los proyectos terminados
        double suma = 0;
        sql = "Select sum(coste_real) from proyectos"; // se crea la consulta que devuelve la suma

        try {
            ps = conn.prepareStatement(sql); // se ejecuta la consulta
            rs = ps.executeQuery();
            if (rs.next()) {
                suma = (rs.getDouble(1)); // se guarda el dato obtenido en una variable
            }
        } catch (SQLException exception) {
            exception.printStackTrace(); // si falla devuelve el error en consola
        }

        return suma; // se devuelve el dato obtenido
    }

    @Override
    public int diasATerminoProyectoActivo(String codigoProyecto) { // método para obtener los días que dura un proyecto filtrando por uno en concreto
        sql = "Select fecha_fin_previsto from proyectos where id_proyecto = ?" ;
        // se crea la consulta select filtrando por id_proyecto utilizando la variable pasada por parámentros
        int horas = 0;
        try {
            ps = conn.prepareStatement(sql); // se ejecuta la consulta
            rs = ps.executeQuery();
            if (rs.next()) {
                horas = (rs.getInt(1));
            }
        } catch (SQLException exception) {
            exception.printStackTrace(); // si falla devuelve el error en consola
        }

        return horas; // se devuelven las horas obtenidas
    }

	
}

