package empleadosalario;

public class EmpleadoMain {

	public static void main(String[] args) {
		
		
		Empleado uno = new Empleado (3,45,"Pablo","Torres Ayala ","pablo@mmmm.com",1000,120,'h');
		Empleado dos = new Empleado ();
		
		System.out.println(uno.salarioBruto());
		System.out.println(uno.salarioMensual(12));
		System.out.println(uno.literalSexo());
		System.out.println(uno.obtenerEmail());
		System.out.println(uno.nombreCompleto());
		
		
		
		
		
		
		
		dos.setEmpleado(4);
		dos.setIdDepartamento(22);
		dos.setNombre("Antonio");
		dos.setApellidos("martin raboso");
		dos.setEmail("martin@nnnn.es");
		dos.setSalario(12000);
		dos.setComplemento(200);
		dos.setSexo('h');
		System.out.println(dos.toString());
		
	}

}
