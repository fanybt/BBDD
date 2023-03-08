package daos;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;
import javabeans.Cliente;


public class ClienteDaoSQL extends Abstract implements ClienteDao{
	
	

	@Override
	public List<Cliente> buscarTodos() {
		sql= "Select * from clientes ";
		List<Cliente>lista=new ArrayList<>();
		
		
		
		try {
			ps= conn.prepareStatement(sql);
			
			rs=ps.executeQuery(); 
			while(rs.next()) {
				Cliente c1=new Cliente();
				c1 =new Cliente();
				c1.setCif(rs.getString("cif"));
				c1.setNombre(rs.getString("nombre"));
				c1.setApellidos(rs.getString("apellidos"));
				c1.setDomicilio(rs.getString("domicilio"));
				c1.setFacturacion_anual(rs.getDouble("facturacion_anual"));
				c1.setNumero_empleados(rs.getInt("numero_empleados"));
				lista.add(c1);                    // que recupera s la da a rs, rs.next mira di hay datos en la fila recuperada y devuelve un boolean //
			}
			
			
			
		} catch (SQLException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return lista;
	}
		   
	
	

	@Override
	public Cliente buscarUna(String cif) {
		sql= "Select * from clientes where cif = ?";
		Cliente c1=null;
		
		
		try {
			ps= conn.prepareStatement(sql);
			ps.setString(1, cif); 
			rs=ps.executeQuery(); 
			if(rs.next()) {
				c1 =new Cliente();
				c1.setCif(rs.getString("cif"));
				c1.setNombre(rs.getString("nombre"));
				c1.setApellidos(rs.getString("apellidos"));
				c1.setDomicilio(rs.getString("domicilio"));
				c1.setFacturacion_anual(rs.getDouble("facturacion_anual"));
				c1.setNumero_empleados(rs.getInt("numero_empleados"));
				                    // que recupera s la da a rs, rs.next mira di hay datos en la fila recuperada y devuelve un boolean //
			}
			
			
			
		} catch (SQLException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c1;
	}
	

	@Override
public int altaCliente(Cliente cliente) {
		
		sql="insert into clientes values (?,?,?,?,?,?)"; 
		filas=0;
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, cliente.getCif());
			ps.setString(2, cliente.getNombre());
			ps.setString(3, cliente.getApellidos());
			ps.setString(4, cliente.getDomicilio());
			ps.setDouble(5, cliente.getFacturacion_anual());
			ps.setInt(6, cliente.getNumero_empleados());
			filas= ps.executeUpdate();
			filas=1;
			
			filas= ps.executeUpdate();
			filas=1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filas;
	}
	@Override
	public int eliminarCliente(String cif) {
		sql="delete from clientes where cif =?";
		filas=0;
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, cif);
			filas=ps.executeUpdate();
			filas =1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filas;
	}

			
	      
     
	


		
    
		
	}


	

