package javabeans;

import java.util.Objects;

public class Cliente {
	
	//DATOS PRIVADOS
	private String cif, nombre, apellidos, domicilio;
	private double facturaAnual;
	private int numEmpleados;
	
	//CONSTRUCTORES SIN NADA Y CON TODO
	public Cliente() {
		super();
	}

	public Cliente(String cif, String nombre, String apellidos, String domicilio, double facturaAnual,
			int numEmpleados) {
		super();
		this.cif = cif;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.domicilio = domicilio;
		this.facturaAnual = facturaAnual;
		this.numEmpleados = numEmpleados;
	}

	//GETTER AND SETTER
	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public double getFacturaAnual() {
		return facturaAnual;
	}

	public void setFacturaAnual(double facturaAnual) {
		this.facturaAnual = facturaAnual;
	}

	public int getNumEmpleados() {
		return numEmpleados;
	}

	public void setNumEmpleados(int numEmpleados) {
		this.numEmpleados = numEmpleados;
	}

	// REDEFINIMOS TOSTRING
	@Override
	public String toString() {
		return "Cliente [cif=" + cif + ", nombre=" + nombre + ", apellidos=" + apellidos + ", domicilio=" + domicilio
				+ ", facturaAnual=" + facturaAnual + ", numEmpleados=" + numEmpleados + "]";
	}

	// REDEFINIMOS HASHCOCE Y EQUALS
	@Override
	public int hashCode() {
		return Objects.hash(cif);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Cliente))
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(cif, other.cif);
	}
	

}
