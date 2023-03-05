package FechasAntiguas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFechas {

	public static void main(String[] args) {
		Date mifecha = new Date();
		System.out.println(mifecha);
		String fechaPedido="2023-01-20";
		// como transformo un String a date //
		
		// asi logicamente no me deja //
		// puedo utilizar este para dar  formato//
		SimpleDateFormat sdf =  new SimpleDateFormat("yyyy-mm-dd");
		//mifecha = sdf.parse(fechaPedido);levanta una excepcion y tengo dos //
		//opciones (add throws o try catch , add throws es si el error es de otro //
		//se lo devuelves , y si el problema es mio como es el caso y es lo normal que se hace //
		//lo cojo con try catch para capturar la excepcion//
		try {
			mifecha = sdf.parse(fechaPedido);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(fechaPedido);
		// y ya ha pasado el string a date //
	}

}
