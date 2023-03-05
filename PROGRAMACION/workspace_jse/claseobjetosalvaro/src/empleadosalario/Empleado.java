package empleadosalario;

public class Empleado {

	int empleado , idDepartamento ;
	String nombre,apellidos,email ;
	double salario,complemento;
	char sexo;
	public Empleado() {
		super();
	}
	public Empleado(int empleado, int idDepartamento, String nombre, String apellidos, String email, double salario,
			double complemento, char sexo) {
		super();
		this.empleado = empleado;
		this.idDepartamento = idDepartamento;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.salario = salario;
		this.complemento = complemento;
		this.sexo = sexo;
	}
	
	
		
		
	
	 public double salarioBruto () {
		 return salario + complemento;
	 }
	public double salarioMensual (int meses) {
		return salario / meses;
	}
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
	
	public String obtenerEmail() {
		return nombre.toLowerCase().charAt(0)+ apellidos.toLowerCase();
		
	}
	public String nombreCompleto() {
		return nombre + " " + apellidos ;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return "empleado: " + empleado +
	            "\nidEmpleado: " + idDepartamento +
	            "\nNombre: " + nombre +
	            "\nApellidos: " + apellidos +
	            "\nEmail: " + email +
	            "\nSexo: " + sexo +
	            "\nSalario: " + salario +
	            "\nComplemento: " + complemento;

		
		
	}
	public int getEmpleado() {
		return empleado;
	}
	public void setEmpleado(int empleado) {
		this.empleado = empleado;
	}
	public int getIdDepartamento() {
		return idDepartamento;
	}
	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
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
	public double getComplemento() {
		return complemento;
	}
	public void setComplemento(double complemento) {
		this.complemento = complemento;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	
	
	
}
