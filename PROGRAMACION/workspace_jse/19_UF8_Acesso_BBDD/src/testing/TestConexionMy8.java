package testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.javabeans.Alojamientos;

public class TestConexionMy8 {

	public static void main(String[] args) {
		/*Despues de añadir las librerias de jar (sobre proyecto,build
		 * path,libraries,ClassPath,Add External jar y buscas en mysql el 
		 * conector J y despues "mysql-connector-java8...jar.
		 */

		  // Despues necesito una variable del tipo connection con una clase DriveMnager//
		/* con un .get connection 
		 * 
		 */
		System.out.println("me conecto a banco");
		String url= "jdbc:mysql://localhost:3306/AD6PPce?serverTimezone=UTC";
		String username= "estefania";
		String pwd="root";
		//Cuando tienes un try catch es importante crear el objeto fuera y dejar solo conn dentro//
		Connection conn =null;
		try {
			 conn = DriverManager.getConnection(url, username, pwd);
			System.out.println("conexion establecida");
		} catch (SQLException e) {
		
			e.printStackTrace();
			System.out.println("conexion fallida");
		}
		// para hacer una consulta ...//
		// necesitamos estas clases//
		String sql=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		// para la lectura necesitamos un onjeto de la clase resultset//
		sql=" Select * from alojamiento where codalojamiento=?";
		// ps=conn.preparedStatement levanata excepciones asi que las capturamos//
		Alojamientos alojamiento =null;
		
		try {
			ps=conn.prepareStatement(sql);
			// como esta sentencia tiene interrogante tenemos que poner un metodo donde digamos el valor del interrogante //
			// y ya despues ejecutar , si no tuviera interrogante seria ejecutar nada mas //
			//ps tiene un set por cada tipo de dato , cogemos el que tiene dos parametros //
			// el primero es el numero de interrogante , en este caso es el 1 (primero)//
			// el segundo es en este caso el codAlojamiento que le queremos dar//
			ps.setInt(1, 11);
			// ahora la fila que devuelve la sentencia la recuperamos por una clase resultset//
			// si fuera de modificar informacion seria executeupdate //
			// en este caso es executequery por que es de recuperar informacion//
			rs=ps.executeQuery();
			// ahora pregunto por que el select me puede devolver 0 ,1 o muchas filas //
			// y rs solo tiene un metodo para recuperar informacion que es next , si tiene informacion que recuperar //
			// ejecuta lo del corchete , si no se lo salta //
			// lo hacemos con un if por que es una fila la que tiene que recuperar , si fueran varias seria con u while//
			if (rs.next()) {
				// me tengo que costruir un objeto de la clase alojamiento , siempre fuera de catch //
			 alojamiento = new Alojamientos();
			 // el codAlojamiento lo hago por la posicion, sacandolo del rs que prepara la query//
			 alojamiento.setCodAlojamiento(rs.getInt(1));
			 alojamiento.setCategoria(rs.getString("categoria"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(alojamiento);
		
		// ahora vamos a pedir todos los alojamientos //
		sql=" Select * from alojamiento ";
		// hay que hacer una lista//
		List<Alojamientos> lista= new ArrayList<>();
		
		try {
			ps=conn.prepareStatement(sql);
			
			// como no hay interrogantes se quita ps.setInt(1, 11);//
			
			rs=ps.executeQuery();
			
			while (rs.next()) {
				// importante sienpre que hay un ArrayList crear un objeto   se su clase //
			Alojamientos alojamiento1=new Alojamientos();
			 
			
			 alojamiento1.setCodAlojamiento(rs.getInt(1));
			 alojamiento1.setCategoria(rs.getString("categoria"));
			 lista.add(alojamiento1);
			 // la añadimos a la lista //
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(Alojamientos ele : lista)
			System.out.println(ele);
		}
		
	}


