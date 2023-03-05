package testing;

import java.util.ArrayList;

import modelo.javabeans.Animal;
import modelo.javabeans.Gato;
import modelo.javabeans.Perro;

public class TestHerenciaConPolimorfismoSegundo {

	public static void main(String[] args) {
		
		
		
		Animal animal1= new Animal(4, true ," perico");
		Gato gato1=new Gato(4, true, "con botas", 7);
		Perro perro1=new Perro(4,true,"lucas", "Caniche");
		
		 //creo 3 variables de tipo animal//
		Animal animal2 , gato2 , perro2 ;
		animal2= new Animal(2, false, "flora");
		 gato2= new Gato(4, true, "parchis", 7);
		 perro2= new Perro(4, true,"thor","caniche");
		 
		 // creo un arraylist//
		 
		 ArrayList<Animal>zoo=new ArrayList<>();
		 zoo.add(perro1);
		 zoo.add(gato1);
		 zoo.add(animal1);
		 zoo.add(gato2);
		 zoo.add(perro2);
		 zoo.add(animal2);
		 
		 // hago un for de un animal llamado animal y el que tiene el ArrayList//
		 //es el zoo//
		 for(Animal animal: zoo) {
			 animal.sonido();
			 // se ejecutan todos los sonidos que hay en el padre , polimorfico una sola //
			 //llamada , varias implementaciones //
			 if(animal instanceof Gato ) {
				 System.out.println(((Gato)animal).getVidas());
				 //si lo que yo tengo es una variable animal pero instancia un gato para //
				 //preguntar sobre gato se hace asi//
			 }else if (animal instanceof Perro) {
				 System.out.println(((Perro)animal).getRaza());
			 }
			 
		 }
		 // si quiero obtener una variable de tipo gato , pero del gato 2 que es de tipo animal//
		 //no gato, se hace asi //
		     
	       // Gato migato =gato2; esto no me deja hacerlo//
		 Gato migato =(Gato)gato2; // asi ya te deja //
	}

}
