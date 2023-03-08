package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import conexion.Conexion;



public class Abstract {
	//poenmos protected para que pueda ver los datos//
		protected Connection conn;
		protected  PreparedStatement ps;
		protected ResultSet rs;
		protected int filas;
		protected String sql;
	    
	    
	    
	    
	    // constructor de Abstract//
		public Abstract () {
			
			conn = Conexion.getConnection();
		
		}

	}



