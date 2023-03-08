package daos;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javabeans.Departamento;
import javabeans.Empleado;
import javabeans.Perfil;

public class EmpleadoDaoImplMy8 extends Abstract implements EmpleadoDao {
	
	//Creamos esta variable y este constructor para que empdao esté activo todo el tiempo
	/*
	private EmpleadoDao empdao;
	private DepartamentoDao depdao;
	private PerfilDao perdao;
	
	public EmpleadoDaoImplMy8() {
		empdao = new EmpleadoDaoImplMy8();
	}*/

	@Override
	public int altaEmpleado(Empleado empleado) {
		sql = "insert into empleados values(?,?,?,?,?,?,?,?,?,?,?)";
		filas = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, empleado.getIdEmpl());
			ps.setString(2, empleado.getNombre());
			ps.setString(3, empleado.getApellidos());
			ps.setString(4, String.valueOf(empleado.getGenero()));//pasar de char a String
			ps.setString(5, empleado.getEmail());
			ps.setString(6, empleado.getPassword());
			ps.setDouble(7, empleado.getSalario());
			ps.setDate(8, empleado.getFechaIngreso());
			ps.setDate(9, empleado.getFechaNacimiento());
			ps.setInt(10, empleado.getPerfil().getIdPerfil());
			ps.setInt(11, empleado.getDepartamento().getIdDepar());
			
			filas = ps.executeUpdate();
			filas=1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public Empleado buscarUno(int idEmpl) {
		sql = "select * from empleados where id_empl = ?";
		Empleado emp = null;
		PerfilDao perdao = new PerfilDaoImplMy8();
		DepartamentoDao depdao = new DepartamentoDaoImplMy8();
		try {
			ps = conn.prepareStatement(sql);
			//Select tiene ?, así que los sustituímos
			ps.setInt(1, idEmpl);
			/*
			 * executeQuery nos devuelve el ResultSet, con la query que le hemos pasado antes, nos devuelve la fila que hemos solicitado
			 * El rs lo que hace es que la dirección de memoria del registro se la pasa al rs y éste lee los metadatos, nombre de las columnas y posición que ocupan dentro de la select
			 */
			rs = ps.executeQuery();
			//Es una fila la que solicitamos así que ponemos if. El rs tiene un método especializado en ver si hay fila o no hay fila que es next(). Si no hay fila devuelve false.
			// Si existe fila...
			if (rs.next()) {
				emp = new Empleado(); //Creamos el objeto
				//Lo que hay en la tabla hay que meterlo en el objeto y los hacemos con los siguientes métodos de rs
				emp.setIdEmpl(rs.getInt("id_empl"));
				emp.setNombre(rs.getString("nombre"));
				emp.setApellidos(rs.getString("apellidos"));
				emp.setGenero(rs.getString("genero").charAt(0));//Pasar de string a char
				emp.setEmail(rs.getString("email"));
				emp.setPassword(rs.getString("password"));
				emp.setSalario(rs.getDouble("salario"));
				emp.setFechaIngreso(rs.getDate("fecha_ingreso"));
				emp.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
				emp.setPerfil(perdao.buscarUno(rs.getInt("id_perfil")));
				emp.setDepartamento(depdao.buscarUno(rs.getInt("id_depar")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emp;
	}
	
	@Override
	public int modificarEmpleado(Empleado empleado) {
		sql = "update empleados set nombre = ?, apellidos = ?, genero = ?, email = ?, password = ?, salario = ?, fecha_ingreso = ?, fecha_nacimiento = ?, id_perfil = ?, id_depar = ? "
				+ " where id_empl = ?";
		filas = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, empleado.getNombre());
			ps.setString(2, empleado.getApellidos());
			ps.setString(3, String.valueOf(empleado.getGenero()));//pasar de char a String
			ps.setString(4, empleado.getEmail());
			ps.setString(5, empleado.getPassword());
			ps.setDouble(6, empleado.getSalario());
			ps.setDate(7, empleado.getFechaIngreso());
			ps.setDate(8, empleado.getFechaNacimiento());
			ps.setInt(9, empleado.getPerfil().getIdPerfil());
			ps.setInt(10, empleado.getDepartamento().getIdDepar());
			ps.setInt(11, empleado.getIdEmpl());
			
			filas = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public int eliminarEmpleado(Empleado empleado) {
		sql = "delete from empleados where id_empl = ?";
		filas = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, empleado.getIdEmpl());
			filas = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public List<Empleado> buscarTodos() {
		sql = "select * from empleados";
		List<Empleado> lista = new ArrayList<>();
		PerfilDao perdao = new PerfilDaoImplMy8();
		DepartamentoDao depdao = new DepartamentoDaoImplMy8();
		
		try {
			ps = conn.prepareStatement(sql);
			
			rs = ps.executeQuery();
			while (rs.next()) {
				Empleado emp = new Empleado();//creo
				//crearEmpleado(emp);cargo
				emp.setIdEmpl(rs.getInt("id_empl"));
				emp.setNombre(rs.getString("nombre"));
				emp.setApellidos(rs.getString("apellidos"));
				emp.setGenero(rs.getString("genero").charAt(0));//Pasar de string a char
				emp.setEmail(rs.getString("email"));
				emp.setPassword(rs.getString("password"));
				emp.setSalario(rs.getDouble("salario"));
				emp.setFechaIngreso(rs.getDate("fecha_ingreso"));
				emp.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
				emp.setPerfil(perdao.buscarUno(rs.getInt("id_perfil")));
				emp.setDepartamento(depdao.buscarUno(rs.getInt("id_depar")));
				lista.add(emp);//listo
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public List<Empleado> buscarPorDepartamento(int idDepar) {
		sql = "select * from empleados where id_depar = ?";
		List<Empleado> lista = new ArrayList<>();
		DepartamentoDao depdao = new DepartamentoDaoImplMy8();
		
		try {
			//Obtengo el ps que se saca de la conexion y pasamos la sentencia para que lo vaya mirando
			//ps = conn levanta excepciones y creamos el try/catch
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idDepar);
	
			/*
			 * executeQuery nos devuelve el ResultSet, con la query que le hemos pasado antes, nos devuelve la fila que hemos solicitado
			 * El rs lo que hace es que la dirección de memoria del registro se la pasa al rs y éste lee los metadatos, nombre de las columnas y posición que ocupan dentro de la select
			 */
			rs = ps.executeQuery();
			Departamento departamento = depdao.buscarUno(idDepar);//Leemos el departamento de la que buscamos dentro del while ya no la tenemos que leer cada vez
			PerfilDao perdao = new PerfilDaoImplMy8();
			//Es una fila la que solicitamos así que poemos if. El rs tiene un método especializado en ver si hay fila o no hay fila que es next(). Si no hay fila devuelve false.
			// Si existe fila...
			while (rs.next()) {
				Empleado emp = new Empleado();
				emp = new Empleado(); //Creamos el objeto
				//Lo que hay en la tabla hay que meterlo en el objeto y los hacemos con los siguientes métodos de rs
				emp.setIdEmpl(rs.getInt("id_empl"));
				emp.setNombre(rs.getString("nombre"));
				emp.setApellidos(rs.getString("apellidos"));
				emp.setGenero(rs.getString("genero").charAt(0));//Pasar de string a char
				emp.setEmail(rs.getString("email"));
				emp.setPassword(rs.getString("password"));
				emp.setSalario(rs.getDouble("salario"));
				emp.setFechaIngreso(rs.getDate("fecha_ingreso"));
				emp.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
				emp.setPerfil(perdao.buscarUno(rs.getInt("id_perfil")));
				emp.setDepartamento(departamento);
				lista.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	
	@Override
	public List<Empleado> buscarPorSexo(char sexo) {
		sql = "select * from empleados where genero = ?";
		List<Empleado> lista = new ArrayList<>();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, String.valueOf(sexo));
			rs = ps.executeQuery();
			while (rs.next()) {
			Empleado emp = new Empleado();
			PerfilDao perdao = new PerfilDaoImplMy8();
			DepartamentoDao depdao = new DepartamentoDaoImplMy8();
			emp.setIdEmpl(rs.getInt("id_empl"));
			emp.setNombre(rs.getString("nombre"));
			emp.setApellidos(rs.getString("apellidos"));
			emp.setGenero(rs.getString("genero").charAt(0));//Pasar de string a char
			emp.setEmail(rs.getString("email"));
			emp.setPassword(rs.getString("password"));
			emp.setSalario(rs.getDouble("salario"));
			emp.setFechaIngreso(rs.getDate("fecha_ingreso"));
			emp.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
			emp.setPerfil(perdao.buscarUno(rs.getInt("id_perfil")));
			emp.setDepartamento(depdao.buscarUno(rs.getInt("id_depar")));
			lista.add(emp);
		}
			
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return lista;
			
			}
			
		
		

	@Override
	public List<Empleado> buscarPorApellido(String apellidos) {
		sql = "select * from empleados where apellidos like ?";
		List<Empleado> lista = new ArrayList<>();
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, "%" + apellidos + "%");
			rs = ps.executeQuery();
			while (rs.next()) {
				Empleado emp = new Empleado(); //Creamos el objeto
				PerfilDao perdao = new PerfilDaoImplMy8();
				DepartamentoDao depdao = new DepartamentoDaoImplMy8();
				//Lo que hay en la tabla hay que meterlo en el objeto y los hacemos con los siguientes métodos de rs
				emp.setIdEmpl(rs.getInt("id_empl"));
				emp.setNombre(rs.getString("nombre"));
				emp.setApellidos(rs.getString("apellidos"));
				emp.setGenero(rs.getString("genero").charAt(0));//Pasar de string a char
				emp.setEmail(rs.getString("email"));
				emp.setPassword(rs.getString("password"));
				emp.setSalario(rs.getDouble("salario"));
				emp.setFechaIngreso(rs.getDate("fecha_ingreso"));
				emp.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
				emp.setPerfil(perdao.buscarUno(rs.getInt("id_perfil")));
				emp.setDepartamento(depdao.buscarUno(rs.getInt("id_depar")));
				lista.add(emp);
			}
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public double salarioTotal() {
		sql = "select sum(salario) as suma from empleados";
		double suma = 0;
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs.next()) {
				suma = rs.getDouble("suma");//si no hay alias deberíamos poner el número de la columna. 1 por ejemplo
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return suma;
	}

	@Override
	public double salarioTotal(int idDepar) {
		sql = "select sum(salario) as suma from empleados where id_depar = ?";
		double suma = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idDepar);
			rs = ps.executeQuery();
			while (rs.next()) {
				suma = rs.getDouble("suma");//si no hay alias deberíamos poner el número de la columna. 1 por ejemplo
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return suma;
	}
	
	/*
	private void crearEmpleado(Empleado emp) throws SQLException {
		emp.setIdEmpl(rs.getInt("id_empl"));
		emp.setNombre(rs.getString("nombre"));
		emp.setApellidos(rs.getString("apellidos"));
		emp.setGenero(rs.getString("genero").charAt(0));//Pasar de string a char
		emp.setEmail(rs.getString("email"));
		emp.setPassword(rs.getString("password"));
		emp.setSalario(rs.getDouble("salario"));
		emp.setFechaIngreso(rs.getDate("fecha_ingreso"));
		emp.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
		emp.setPerfil(perdao.buscarUno(rs.getInt("id_perfil")));
		emp.setDepartamento(depdao.buscarUno(rs.getInt("id_depar")));
	}
*/
	
}
