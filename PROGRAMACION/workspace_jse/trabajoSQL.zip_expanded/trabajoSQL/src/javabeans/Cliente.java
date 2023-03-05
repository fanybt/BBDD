package javabeans;

public class Cliente {
    private String cif, nombre, apellidos, domicilio;
    private double facturacion_anual;
    private int numero_empleados;

    public Cliente() {
    }

    public Cliente(String cif, String nombre, String apellidos, String domicilio, double facturacion_anual, int numero_empleados) {
        this.cif = cif;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.domicilio = domicilio;
        this.facturacion_anual = facturacion_anual;
        this.numero_empleados = numero_empleados;
    }

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

    public double getFacturacion_anual() {
        return facturacion_anual;
    }

    public void setFacturacion_anual(double facturacion_anual) {
        this.facturacion_anual = facturacion_anual;
    }

    public int getNumero_empleados() {
        return numero_empleados;
    }

    public void setNumero_empleados(int numero_empleados) {
        this.numero_empleados = numero_empleados;
    }
}
