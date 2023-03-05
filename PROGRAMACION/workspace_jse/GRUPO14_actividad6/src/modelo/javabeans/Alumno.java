package modelo.javabeans;

public class Alumno extends Persona{
	private String curso;

	public Alumno() {
		super();
	}

	public Alumno(String nif, String nombre, String direccion, String telefono, String curso) {
		super(nif, nombre, direccion, telefono);
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Alumno [curso=" + curso +this.getNif()+ this.getNombre()+this.getDireccion()+this.getTelefono()+"]";
		 
	}

	@Override
	public String trabajar() {
		
		return " El alumno " + this.getNombre()+ " va a estudiar " + this.getCurso();
	}

	public String hacerExamen () {
		return "El alumno " + this.getNombre()+ " va a hacer su  exámenen ";
	}
		
	}
	
  

