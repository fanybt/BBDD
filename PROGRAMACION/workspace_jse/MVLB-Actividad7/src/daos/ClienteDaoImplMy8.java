package daos;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javabeans.Cliente;

public class ClienteDaoImplMy8 extends Abstract implements ClienteDao {

	@Override
	public int altaCliente(Cliente cliente) {
		sql = "insert into clientes values(?,?,?,?,?,?)";
		filas = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, cliente.getCif());
			ps.setString(2, cliente.getNombre());
			ps.setString(3, cliente.getApellidos());
			ps.setString(4, cliente.getDomicilio());
			ps.setDouble(5, cliente.getFacturaAnual());
			ps.setInt(6, cliente.getNumEmpleados());
			filas = ps.executeUpdate();
			filas = 1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public Cliente buscarUno(String cif) {
		sql = "select * from clientes where cif = ?";
		Cliente cli = null;
		try {
			//Obtengo el ps que se saca de la conexion y pasamos la sentencia para que lo vaya mirando
			//ps = conn levanta excepciones y creamos el try/catch
			ps = conn.prepareStatement(sql);
			//Select tiene ?, así que los sustituímos
			ps.setString(1, cif);
			/*
			 * executeQuery nos devuelve el ResultSet, con la query que le hemos pasado antes, nos devuelve la fila que hemos solicitado
			 * El rs lo que hace es que la dirección de memoria del registro se la pasa al rs y éste lee los metadatos, nombre de las columnas y posición que ocupan dentro de la select
			 */
			rs = ps.executeQuery();
			//Es una fila la que solicitamos así que poemos if. El rs tiene un método especializado en ver si hay fila o no hay fila que es next(). Si no hay fila devuelve false.
			// Si existe fila...
			if (rs.next()) {
				cli = new Cliente(); //Creamos el objeto
				//Lo que hay en la tabla hay que meterlo en el objeto y los hacemos con los siguientes métodos de rs
				cli.setCif(rs.getString("cif"));
				cli.setNombre(rs.getString("nombre"));
				cli.setApellidos(rs.getString("apellidos"));
				cli.setDomicilio(rs.getString("domicilio"));
				cli.setFacturaAnual(rs.getDouble("facturacion_anual"));
				cli.setNumEmpleados(rs.getInt("numero_empleados"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cli;
	}
	
	@Override
	public int modificarCliente(Cliente cliente) {
		sql = "update clientes set nombre = ?, apellidos = ?, domicilio = ?, facturacion_anual = ?, numero_empleados = ? "
				+ " where cif = ?";
		filas = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, cliente.getNombre());
			ps.setString(2, cliente.getApellidos());
			ps.setString(3, cliente.getDomicilio());
			ps.setDouble(4, cliente.getFacturaAnual());
			ps.setInt(5, cliente.getNumEmpleados());
			ps.setString(6, cliente.getCif());
			filas = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filas;
	}

	

	@Override
	public List<Cliente> buscarTodos() {
		sql = "select * from clientes";
		List<Cliente> lista = new ArrayList<>();
		
		try {
			//Obtengo el ps que se saca de la conexion y pasamos la sentencia para que lo vaya mirando
			//ps = conn levanta excepciones y creamos el try/catch
			ps = conn.prepareStatement(sql);
	
			/*
			 * executeQuery nos devuelve el ResultSet, con la query que le hemos pasado antes, nos devuelve la fila que hemos solicitado
			 * El rs lo que hace es que la dirección de memoria del registro se la pasa al rs y éste lee los metadatos, nombre de las columnas y posición que ocupan dentro de la select
			 */
			rs = ps.executeQuery();
			//Es una fila la que solicitamos así que poemos if. El rs tiene un método especializado en ver si hay fila o no hay fila que es next(). Si no hay fila devuelve false.
			// Si existe fila...
			while (rs.next()) {
				Cliente cli = new Cliente();
				cli = new Cliente(); //Creamos el objeto
				//Lo que hay en la tabla hay que meterlo en el objeto y los hacemos con los siguientes métodos de rs
				cli.setCif(rs.getString("cif"));
				cli.setNombre(rs.getString("nombre"));
				cli.setApellidos(rs.getString("apellidos"));
				cli.setDomicilio(rs.getString("domicilio"));
				cli.setFacturaAnual(rs.getDouble("facturacion_anual"));
				cli.setNumEmpleados(rs.getInt("numero_empleados"));
				lista.add(cli);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public int eliminarCliente(Cliente cliente) {
		sql = "delete from clientes where cif = ?";
		filas = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, cliente.getCif());
			filas = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filas;
	}

	
	
}
