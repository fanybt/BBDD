package testing;

import modelo.dao.AlojamientoDao;
import modelo.dao.AlojamientosDaoImplMy8;

public class TestModeloDao {

	public static void main(String[] args) {
		// creo la variable tipo Dao y se establece la conexion//
		AlojamientoDao adao = new AlojamientosDaoImplMy8();
		System.out.println(adao.buscarUna(11));
		
	}

}
