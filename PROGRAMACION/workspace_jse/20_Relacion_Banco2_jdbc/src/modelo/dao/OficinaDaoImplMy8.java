package modelo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.javabeans.Oficina;

public class OficinaDaoImplMy8 implements OficinaDao{
	// segundo paso ( declaro variables , constructor , implemento metodos pero no los relleno//
	// una vez compruebo en el test que tengo conexion ya modifico los métodos //
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    private int filas;
    private String sql;
    
    
    
    
    // constructor sin nada , lo añadimos nosotros //
	public OficinaDaoImplMy8() {
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco_fp_23?serverTimezone=UTC", "estefania", "root");
			System.out.println("conexion establecida");
		} catch (SQLException e) {
			System.out.println("no establecida");
			e.printStackTrace();
		}
	
	}

	@Override
	public int altaOficina(Oficina oficina) {
		sql="insert into oficinas values (?,?,?,?,?)";
		try {
			ps=conn.prepareStatement(sql);
			ps.setInt(1, oficina.getIdOficina());
			ps.setString(2,oficina.getNombre());
			ps.setString(3, oficina.getDireccion());
			ps.setString(4, oficina.getCiudad());
			ps.setString(5, oficina.getTelefono());
			filas=ps.executeUpdate();
			filas =1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public int eliminarOficina(int idOficina) {
		sql="delete from oficinas where id_oficina =?";
		filas=0;
		try {
			ps=conn.prepareStatement(sql);
			ps.setInt(1, idOficina);
			filas=ps.executeUpdate();
			filas =1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filas;
	}

	

	@Override
	public int modificarOficina(Oficina oficina) {
		sql="update oficinas set nombre =?,"+ "direccion=?," + "ciudad=?,"+ "telefono=?"+ "where id_oficina=?" ;
		try {
			ps=conn.prepareStatement(sql);
			ps.setInt(5, oficina.getIdOficina());
			ps.setString(1,oficina.getNombre());
			ps.setString(2, oficina.getDireccion());
			ps.setString(3, oficina.getCiudad());
			ps.setString(4, oficina.getTelefono());
			filas=ps.executeUpdate();
			filas =1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filas;
	}

	
// copio la sentencia del sql, comprobando que funciona//
	@Override
	public Oficina buscarUna(int idOficina) {
		
		sql= "Select * from oficinas where ID_OFICINA = ?";
		Oficina of =null;
		//levanta excepcion , try catch//
		try {
			ps= conn.prepareStatement(sql);
			ps.setInt(1, idOficina); // inerrogante 1 y id_oficina//
			rs=ps.executeQuery(); // executequery ejecuta la query y la direccion de memoria de la fila //
			if(rs.next()) {
				of =new Oficina();
				of.setIdOficina(rs.getInt("id_oficina"));
				of.setCiudad(rs.getString("ciudad"));
				of.setDireccion(rs.getString("direccion"));
				of.setNombre(rs.getString("nombre"));
				of.setTelefono(rs.getString("telefono"));
				                    // que recupera s la da a rs, rs.next mira di hay datos en la fila recuperada y devuelve un boolean //
			}
			
			
			
		} catch (SQLException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return of;
	}

	@Override
	public List<Oficina> buscarTodos() {
		sql= "Select * from oficinas ";
		List<Oficina>lista = new ArrayList<>();
		//levanta excepcion , try catch//
		try {
			ps= conn.prepareStatement(sql);
			
			rs=ps.executeQuery(); 
			while(rs.next()) { // mientras que haya filas//
				Oficina of= new Oficina(); // como es un arraylist cada vez me tengo que crear una oficina//
				of.setIdOficina(rs.getInt("id_oficina"));
				of.setCiudad(rs.getString("ciudad"));
				of.setDireccion(rs.getString("direccion"));
				of.setNombre(rs.getString("nombre"));
				of.setTelefono(rs.getString("telefono"));
				lista.add(of) ;        // que recupera s la da a rs, rs.next mira di hay datos en la fila recuperada y devuelve un boolean //
			}
			
			
			
		} catch (SQLException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}
		
	

	@Override
	public List<Oficina> buscarPorPrefijo(String prefijo) {
		sql= "Select * from oficinas where telefono like ?";
		List<Oficina>lista = new ArrayList<>();
		
		try {
			ps= conn.prepareStatement(sql);
			ps.setString(1, prefijo + "%");  // % rellena los cmpos de la dcha//
			rs=ps.executeQuery(); 
			while(rs.next()) { // mientras que haya filas//
				Oficina of= new Oficina(); // como es un arraylist cada vez me tengo que crear una oficina//
				of.setIdOficina(rs.getInt("id_oficina"));
				of.setCiudad(rs.getString("ciudad"));
				of.setDireccion(rs.getString("direccion"));
				of.setNombre(rs.getString("nombre"));
				of.setTelefono(rs.getString("telefono"));
				lista.add(of) ;        // que recupera s la da a rs, rs.next mira di hay datos en la fila recuperada y devuelve un boolean //
			}
			
			
			
		} catch (SQLException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	
		
	}


	

	@Override
	public List<Oficina> buscarPorCiudad(String ciudad) {
		sql= "Select * from oficinas where ciudad= ?";
		List<Oficina>lista = new ArrayList<>();
		//levanta excepcion , try catch//
		try {
			ps= conn.prepareStatement(sql);
			ps.setString(1, ciudad);
			rs=ps.executeQuery(); 
			while(rs.next()) { // mientras que haya filas//
				Oficina of= new Oficina(); // como es un arraylist cada vez me tengo que crear una oficina//
				of.setIdOficina(rs.getInt("id_oficina"));
				of.setCiudad(rs.getString("ciudad"));
				of.setDireccion(rs.getString("direccion"));
				of.setNombre(rs.getString("nombre"));
				of.setTelefono(rs.getString("telefono"));
				lista.add(of) ;        // que recupera s la da a rs, rs.next mira di hay datos en la fila recuperada y devuelve un boolean //
			}
			
			
			
		} catch (SQLException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	
		
	}

}
