package modelo.javabeans;

public class Administrativo extends Persona {
	private String tareas;

	public Administrativo() {
		super();
	}

	public Administrativo(String nif, String nombre, String direccion, String telefono, String tareas) {
		super(nif, nombre, direccion, telefono);
		this.tareas = tareas;
	}

	public String getTareas() {
		return tareas;
	}

	public void setTareas(String tareas) {
		this.tareas = tareas;
	}

	@Override
	public String toString() {
		return "Administrativo [tareas=" + tareas + this.getNif()+ this.getNombre()+this.getDireccion()+this.getTelefono()+"]";
		 
	}

	@Override
	public String trabajar() {
		
		return " El administrativo " + this.getNombre()+ " va a realizar estas tareas " +this.getTareas();
	}
	
	public String gestionarMatricula() {
		return "El administrativo " + this.getNombre()+ " va a gestionar una matricula  ";
	}
}
