package javabeans;

import java.util.Date;
import java.util.Objects;

public class Proyecto {
	 // variables propias que coinciden con las de la tabla de la bbdd

    private String id_proyecto, descripcion, estado, cif;
    private Date fecha_inicio, fecha_fin_previsto, fecha_fin_real;
    private double venta_previsto, costes_previsto, coste_real;
    private int jefe_proyecto;

    public Proyecto() {
    }

    public Proyecto(String id_proyecto, String descripcion, String estado, String cif, Date fecha_inicio, Date fecha_fin_previsto, Date fecha_fin_real, double venta_previsto, double costes_previsto, double coste_real, int jefe_proyecto) {
        this.id_proyecto = id_proyecto;
        this.descripcion = descripcion;
        this.estado = estado;
        this.cif = cif;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin_previsto = fecha_fin_previsto;
        this.fecha_fin_real = fecha_fin_real;
        this.venta_previsto = venta_previsto;
        this.costes_previsto = costes_previsto;
        this.coste_real = coste_real;
        this.jefe_proyecto = jefe_proyecto;
    }

    public double margenPrevisto(){
        return coste_real - costes_previsto;
    }

    public double margenReal(){
        return coste_real - venta_previsto;
    }

    public double diferenciaGastos(){
        return 0.0;
    }

    public int diferenciaFinPrevistoReal(){
        return fecha_fin_previsto.compareTo(fecha_fin_real);
    }

    public String getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(String id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin_previsto() {
        return fecha_fin_previsto;
    }

    public void setFecha_fin_previsto(Date fecha_fin_previsto) {
        this.fecha_fin_previsto = fecha_fin_previsto;
    }

    public Date getFecha_fin_real() {
        return fecha_fin_real;
    }

    public void setFecha_fin_real(Date fecha_fin_real) {
        this.fecha_fin_real = fecha_fin_real;
    }

    public double getVenta_previsto() {
        return venta_previsto;
    }

    public void setVenta_previsto(double venta_previsto) {
        this.venta_previsto = venta_previsto;
    }

    public double getCostes_previsto() {
        return costes_previsto;
    }

    public void setCostes_previsto(double costes_previsto) {
        this.costes_previsto = costes_previsto;
    }

    public double getCoste_real() {
        return coste_real;
    }

    public void setCoste_real(double coste_real) {
        this.coste_real = coste_real;
    }

    public int getJefe_proyecto() {
        return jefe_proyecto;
    }

    public void setJefe_proyecto(int jefe_proyecto) {
        this.jefe_proyecto = jefe_proyecto;
    }

	@Override
	public String toString() {
		return "Proyecto [id_proyecto=" + id_proyecto + ", descripcion=" + descripcion + ", estado=" + estado + ", cif="
				+ cif + ", fecha_inicio=" + fecha_inicio + ", fecha_fin_previsto=" + fecha_fin_previsto
				+ ", fecha_fin_real=" + fecha_fin_real + ", venta_previsto=" + venta_previsto + ", costes_previsto="
				+ costes_previsto + ", coste_real=" + coste_real + ", jefe_proyecto=" + jefe_proyecto + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_proyecto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Proyecto other = (Proyecto) obj;
		return Objects.equals(id_proyecto, other.id_proyecto);
	}
    
}


