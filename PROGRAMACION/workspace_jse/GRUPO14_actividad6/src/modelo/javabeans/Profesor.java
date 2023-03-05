package modelo.javabeans;

public class Profesor extends Persona{
	// constructores vacios y llenos para padre(Persona) y Profesor.//
	private String competencias;

	public Profesor() {
		super();
	}

	public Profesor(String nif, String nombre, String direccion, String telefono, String competencias) {
		super(nif, nombre, direccion, telefono);
		this.competencias = competencias;
	}

	public String getCompetencias() {
		return competencias;
	}

	public void setCompetencias(String competencias) {
		
		this.competencias = competencias;
	}

	@Override
	public String toString() {
		return "Profesor [competencias=" + competencias +  this.getNif()+ this.getNombre()+this.getDireccion()+this.getTelefono()+"]";
		
	}

	@Override
	public String trabajar() {
		return " El profesor " +this.getNombre()+ " va a imoartir su clase ";
		
		
	}
	
	public String ponerNotas () {
		return "El profesor " + this.getNombre()+ " va a corregir los exámenes ";
	}
	
	
	
	
	// to string , sobreescribir los métodos del padre , pero al ser privados tengo que estar //
	//gon gand s//

}
