package modelo.javabeans;

public class Animal {
	// protected = se lo pongo para que mis hijos puedan ver mis datos pero solo mis hijos //
	protected int numeroPatas;
	private boolean tienes;
	protected String nombre;
	public Animal(int numeroPatas, boolean tienes, String nombre) {
		super();
		this.numeroPatas = numeroPatas;
		this.tienes = tienes;
		this.nombre =nombre;
	}
	public Animal() {
		super();
	}
	public int getNumeroPatas() {
		return numeroPatas;
	}
	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}
	public boolean isTienes() {
		return tienes;
	}
	public void setTienes(boolean tienes) {
		this.tienes = tienes;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	@Override
	public String toString() {
		return "Animal [numeroPatas=" + numeroPatas + ", tienes=" + tienes + ", nombre=" + nombre + "]";
	}


	

	
	// metodos propios//
	// metodo que no da nada ni recibe nada //
	// un javabean nunca pondria un siso pero esto es de ejemplo //
	public void saludo() {
		System.out.println("soy un animal y me llamo  : "+ nombre );
	}
		
		
		public void sonido() {
			System.out.println("soy genérico");
	}
		
		public void medioLocomocion() {
			System.out.println("tengo muchos , elige uno");
		}
		

}
