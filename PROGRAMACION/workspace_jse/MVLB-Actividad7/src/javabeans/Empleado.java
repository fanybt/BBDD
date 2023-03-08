package javabeans;

import java.sql.Date;
import java.util.Objects;

public class Empleado {

	//DATOS PRIVADOS
	private int idEmpl;
	private String nombre, apellidos;
	private char genero;
	private String email, password;
	private double salario;
	private Date fechaIngreso, fechaNacimiento;
	private Perfil perfil;
	private Departamento departamento;
	
	//CONSTRUCTORES SIN NADA Y CON TODO
	public Empleado() {
		super();
	}

	public Empleado(int idEmpl, String nombre, String apellidos, char genero, String email, String password,
			double salario, Date fechaIngreso, Date fechaNacimiento, Perfil perfil, Departamento departamento) {
		super();
		this.idEmpl = idEmpl;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.genero = genero;
		this.email = email;
		this.password = password;
		this.salario = salario;
		this.fechaIngreso = fechaIngreso;
		this.fechaNacimiento = fechaNacimiento;
		this.perfil = perfil;
		this.departamento = departamento;
	}



	//GETTER AND SETTER
	public int getIdEmpl() {
		return idEmpl;
	}

	public void setIdEmpl(int idEmpl) {
		this.idEmpl = idEmpl;
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

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	// REDEFINIMOS TOSTRING
	@Override
	public String toString() {
		return "Empleado [idEmpl=" + idEmpl + ", nombre=" + nombre + ", apellidos=" + apellidos + ", genero=" + genero
				+ ", email=" + email + ", password=" + password + ", salario=" + salario + ", fechaIngreso="
				+ fechaIngreso + ", fechaNacimiento=" + fechaNacimiento + ", perfil=" + perfil + ", departamento="
				+ departamento + "]";
	}

	// REDEFINIMOS HASHCOCE Y EQUALS
	@Override
	public int hashCode() {
		return Objects.hash(idEmpl);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Empleado))
			return false;
		Empleado other = (Empleado) obj;
		return idEmpl == other.idEmpl;
	}
	
	//MÉTODOS PROPIOS
	//salarioBruto() : double. Devolver la suma del salario y el complemento
	public double salarioBruto () {
		 return this.salario;
	}
		
	//salarioMensual(int meses) : double. Devolvemos salario mensual
	public double salarioMensual (int meses) {
		return this.salario / meses;
	}
		
	//literalSexo() : String. H -> “Hombre”, M -> “Mujer”. Devolvemos si es hombre o mujer
	public String literalSexo () {
		String sexo= " ";
		if (this.genero=='h'|| this.genero=='H') {
			sexo = "hombre";
				
		}
		else if (this.genero=='m'|| this.genero =='M') {
			sexo = "mujer";
		}
		else {
			sexo = "nulo" ;
		}
		return sexo;
	}
		
	//obtenerEmail() : String. Devolver un String con la primera letra del nombre + primer apellido, en minúsculas.
	public String obtenerEmail() {
		String letraNom = "";
		String primerAp = "";
				
		//obtenemos la primera letra del nombre
		letraNom = String.valueOf(this.nombre.charAt(0));
			
		//obtenemos primer apellido
		for (int i=0; i < this.apellidos.length() && this.apellidos.charAt(i) != ' '; i++)
				primerAp += this.apellidos.charAt(i);
			
		return letraNom.toLowerCase() + primerAp.toLowerCase() +"@empleado.com";
	}
		
	//nombreCompleto(): String. Devolver la concatenación del nombre + “ “ + apellidos
	public String nombreCompleto() {
		return this.nombre + " " + this.apellidos;
	}
	
}
