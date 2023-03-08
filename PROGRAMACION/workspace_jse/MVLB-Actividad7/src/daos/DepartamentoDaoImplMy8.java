package daos;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javabeans.Departamento;
import javabeans.Perfil;

public class DepartamentoDaoImplMy8 extends Abstract implements DepartamentoDao {

	@Override
	public int altaDepartamento(Departamento departamento) {
		sql = "insert into departamentos values(?,?,?)";
		filas = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, departamento.getIdDepar());
			ps.setString(2, departamento.getNombre());
			ps.setString(3, departamento.getDireccion());
			
			filas = ps.executeUpdate();
			filas=1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public Departamento buscarUno(int idDepar) {
		sql = "select * from departamentos where id_depar = ?";
		Departamento dep = null;
		try {
			ps = conn.prepareStatement(sql);
			//Select tiene ?, así que los sustituímos
			ps.setInt(1, idDepar);
			/*
			 * executeQuery nos devuelve el ResultSet, con la query que le hemos pasado antes, nos devuelve la fila que hemos solicitado
			 * El rs lo que hace es que la dirección de memoria del registro se la pasa al rs y éste lee los metadatos, nombre de las columnas y posición que ocupan dentro de la select
			 */
			rs = ps.executeQuery();
			//Es una fila la que solicitamos así que poemos if. El rs tiene un método especializado en ver si hay fila o no hay fila que es next(). Si no hay fila devuelve false.
			// Si existe fila...
			if (rs.next()) {
				dep = new Departamento(); //Creamos el objeto
				//Lo que hay en la tabla hay que meterlo en el objeto y los hacemos con los siguientes métodos de rs
				dep.setIdDepar(rs.getInt("id_depar"));
				dep.setNombre(rs.getString("nombre"));
				dep.setDireccion(rs.getString("direccion"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dep;
	}

	@Override
	public int modificarDepartamento(Departamento departamento) {
		sql = "update departamentos set nombre = ? ,"
				+ " direccion = ?"
				+ " where id_depar = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, departamento.getNombre());
			ps.setString(2, departamento.getDireccion());
			ps.setInt(3, departamento.getIdDepar());
			
			filas = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public int eliminarDepartamento(Departamento departamento) {
		sql = "delete from departamentos where id_depar = ?";
		filas = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, departamento.getIdDepar());
			filas = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public List<Departamento> buscarTodos() {
		sql = "select * from departamentos";
		List<Departamento> lista = new ArrayList<>();
		
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
				Departamento dep = new Departamento();
				dep = new Departamento(); //Creamos el objeto
				//Lo que hay en la tabla hay que meterlo en el objeto y los hacemos con los siguientes métodos de rs
				dep.setIdDepar(rs.getInt("id_depar"));
				dep.setNombre(rs.getString("nombre"));
				dep.setDireccion(rs.getString("direccion"));
				lista.add(dep);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	
}
