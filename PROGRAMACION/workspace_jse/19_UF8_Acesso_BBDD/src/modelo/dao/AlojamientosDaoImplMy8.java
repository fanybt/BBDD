package modelo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

import modelo.javabeans.Alojamientos;

public class AlojamientosDaoImplMy8 implements AlojamientoDao {
      private Connection conn;
      private PreparedStatement ps ;
      private ResultSet rs;
      private String sql;
      
      // nos hacemos un constructor y arrancamos la conexion//
      public AlojamientosDaoImplMy8() {
    	  
    	  try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/AD6PPce?serverTimezone=UTC", "estefania", "root");
			System.out.println("conexion establecida");
		} catch (SQLException e) {
			System.out.println("no establecida");
			e.printStackTrace();
		}
	}
    

	@Override
	public List<Alojamientos> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}
	

	@Override
	public Alojamientos buscarUna(int codAlojamiento) {
		 
		sql=" Select * from alojamiento where codalojamiento=?";
		Alojamientos alojamiento=null;
		try {
			ps=conn.prepareStatement(sql);
			ps.setInt(1, codAlojamiento);
			rs = ps.executeQuery();
			if(rs.next()) {
				alojamiento=new Alojamientos();
				//busco por posiciones de columnas //
				alojamiento.setCodAlojamiento(rs.getInt(1));
				alojamiento.setCategoria(rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return alojamiento;
		
	}

	@Override
	public int altaAlojamientos(Alojamientos alojamiento) {
		// TODO Auto-generated method stub
		return 0;
	}
}
