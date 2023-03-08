package javabeans;

import java.util.Objects;

public class Departamento {
	
	//DATOS PRIVADOS
	private int idDepar;
	private String nombre, direccion;
	
	//CONSTRUCTORES SIN NADA Y CON TODO
	public Departamento() {
		super();
	}

	public Departamento(int idDepar, String nombre, String direccion) {
		super();
		this.idDepar = idDepar;
		this.nombre = nombre;
		this.direccion = direccion;
	}

	//GETTER AND SETTER
	public int getIdDepar() {
		return idDepar;
	}

	public void setIdDepar(int idDepar) {
		this.idDepar = idDepar;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	// REDEFINIMOS TOSTRING
	@Override
	public String toString() {
		return "Departamento [idDepar=" + idDepar + ", nombre=" + nombre + ", direccion=" + direccion + "]";
	}

	// REDEFINIMOS HASHCOCE Y EQUALS
	@Override
	public int hashCode() {
		return Objects.hash(idDepar);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Departamento))
			return false;
		Departamento other = (Departamento) obj;
		return idDepar == other.idDepar;
	}
	
	
	
	
}
