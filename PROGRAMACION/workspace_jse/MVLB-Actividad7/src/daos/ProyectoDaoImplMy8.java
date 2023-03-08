package daos;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javabeans.Cliente;
import javabeans.Departamento;
import javabeans.Empleado;
import javabeans.Proyecto;

public class ProyectoDaoImplMy8 extends Abstract implements ProyectoDao {

	@Override
	public int altaProyecto(Proyecto proyecto) {
		sql = "insert into proyectos values(?,?,?,?,?,?,?,?,?,?,?)";
		filas = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, proyecto.getIdProyecto());
			ps.setString(2, proyecto.getDescripcion());
			ps.setDate(3, proyecto.getFechaInicio());
			ps.setDate(4, proyecto.getFechaFinPrevisto());
			ps.setDate(5, proyecto.getFechaFinReal());
			ps.setDouble(6, proyecto.getVentaPrevisto());
			ps.setDouble(7, proyecto.getCostePrevisto());
			ps.setDouble(8, proyecto.getCosteReal());
			ps.setString(9, proyecto.getEstado());
			ps.setInt(10, proyecto.getJefeProyecto().getIdEmpl());
			ps.setString(11, proyecto.getCliente().getCif());
			
			filas = ps.executeUpdate();
			filas=1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public Proyecto buscarUno(String idProyecto) {
		sql = "select * from proyectos where id_proyecto = ?";
		Proyecto pro = null;
		EmpleadoDao empdao = new EmpleadoDaoImplMy8();
		ClienteDao clidao = new ClienteDaoImplMy8();
		try {
			ps = conn.prepareStatement(sql);
			//Select tiene ?, así que los sustituímos
			ps.setString(1, idProyecto);
			/*
			 * executeQuery nos devuelve el ResultSet, con la query que le hemos pasado antes, nos devuelve la fila que hemos solicitado
			 * El rs lo que hace es que la dirección de memoria del registro se la pasa al rs y éste lee los metadatos, nombre de las columnas y posición que ocupan dentro de la select
			 */
			rs = ps.executeQuery();
			//Es una fila la que solicitamos así que ponemos if. El rs tiene un método especializado en ver si hay fila o no hay fila que es next(). Si no hay fila devuelve false.
			// Si existe fila...
			if (rs.next()) {
				pro = new Proyecto(); //Creamos el objeto
				//Lo que hay en la tabla hay que meterlo en el objeto y los hacemos con los siguientes métodos de rs
				pro.setIdProyecto(rs.getString("id_proyecto"));
				pro.setDescripcion(rs.getString("descripcion"));
				pro.setFechaInicio(rs.getDate("fecha_inicio"));
				pro.setFechaFinPrevisto(rs.getDate("fecha_fin_previsto"));
				pro.setFechaFinReal(rs.getDate("fecha_fin_real"));
				pro.setVentaPrevisto(rs.getDouble("venta_previsto"));
				pro.setCostePrevisto(rs.getDouble("costes_previsto"));
				pro.setCosteReal(rs.getDouble("coste_real"));
				pro.setEstado(rs.getString("estado"));
				pro.setJefeProyecto(empdao.buscarUno(rs.getInt("jefe_proyecto")));
				pro.setCliente(clidao.buscarUno(rs.getString("cif")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pro;
	}

	@Override
	public int modificarProyecto(Proyecto proyecto) {
		sql = "update proyectos set descripcion = ? ,"
				+ " fecha_inicio = ?,"
				+ " fecha_fin_previsto = ?,"
				+ " fecha_fin_real = ?,"
				+ " venta_previsto = ?,"
				+ " costes_previsto = ?,"
				+ " coste_real = ?,"
				+ " estado = ?,"
				+ " jefe_proyecto = ?,"
				+ " cif = ?"
				+ " where id_proyecto = ?";
		filas = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, proyecto.getIdProyecto());
			ps.setString(2, proyecto.getDescripcion());
			ps.setDate(3, proyecto.getFechaInicio());
			ps.setDate(4, proyecto.getFechaFinPrevisto());
			ps.setDate(5, proyecto.getFechaFinReal());
			ps.setDouble(6, proyecto.getVentaPrevisto());
			ps.setDouble(7, proyecto.getCostePrevisto());
			ps.setDouble(8, proyecto.getCosteReal());
			ps.setString(9, proyecto.getEstado());
			ps.setInt(10, proyecto.getJefeProyecto().getIdEmpl());
			ps.setString(11, proyecto.getCliente().getCif());
			
			filas = ps.executeUpdate();
			//filas=1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public int eliminarProyecto(Proyecto proyecto) {
		sql = "delete from proyectos where id_proyecto = ?";
		filas = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, proyecto.getIdProyecto());
			filas = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public List<Proyecto> buscarTodos() {
		sql = "select * from proyectos";
		List<Proyecto> lista = new ArrayList<>();
		EmpleadoDao empdao = new EmpleadoDaoImplMy8();
		ClienteDao clidao = new ClienteDaoImplMy8();
		
		try {
			ps = conn.prepareStatement(sql);
			
			rs = ps.executeQuery();
			while (rs.next()) {
				Proyecto pro = new Proyecto();
				pro.setIdProyecto(rs.getString("id_proyecto"));
				pro.setDescripcion(rs.getString("descripcion"));
				pro.setFechaInicio(rs.getDate("fecha_inicio"));
				pro.setFechaFinPrevisto(rs.getDate("fecha_fin_previsto"));
				pro.setFechaFinReal(rs.getDate("fecha_fin_real"));
				pro.setVentaPrevisto(rs.getDouble("venta_previsto"));
				pro.setCostePrevisto(rs.getDouble("costes_previsto"));
				pro.setCosteReal(rs.getDouble("coste_real"));
				pro.setEstado(rs.getString("estado"));
				pro.setJefeProyecto(empdao.buscarUno(rs.getInt("jefe_proyecto")));
				pro.setCliente(clidao.buscarUno(rs.getString("cif")));
				lista.add(pro);//listo
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public List<Proyecto> buscarPorEstado(String estado) {
		sql = "select * from proyectos where estado like ?";
		List<Proyecto> lista = new ArrayList<>();
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, "%" + estado + "%");
			rs = ps.executeQuery();
			while (rs.next()) {
				Proyecto pro = new Proyecto(); //Creamos el objeto
				EmpleadoDao empdao = new EmpleadoDaoImplMy8();
				ClienteDao clidao = new ClienteDaoImplMy8();
				
				    pro.setIdProyecto(rs.getString("id_proyecto"));
					pro.setDescripcion(rs.getString("descripcion"));
					pro.setFechaInicio(rs.getDate("fecha_inicio"));
					pro.setFechaFinPrevisto(rs.getDate("fecha_fin_previsto"));
					pro.setFechaFinReal(rs.getDate("fecha_fin_real"));
					pro.setVentaPrevisto(rs.getDouble("venta_previsto"));
					pro.setCostePrevisto(rs.getDouble("costes_previsto"));
					pro.setCosteReal(rs.getDouble("coste_real"));
					pro.setEstado(rs.getString("estado"));
					pro.setJefeProyecto(empdao.buscarUno(rs.getInt("jefe_proyecto")));
					pro.setCliente(clidao.buscarUno(rs.getString("cif")));
				    lista.add(pro);
			}
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	

	@Override
	public List<Proyecto> buscarPorCliente(String cif) {
		sql = "select * from proyectos where cif = ?";
		List<Proyecto> lista = new ArrayList<>();
		ClienteDao clidao = new ClienteDaoImplMy8();
		
		try {
			//Obtengo el ps que se saca de la conexion y pasamos la sentencia para que lo vaya mirando
			//ps = conn levanta excepciones y creamos el try/catch
			ps = conn.prepareStatement(sql);
			ps.setString(1, cif);
	
			/*
			 * executeQuery nos devuelve el ResultSet, con la query que le hemos pasado antes, nos devuelve la fila que hemos solicitado
			 * El rs lo que hace es que la dirección de memoria del registro se la pasa al rs y éste lee los metadatos, nombre de las columnas y posición que ocupan dentro de la select
			 */
			rs = ps.executeQuery();
			Cliente cliente = clidao.buscarUno(cif);
			PerfilDao perdao = new PerfilDaoImplMy8();
			//Es una fila la que solicitamos así que poemos if. El rs tiene un método especializado en ver si hay fila o no hay fila que es next(). Si no hay fila devuelve false.
			// Si existe fila...
			while (rs.next()) {
				EmpleadoDao empdao = new EmpleadoDaoImplMy8();
				Proyecto pro=new Proyecto();
				pro = new Proyecto();//Creamos el objeto
				//Lo que hay en la tabla hay que meterlo en el objeto y los hacemos con los siguientes métodos de rs
				pro.setIdProyecto(rs.getString("id_proyecto"));
				pro.setDescripcion(rs.getString("descripcion"));
				pro.setFechaInicio(rs.getDate("fecha_inicio"));
				pro.setFechaFinPrevisto(rs.getDate("fecha_fin_previsto"));
				pro.setFechaFinReal(rs.getDate("fecha_fin_real"));
				pro.setVentaPrevisto(rs.getDouble("venta_previsto"));
				pro.setCostePrevisto(rs.getDouble("costes_previsto"));
				pro.setCosteReal(rs.getDouble("coste_real"));
				pro.setEstado(rs.getString("estado"));
				pro.setJefeProyecto(empdao.buscarUno(rs.getInt("jefe_proyecto")));
				pro.setCliente(clidao.buscarUno(rs.getString("cif")));
			    lista.add(pro);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	
	

	@Override
	public List<Proyecto> buscarPorJefeProyectoYDepartamento(int jefeProyecto, String estado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double importesVentaProyectosTerminados() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double margenBrutoProyectosTerminados() {
		// TODO Auto-generated method stub
		return 0;
	}

	//codigoProyecto o idProyecto???
	@Override
	public int diasATerminoProyectoActivo(String codigoProyecto) {
		sql = "select datediff(current_date(), fecha_fin_previsto) from proyectos where id_proyecto = ?;";
		int dias = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, codigoProyecto);
			rs = ps.executeQuery();
			if (rs.next()) {
				dias = rs.getInt(1);//si no hay alias deberíamos poner el número de la columna. Está en posición 1
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dias;
	}

}
