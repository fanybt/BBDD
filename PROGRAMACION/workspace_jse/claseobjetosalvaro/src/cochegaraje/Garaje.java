package cochegaraje;

import java.util.*;
public class Garaje {
	int plazas = 0;
	String nombre = " ";
	
	/*
	 * creo un array list
	 */
	ArrayList <Coche> listacoches = new ArrayList <Coche>();

	/*
	 * constructores
	 */
	public Garaje() {
		super();
	}

	public Garaje(int plazas, String nombre) {
		super();
		this.plazas = plazas;
		this.nombre = nombre;
		this.listacoches = listacoches;
	}
	
	/*
	 * métodos
	 */
     public void aceptarCoche(Coche coche) {
    	 listacoches.add(coche);
    	 System.out.println("coche añadido");
    	 
    	 
     }
     public void devolverCoche (Coche coche) {
    	 listacoches.remove(coche);
    	 System.out.println("coche devuelto");
     }
     
     public void mostrarDatos() {
    	 System.out.println("plazas : " + plazas);
    	 System.out.println("nombre : " + nombre);
    	 
    	 for (int i=0 ; i<listacoches.size();i++) {
    		 listacoches.get(i).Mostrardatos();
    		 
    	 }
     }
     
     
	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Coche> getListacoches() {
		return listacoches;
	}

	public void setListacoches(ArrayList<Coche> listacoches) {
		this.listacoches = listacoches;
	}
     
}
