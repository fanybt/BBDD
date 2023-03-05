package javabeans;

import java.util.Date;

public class Empleado {
    private int id_empl;
    private String nombre, apellidos, email, password;
    private char genero;
    private double salario;
    private Date fecha_ingreso, fecha_nacimiento;

    public Empleado() {
    }

    public Empleado(int id_empl, String nombre, String apellidos, char genero, String email, String password, double salario, Date fecha_ingreso, Date fecha_nacimiento) {
        this.id_empl = id_empl;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.genero = genero;
        this.email = email;
        this.password = password;
        this.salario = salario;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public double salarioBruto(){
        return salario * 12;
    }

    public double salarioMensual(int meses){
        return salario * meses;
    }

    public String literalSexo(){
        String sexo = "";
        if(genero == 'H'){
            sexo = "Hombre";
        }else {
            sexo = "Mujer";
        }
        return sexo;
    }

    public String obtenerEmail(){
        return nombre.split("")[0] + apellidos.split("")[0] + "@gmail.com";
    }

    public String nombreComopleto(){
        return nombre + " " + apellidos;
    }

    public int getId_empl() {
        return id_empl;
    }

    public void setId_empl(int id_empl) {
        this.id_empl = id_empl;
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

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
}
