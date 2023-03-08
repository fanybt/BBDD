package javabeans;

import java.sql.Date;
import java.util.Objects;

public class ProyectoConEmpleado {

	//DATOS PRIVADOS
	private int numeroOrden, horasAsignadas;
	private Empleado empleado;
	private Proyecto proyecto;
	private Date fechaIncorporacion;
	
	//CONSTRUCTORES SIN NADA Y CON TODO
	public ProyectoConEmpleado() {
		super();
	}

	public ProyectoConEmpleado(int numeroOrden, int horasAsignadas, Empleado empleado, Proyecto proyecto,
			Date fechaIncorporacion) {
		super();
		this.numeroOrden = numeroOrden;
		this.horasAsignadas = horasAsignadas;
		this.empleado = empleado;
		this.proyecto = proyecto;
		this.fechaIncorporacion = fechaIncorporacion;
	}



	//GETTER AND SETTER
	public int getNumeroOrden() {
		return numeroOrden;
	}

	public void setNumeroOrden(int numeroOrden) {
		this.numeroOrden = numeroOrden;
	}


	public int getHorasAsignadas() {
		return horasAsignadas;
	}

	public void setHorasAsignadas(int horasAsignadas) {
		this.horasAsignadas = horasAsignadas;
	}


	public Date getFechaIncorporacion() {
		return fechaIncorporacion;
	}

	public void setFechaIncorporacion(Date fechaIncorporacion) {
		this.fechaIncorporacion = fechaIncorporacion;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Proyecto getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

	// REDEFINIMOS TOSTRING
	@Override
	public String toString() {
		return "ProyectoConEmpleado [numeroOrden=" + numeroOrden + ", horasAsignadas=" + horasAsignadas + ", empleado="
				+ empleado + ", proyecto=" + proyecto + ", fechaIncorporacion=" + fechaIncorporacion + "]";
	}

	// REDEFINIMOS HASHCOCE Y EQUALS
	@Override
	public int hashCode() {
		return Objects.hash(numeroOrden);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof ProyectoConEmpleado))
			return false;
		ProyectoConEmpleado other = (ProyectoConEmpleado) obj;
		return numeroOrden == other.numeroOrden;
	}
	
	//MÉTODOS PROPIOS
	//costeHorasAsignadas(): double . Horas * precio/hora
	public double costeHorasAsignadas() {
		double coste = 0;
		coste = horasAsignadas * this.getEmpleado().getPerfil().getPrecioHora();
		return coste;
	}
	
	
}
