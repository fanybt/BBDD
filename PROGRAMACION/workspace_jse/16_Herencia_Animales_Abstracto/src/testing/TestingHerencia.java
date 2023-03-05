package testing;

import modelo.javabeans.Animal;
import modelo.javabeans.Gato;
import modelo.javabeans.Perro;

public class TestingHerencia {

	public static void main(String[] args) {
		Animal animal1= new Animal(4, true ," perico");
		
       animal1.saludo();
       
       
       Gato gato1=new Gato(4, true, "con botas", 7);
       gato1.saludo();
       /*pone soy un animal y me llamo con botas , pero no pone soy un gato*/
       gato1.sonido();
       /*sonido generico , esto pasa por que estoy invocando a un método de mi padre con los datos de mi 
        * padre pero no me gustan y entonces tengo que ir a gato y pulsar source + override implements methods
        * y redefines , por ejemplo , saludo, sonido y medio de locomocion*/
       
        Perro perro1=new Perro(4,true,"lucas", "Caniche");
        perro1.saludo();
        perro1.sonido();
        perro1.medioLocomocion();
        
	}

}
