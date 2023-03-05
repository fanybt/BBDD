package testing;

import java.util.ArrayList;

import modelo.javabeans.Animal;
import modelo.javabeans.Gato;
import modelo.javabeans.Perro;

public class TestHerenciaConPolimorfismo {

	public static void main(String[] args) {
		Animal animal , gato , perro ;
		
		// animal= new Animal(2, false, "julio");//
		 gato= new Gato(4, true, "perico", 7);
		 perro= new Perro(4, true,"thor","san bernardo");
		 //quito animal por que se ha declarado abstracto//
		gato.saludo();
		//animal.saludo();//
		perro.saludo();
		
		/* me he construido tres variables de tipo animal , pero no se ejecuta lo de animal 
		 * se ejecuta lo de cada uno ,es decir , lo de la dcha del new , en perro lo de perro etc */
		
		/*
		 * Si pongo gato.set no veo sus metodos solo los de animal . A los métodos del padre ,  como saludo 
		 * que tiene una sola llamada (saludo) pero que tienen diferentes implementaciones 
		 * para perro unas , para gato otras y para animal otras se les llama polimorficos.
		 * Esto es útil para lo siguiente .
		 
	/*
        ArrayList<Animal>animales = new ArrayList <>();
        animales.add(new Animal(2, false, "julio"));
        animales.add(new Gato(4, true, "perico", 7));
        animales.add(new Perro(4, true,"thor","san bernardo"));
          //Animal = que hay dentro , ele =como llamo a cada uno  , que hay en la lista =animales //
        for (Animal  ele: animales) {
        	ele.sonido();*/
        	// con una sola llamada hago las diferentes implementaciones de los objetos que hay en la lista .
        	
        	// si solo quiero invocar un metodo de uno .//
        	
        	// si la variable gato quiere saber sus vidas , si pongo gato.get (no sale nada por que apunta //
		//es una variable de tipo animal//
        	
		/* para solucionarlo convertimos a gato que es un animal en gato normal  , haciendo un casting implicito*/
		/* asi ya puede tener sus métodos*/
		Gato migato= (Gato)gato;
		System.out.println(migato.getVidas());
		// tambien se puede hacer asi //
		System.out.println(((Gato)gato).getVidas());
        }
	}


