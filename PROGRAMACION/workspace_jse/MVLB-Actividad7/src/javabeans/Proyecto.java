package javabeans;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Objects;

public class Proyecto {
	
	//DATOS PRIVADOS
	private String idProyecto, descripcion;
	private Date fechaInicio, fechaFinPrevisto, fechaFinReal;
	private double ventaPrevisto, costePrevisto, costeReal;
	private String estado;
	private Empleado jefeProyecto;
	private Cliente cliente;
	
	//CONSTRUCTORES SIN NADA Y CON TODO
	public Proyecto() {
		super();
	}

	public Proyecto(String idProyecto, String descripcion, Date fechaInicio, Date fechaFinPrevisto, Date fechaFinReal,
			double ventaPrevisto, double costePrevisto, double costeReal, String estado, Empleado jefeProyecto,
			Cliente cliente) {
		super();
		this.idProyecto = idProyecto;
		this.descripcion = descripcion;
		this.fechaInicio = fechaInicio;
		this.fechaFinPrevisto = fechaFinPrevisto;
		this.fechaFinReal = fechaFinReal;
		this.ventaPrevisto = ventaPrevisto;
		this.costePrevisto = costePrevisto;
		this.costeReal = costeReal;
		this.estado = estado;
		this.jefeProyecto = jefeProyecto;
		this.cliente = cliente;
	}

	//GETTER AND SETTER
	public String getIdProyecto() {
		return idProyecto;
	}

	public void setIdProyecto(String idProyecto) {
		this.idProyecto = idProyecto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getVentaPrevisto() {
		return ventaPrevisto;
	}

	public void setVentaPrevisto(double ventaPrevisto) {
		this.ventaPrevisto = ventaPrevisto;
	}

	public double getCostePrevisto() {
		return costePrevisto;
	}

	public void setCostePrevisto(double costePrevisto) {
		this.costePrevisto = costePrevisto;
	}

	public double getCosteReal() {
		return costeReal;
	}

	public void setCosteReal(double costeReal) {
		this.costeReal = costeReal;
	}

	public Empleado getJefeProyecto() {
		return jefeProyecto;
	}

	public void setJefeProyecto(Empleado jefeProyecto) {
		this.jefeProyecto = jefeProyecto;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFinPrevisto() {
		return fechaFinPrevisto;
	}

	public void setFechaFinPrevisto(Date fechaFinPrevisto) {
		this.fechaFinPrevisto = fechaFinPrevisto;
	}

	public Date getFechaFinReal() {
		return fechaFinReal;
	}

	public void setFechaFinReal(Date fechaFinReal) {
		this.fechaFinReal = fechaFinReal;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	// REDEFINIMOS TOSTRING
	@Override
	public String toString() {
		return "Proyecto [idProyecto=" + idProyecto + ", descripcion=" + descripcion + ", fechaInicio=" + fechaInicio
				+ ", fechaFinPrevisto=" + fechaFinPrevisto + ", fechaFinReal=" + fechaFinReal + ", ventaPrevisto="
				+ ventaPrevisto + ", costePrevisto=" + costePrevisto + ", costeReal=" + costeReal + ", estado=" + estado
				+ ", jefeProyecto=" + jefeProyecto + ", cliente=" + cliente + "]";
	}

	// REDEFINIMOS HASHCOCE Y EQUALS
	@Override
	public int hashCode() {
		return Objects.hash(idProyecto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Proyecto))
			return false;
		Proyecto other = (Proyecto) obj;
		return Objects.equals(idProyecto, other.idProyecto);
	}
	
	//MÉTODOS PROPIOS FALTA PROBAR
	public double margenPrevisto() {
		 double margen = 0;
		 margen = this.ventaPrevisto - this.costePrevisto;
		 return margen;
	}
	
	public double margenReal() {
		 double margen = 0;
		 margen = this.ventaPrevisto - this.costeReal;
		 return margen;
	}
	
	public double diferenciaGastos() {
		 double diferencia = 0;
		 diferencia = this.costeReal - this.costePrevisto;
		 return diferencia;
	}
	
	//FALTA ESTE
	/*
	public int diferenciaFinPrevistoReal() {
		int diferencia = 0;
		SimpleDateFormat fechaF = new SimpleDateFormat("yyyy-mm-dd");
		Date fFinPr = this.fechaFinPrevisto;
		Date fFinRe = this.fechaFinPrevisto;
		Date fecha_inicio = fechaF.parse(fFinPr);
		Date fecha_fin = fechaF.parse(fFinFr);
		
		
		
		//diferencia = this.fechaFinPrevisto - this.fechaFinReal;
		return 0;
	}
	*/

}
