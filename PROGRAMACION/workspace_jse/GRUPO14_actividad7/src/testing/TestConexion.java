package testing;

import java.sql.Connection;

import conexion.Conexion;
import javabeans.Cliente;



public class TestConexion {

	
		public static void main (String []Args){
			// Pruebo que he establecido una sola conexion para todos los objetos//
	    	 Connection conn1= Conexion.getConnection();
	    	 Connection conn2= Conexion.getConnection();
	    	 
	    	 System.out.println(conn1);
		     System.out.println(conn2);
		     
	}
}


