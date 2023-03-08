package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
private static Connection conn;
	
	public Conexion () {
	
	try {
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clientes_proyectos_empleados_2023?serverTimezone=UTC", "estefania", "root");
		System.out.println("conexion establecida");
	} catch (SQLException e) {
		System.out.println("no establecida");
		e.printStackTrace();
	}
	
	}
	
	public static Connection getConnection(){
		if (conn==null) {
			new Conexion();
		}
		return conn;
	}
}



