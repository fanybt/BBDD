package cochegaraje;

public class Aplicacion {

	public static void main(String[] args) {
		
		/*
		 * para crear un objeto del tipo coche pongo nombre de la clase ( Coche )
		 * lo que estamos indicando es que la variable que creo es del tipo coche.
		 * Despues se le da un nombre a la variable .
		 * Despues new Coche (objeto tipo coche ) y entre los parentesis se le da datos .
		 */

		
		Coche uno = new Coche ("Audi", "Q5", 80000,340);
		Coche dos = new Coche ("bmw", "serie3", 76000,320);
		Garaje plaza = new Garaje (40,"coche");
		plaza.aceptarCoche(uno);
		plaza.aceptarCoche(dos);
		plaza.mostrarDatos();
		plaza.devolverCoche(uno);
		plaza.devolverCoche(dos);
			
		uno.Mostrardatos();
		dos.Mostrardatos();
		
		
		
		
		
		
	}

}
