package daos;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javabeans.Cliente;
import javabeans.Perfil;

public class PerfilDaoImplMy8 extends Abstract implements PerfilDao{

	@Override
	public int altaPerfil(Perfil perfil) {
		sql = "insert into perfiles values(?,?,?)";
		filas = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, perfil.getIdPerfil());
			ps.setString(2, perfil.getNombre());
			ps.setDouble(3, perfil.getPrecioHora());
			
			filas = ps.executeUpdate();
			filas=1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public Perfil buscarUno(int idPerfil) {
		sql = "select * from perfiles where id_perfil = ?";
		Perfil perf = null;
		try {
			ps = conn.prepareStatement(sql);
			//Select tiene ?, así que los sustituímos
			ps.setInt(1, idPerfil);
			/*
			 * executeQuery nos devuelve el ResultSet, con la query que le hemos pasado antes, nos devuelve la fila que hemos solicitado
			 * El rs lo que hace es que la dirección de memoria del registro se la pasa al rs y éste lee los metadatos, nombre de las columnas y posición que ocupan dentro de la select
			 */
			rs = ps.executeQuery();
			//Es una fila la que solicitamos así que poemos if. El rs tiene un método especializado en ver si hay fila o no hay fila que es next(). Si no hay fila devuelve false.
			// Si existe fila...
			if (rs.next()) {
				perf = new Perfil(); //Creamos el objeto
				//Lo que hay en la tabla hay que meterlo en el objeto y los hacemos con los siguientes métodos de rs
				perf.setIdPerfil(rs.getInt("id_perfil"));
				perf.setNombre(rs.getString("nombre"));
				perf.setPrecioHora(rs.getDouble("precio_hora"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return perf;
	}

	@Override
	public int modificarPerfil(Perfil perfil) {
		sql = "update perfiles set nombre = ? ,"
				+ " precio_hora = ?"
				+ " where id_perfil = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, perfil.getNombre());
			ps.setDouble(2, perfil.getPrecioHora());
			ps.setInt(3, perfil.getIdPerfil());
			
			filas = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public int eliminarPerfil(Perfil perfil) {
		sql = "delete from perfiles where id_perfil = ?";
		filas = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, perfil.getIdPerfil());
			filas = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public List<Perfil> buscarTodos() {
		sql = "select * from perfiles";
		List<Perfil> lista = new ArrayList<>();
		
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
				Perfil perf = new Perfil();
				perf = new Perfil(); //Creamos el objeto
				//Lo que hay en la tabla hay que meterlo en el objeto y los hacemos con los siguientes métodos de rs
				perf.setIdPerfil(rs.getInt("id_perfil"));
				perf.setNombre(rs.getString("nombre"));
				perf.setPrecioHora(rs.getDouble("precio_hora"));
				lista.add(perf);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

}
