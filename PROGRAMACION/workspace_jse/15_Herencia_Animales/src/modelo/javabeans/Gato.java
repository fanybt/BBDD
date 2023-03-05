package modelo.javabeans;
// extends = heredar //
public class Gato extends Animal  {
private int  vidas;
// primero le pones el vacio para tu padre que cuando haces source+constructor (sale arriba )y vacio para ti //
// despues otro constructor lleno para tu padre y para ti //
public Gato() {
	super();
}

public Gato(int numeroPatas, boolean tienes, String nombre ,int vidas) {
	super(numeroPatas, tienes , nombre);// es tu padre//
	this.vidas = vidas;// eres tu//
}
// g and s solo los mios //

public int getVidas() {
	return vidas;
}

public void setVidas(int vidas) {
	this.vidas = vidas;
}
// si no sobreescribo le ejecutaran los métodos de mi padre //
// al darle source to string , aparecen mis métodos y los heredados , en los que mi padre ha puesto //
//protected si vere sus datos de sus campos (inherited fields(numero patas)// 
// en los demas no //
// normalmente en herencia el padre declara los datos como protected, y en el to string escojes//
// tus fields y inherited fields"de tu padre")

@Override
public String toString() {
	return "Gato [vidas=" + vidas + ", numeroPatas=" + numeroPatas + "]";
}
// si mi padre no los declara protected sino private por ejemplo pues tengo que estar todo el rato con los g and s //
  // sobreescribo los metodos de mi padre , quitando super y poniendo syso  por que//
//no me gustan lo que dan sus datos //
@Override
public void saludo() {
	// sustituyo el metodo de mi padre por el mio propio y asi en los demás , sonido y medio de locomocion//
	System.out.println("soy un gato y me llamo : " + nombre );
}

@Override
public void sonido() {
	// TODO Auto-generated method stub
	System.out.println("hago miau ");
}

@Override
public void medioLocomocion() {
	System.out.println("soy terrestre ");
}
 


}
