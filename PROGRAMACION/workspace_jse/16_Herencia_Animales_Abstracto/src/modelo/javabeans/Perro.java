package modelo.javabeans;

public class Perro extends Animal{
	private String raza ;
// constructores sin nada de mi padre y mio y con todo de los dos //
	public Perro() {
		super();
	}

	public Perro(int numeroPatas, boolean tienes, String nombre, String raza) {
		super(numeroPatas, tienes, nombre);
		this.raza = raza;
	}
//guetter and setter//
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
//override implements methods ,  para sobreescribir los metodos de mi padre //
	@Override
	public void saludo() {
		System.out.println("soy un perro y mi raza es : "+raza );
	}

	@Override
	public void sonido() {
		System.out.println("hago guau guau");
	}

	@Override
	public void medioLocomocion() {
		System.out.println("terrestre");
	}
	//to strig , veo todo lo de gato por que lo de mi hermano no lo puedo ver //

	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", numeroPatas=" + numeroPatas + ", nombre=" + nombre + "]";
	}

	
	

}
