package FechasAntiguas;

import java.sql.Date;

public class TestSqlJavaSql {

	public static void main(String[] args) {
		
		// si cojo long date de sql me tiene que decir los milisegundos desde 1970//
		//si me llega el date de sql pero aqui tengo que usar date de java util//
		//no me deja por que no puede utilizar dos dates de paquetes diferentes//
		// entonces yo le selecciono date de java util y no me lo importa//
		//pero me pone todo el paquete y lo tengo que hacer de la siguiente forma//
		java.util.Date fechaUtil=new java.util.Date();
		Date mifecha= new Date(fechaUtil.getTime());
         System.out.println(mifecha);
         //asi consigo que me ponga la fecha de hoy//
         // tambien lo puedes hacer del tiron sin poner ja primera linea //
         //java.util.Date fechaUtil=new java.util.Date();//
         Date mifecha2= new Date(new java.util.Date().getTime());
         System.out.println(mifecha2);
	}

}
