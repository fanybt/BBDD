package modelo.javabeans;
/**
 * Clase que representa a Soldados con dos atributos privados  estaMuerto y numeroBalas.
 *<br>
 *En esta clase los Soldados pueden disparan tienen un número de balas y pueden estar muertos .
 * <br>
 * @author fanyb
 * @version 1.0
 *
 */
public class Soldado {
	/**
	 * estaMuerto atributo privado booleano  <b>si esta muerto es true y si esta vivo es false </b>.
	 */
	public boolean estaMuerto;
	/**
	 * numeroBalas atributo privado entero  <b>cuenta el número de balas que les quedan a los Soldados </b>.
	 */
	public int numeroBalas;
	/**
	 * Constructor sin nada .
	 */
	public Soldado() {
		super();
	}
	/**
	 * Constructor con todo .
	 * <br>
	 * @param estaMuerto es booleano si esta muerto es true si no false .
	 * <br>
	 * @param numeroBalas cuenta el numero de balas.
	 */
	public Soldado(boolean estaMuerto, int numeroBalas) {
		
		super();
		this.estaMuerto = estaMuerto;
		this.numeroBalas = numeroBalas;
	}
	/**
	 * Guetter and Setter
	 * 
	 */
	
	
	public boolean isEstaMuerto() {
		return estaMuerto;
	}
	public void setEstaMuerto(boolean estaMuerto) {
		this.estaMuerto = estaMuerto;
	}
	public int getNumeroBalas() {
		return numeroBalas;
	}
	public void setNumeroBalas(int numeroBalas) {
		this.numeroBalas = numeroBalas;
	}
	
	/**
	 * Metodo cuyo funcionamiento consiste en que <b>si el numero de balas es mayor a 0  puede disparar</b>.
	 * y por tanto es true  si no tiene balas es false .
	 * @return <b>true  si tiene balas </b>   y <b>false  no  tiene balas </b>.
	 */
	public boolean puedeDisparar() {
		if (this.numeroBalas>0) {
			return true;
		}
		return false;
	}
	/**
	 * Metodo cuyo funcionamiento consiste en que los soldados pueden disparar a otro soldados 
	 * y ademas con cada disparo se restan balas .Si se dispara a un soldado este soldado estara muerto.
	 * @param soldado  se le pasa un soldado que estara muerto o no .
	 */
    public void disparar(Soldado soldado) {
    	this.numeroBalas--;
    	soldado.estaMuerto=true;
    }
}
