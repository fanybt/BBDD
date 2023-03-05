package modelo.javabeans;

import java.util.Objects;

public class Empleado {
	
	//Creamos atributos o datos privados
	private int idEmpleado  ;
	private String nombre,apellidos,email ;
	private double salario,comision;
	private char sexo;
	private Trabajo  trabajo;
	private Departamento departamento;
	
	//Constructores vacío y con todo
	public Empleado() {
		super();
	}
	 
	public Empleado(int idEmpleado, String nombre, String apellidos, String email, double salario, double comision,
			char sexo, Trabajo trabajo, Departamento departamento) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.salario = salario;
		this.comision = comision;
		this.sexo = sexo;
		this.trabajo = trabajo;
		this.departamento = departamento;
	}

	//Getter and setter de todo
	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Trabajo getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(Trabajo trabajo) {
		this.trabajo = trabajo;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	//Redefinir métodos de Object
	//toString
	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", email="
				+ email + ", salario=" + salario + ", comision=" + comision + ", sexo=" + sexo + ", trabajo=" + trabajo
				+ ", departamento=" + departamento + "]";
	}

	//Redefinir hashcode y equals
	//Dos empleados son iguales si su idEmpleado es el mismo.
	@Override
	public int hashCode() {
		return Objects.hash(idEmpleado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return idEmpleado == other.idEmpleado;
	}
	
	//MÉTODOS PROPIOS
	//salarioBruto() : double. Devolver la suma del salario y el complemento
	public double salarioBruto () {
		 return salario + comision;
	}
	
	//salarioMensual(int meses) : double
	public double salarioMensual (int meses) {
		return salario / meses;
	}
	
	//literalSexo() : String. H -> “Hombre”, M -> “Mujer”
	public String literalSexo () {
		String genero= " ";
		if (sexo=='h'|| sexo=='H') {
			genero = "hombre";
				
		}
		else if (sexo=='m'|| sexo =='M') {
			genero = "mujer";
		}
		else {
			genero = "nulo" ;
		}
		return genero;
	}
	
	//obtenerEmail() : String. Devolver un String con la primera letra del nombre + primer apellido, en minúsculas.
	public String obtenerEmail() {
		return nombre.toLowerCase().charAt(0)+ apellidos.toLowerCase();
	}
	
	//nombreCompleto(): String. Devolver la concatenación del nombre + “ “ + apellidos
	public String nombreCompleto() {
		return nombre + " " + apellidos ;
	}
	
		
}
	
	
	




