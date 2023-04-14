package modelo.javabeans;
/**
 * Clase que representa a jugadores con atributos privados dorsal,numeroTarjetasAmarillas y
 * numeroTarjetasRojas.
 * <br>
 * @author fanyb
 * @version 1.0
 *
 */
public class Jugador {
	/**
	 * dorsal atributo privado entero
	 */
	private int dorsal;
	/**
	 * numeroTarjetasAmarillas atributo privado entero
	 */
	private int numeroTarjetasAmarillas;
	/**
	 * numeroTarjetasRojas atributo privado entero
	 */
	private int numeroTarjetasRojas;
	/**
	 * Constructor vacio
	 */
	public Jugador() {
		super();
	}
	/**
	 * Contructor con todo 
	 * <br>
	 * @param dorsal es privado entero es el numero de dorsal que se le da a cada jugador
	 * <br>
	 * @param numeroTarjetasAmarillas privado entero , cantidad de tarjetas amarillas
	 * @param numeroTarjetasRojas privado entero, cantidad de tarjetas rojas
	 */
	public Jugador(int dorsal, int numeroTarjetasAmarillas, int numeroTarjetasRojas) {
		super();
		this.dorsal = dorsal;
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}
	/**
	 * Getter and Setter
	 * 
	 */
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public int getNumeroTarjetasAmarillas() {
		return numeroTarjetasAmarillas;
	}
	public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
	}
	public int getNumeroTarjetasRojas() {
		return numeroTarjetasRojas;
	}
	public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}
	/**
	 * Metodo por el cual se le pone un dorsal a un jugador 
	 * <br>
	 * si es menor a 1 o superior a 30 no se asignara dorsal y podra -1
	 * <br>
	 * @param dorsal numero que se le da a cada jugador 
	 */
	public void ponerDorsal(int dorsal) {
		if (dorsal>= 1 && dorsal <=30 ) {
			this.dorsal=dorsal;
			
		}else {
			this.dorsal=-1;
		}
	}
	/**
	 * Metodo booleano  estaEspulsado, si el jugador tiene<b> dos o mas tarjetas amarillas devolvera
	 * un true</b>
	 * <br>
	 * Si el jugador tiene<b> una tarjeta roja tambien devolvera true </b>
	 * @return si es expulsado o no 
	 */
	
	public boolean estaExpulsado(){
		boolean expulsado=false;
		if(numeroTarjetasAmarillas==2) {
			expulsado=true;
		}
		if(numeroTarjetasRojas==1) {
			expulsado=true;
			
		}
		return expulsado;
	}

}
