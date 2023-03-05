package testing;

import modelo.dao.OficinaDao;
import modelo.dao.OficinaDaoImplMy8;
import modelo.javabeans.Oficina;

public class TestConexion {

	public static void main(String[] args) {
		
		// tercer  paso//
		// creamos una variablede los metodos que hace el interface  //
		OficinaDao odao= new OficinaDaoImplMy8();
		
		// ejecuto para comprobar que tengo la conexion//
		// probamos buscar uno//
		
		/* si lo haces asi estas haciendo la misma consulta dos veces y ralentizas la bbdd
		if (odao.buscarUna(9001)!=null)
		System.out.println(odao.buscarUna(9001).getNombre());
		else 
			System.out.println("oficina no encontrada ");
		*/
		// hacerlo asi , me creo una  variable del tipo que sea y lo utilizo//
		
		Oficina of =odao.buscarUna(9001);
		System.out.println("buscar una ");
		if (of !=null)
			System.out.println(of.getNombre());
			else 
				System.out.println("oficina no encontrada ");
		Oficina of1= new Oficina(9005, "sevilla1", "sevilla", "985654512");
		//System.out.println(odao.altaOficina(of1));
		of.setNombre("flamenca");
		//System.out.println(odao.modificarOficina(of));
		System.out.println("buscar todos ");
		for (Oficina ele: odao.buscarTodos()) {
			System.out.println(ele );
			
			/*System.out.println("eliminar 9005 : "+ odao.eliminarOficina(9005));
			System.out.println("buscar todos ");
			for (Oficina ele: odao.buscarTodos()) {
				System.out.println(ele );
			}
		
		System.out.println("buscar por ciudad -> madrid ");
		for (Oficina ele: odao.buscarPorCiudad("madrid")) {
			System.out.println(ele );*/
		}
		
		System.out.println("BUSCAR POR PREFIJO 678");
		for (Oficina ele: odao.buscarPorPrefijo("678")) {
			System.out.println(ele );
			
	}
	}
}


	


