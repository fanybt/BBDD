package javabeans;

import java.util.Date;

public class EmpleadosEnProyecto {
    private int numero_orden, id_empl, horas_asignadas;
    private String id_proyecto;
    private Date fecha_incorporacion;

    public EmpleadosEnProyecto() {
    }

    public EmpleadosEnProyecto(int numero_orden, int id_empl, int horas_asignadas, String id_proyecto, Date fecha_incorporacion) {
        this.numero_orden = numero_orden;
        this.id_empl = id_empl;
        this.horas_asignadas = horas_asignadas;
        this.id_proyecto = id_proyecto;
        this.fecha_incorporacion = fecha_incorporacion;
    }

    public double costeHorasAsignadas(){
        return horas_asignadas * numero_orden;
    }

    public int getNumero_orden() {
        return numero_orden;
    }

    public void setNumero_orden(int numero_orden) {
        this.numero_orden = numero_orden;
    }

    public int getId_empl() {
        return id_empl;
    }

    public void setId_empl(int id_empl) {
        this.id_empl = id_empl;
    }

    public int getHoras_asignadas() {
        return horas_asignadas;
    }

    public void setHoras_asignadas(int horas_asignadas) {
        this.horas_asignadas = horas_asignadas;
    }

    public String getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(String id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public Date getFecha_incorporacion() {
        return fecha_incorporacion;
    }

    public void setFecha_incorporacion(Date fecha_incorporacion) {
        this.fecha_incorporacion = fecha_incorporacion;
    }
}
