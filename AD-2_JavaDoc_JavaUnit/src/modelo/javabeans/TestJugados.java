package modelo.javabeans;
/**
 * Clase test jugador donde se crean nuevos jugadores y se les da o cambia un numero de
 * dorsal asi como las tarjetasAmarillas y las tarjetasRojas
 * <br>
 * Tambien se puede ver su numero de dorsal y cuantas tarjetas de ambos colores tienen
 *  <br>
 * @author fanyb
 *
 */
public class TestJugados {
	/**
	 * metodo<b>main</b> para ejecutar los metodos 
	 * 
	 * @param args de metodo main
	 */

	public static void main(String[] args) {
		/**
		 * creamos los jugadores y les damos su numero de dorsal y de tarjetas amarillas y rojas 
		 */
		Jugador antonio=new Jugador(12, 2, 1);
		Jugador david=new Jugador(5, 0, 1);
		Jugador cesar=new Jugador(10, 0, 0);
		Jugador andres=new Jugador(8, 2, 0);
		Jugador jesus=new Jugador(4, 2, 0);
		
		/**
		 * le <b>cambiamos </b> el dorsal a andres
		 */
		andres.ponerDorsal(0);
		/**
		 * vemos que dorsal tiene cada uno 
		 */
		System.out.println("A el jugador David le damos el dorsal : "+david.getDorsal());
		System.out.println("A el jugador Antonio le damos el dorsal : "+antonio.getDorsal());
		System.out.println("A el jugador Cesar le damos el dorsal : "+cesar.getDorsal());
		System.out.println("A el jugador andres ahora le damos el dorsal : "+andres.getDorsal());
		System.out.println("A el jugador jesus le damos el dorsal : "+jesus.getDorsal());
		
		/**
		 * vemos cuantas tarjetas tiene cada jugador y si esta expulsado o no 
		 */
		System.out.println("El jugador antonio tiene   : " + antonio.getNumeroTarjetasAmarillas()+ "tarjetas amarillas y " + antonio.getNumeroTarjetasRojas()+"tarjetas rojas ") ;
		System.out.println("El jugador antonio esta expulsado  : " +antonio.estaExpulsado());
		System.out.println("El jugador david tiene   : " + david.getNumeroTarjetasAmarillas()+ "tarjetas amarillas y " + david.getNumeroTarjetasRojas()+"tarjetas rojas ") ;
		System.out.println("El jugador david esta expulsado  : " +david.estaExpulsado());
		System.out.println("El jugador cesar tiene   : " + cesar.getNumeroTarjetasAmarillas()+ "tarjetas amarillas y " + cesar.getNumeroTarjetasRojas()+"tarjetas rojas ") ;
		System.out.println("El jugador antonio esta expulsado  : " +cesar.estaExpulsado());
		System.out.println("El jugador andres tiene   : " + andres.getNumeroTarjetasAmarillas()+ "tarjetas amarillas y " + andres.getNumeroTarjetasRojas()+"tarjetas rojas ") ;
		System.out.println("El jugador antonio esta expulsado  : " +andres.estaExpulsado());
		System.out.println("El jugador jesus tiene   : " + jesus.getNumeroTarjetasAmarillas()+ "tarjetas amarillas y " + jesus.getNumeroTarjetasRojas()+"tarjetas rojas ") ;
		System.out.println("El jugador jesus esta expulsado  : " +jesus.estaExpulsado());
		
	}

}
