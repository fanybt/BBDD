package javabeans;

import java.util.Objects;

public class Perfil {
	
	//DATOS PRIVADOS
	private int idPerfil;
	private String nombre;
	private double precioHora;
	
	//CONSTRUCTORES SIN NADA Y CON TODO
	public Perfil() {
		super();
	}

	public Perfil(int idPerfil, String nombre, double precioHora) {
		super();
		this.idPerfil = idPerfil;
		this.nombre = nombre;
		this.precioHora = precioHora;
	}



	//GETTER AND SETTER
	public int getIdPerfil() {
		return idPerfil;
	}

	public void setIdPerfil(int idPerfil) {
		this.idPerfil = idPerfil;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getPrecioHora() {
		return precioHora;
	}

	public void setPrecioHora(double precioHora) {
		this.precioHora = precioHora;
	}

	// REDEFINIMOS TOSTRING
	
	@Override
	public String toString() {
		return "Perfil [idPerfil=" + idPerfil + ", nombre=" + nombre + ", precioHora=" + precioHora + "]";
	}

	// REDEFINIMOS HASHCOCE Y EQUALS
	@Override
	public int hashCode() {
		return Objects.hash(idPerfil);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Perfil))
			return false;
		Perfil other = (Perfil) obj;
		return idPerfil == other.idPerfil;
	}
	
	
	

}
