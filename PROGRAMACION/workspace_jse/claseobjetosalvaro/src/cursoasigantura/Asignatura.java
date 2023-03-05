package cursoasigantura;

public class Asignatura {
	String nombre = " ";
	int horas = 0;
	
	
	/*
	 * constructores
	 */
	public Asignatura() {
		super();
	}
	
	
	public Asignatura(String nombre, int horas) {
		super();
		this.nombre = nombre;
		this.horas = horas;
	}
	
	/*
	 * metodos
	 */
	
	public void Mostrardatos() {
	System.out.println("nombre : " + nombre );
	System.out.println("horas : " + horas);
	
	}
	
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	

}
