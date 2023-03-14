package modelo.dao;

import java.util.ArrayList;

import modelo.javabeans.Departamento;
import modelo.javabeans.Empleado;
import modelo.javabeans.Localidad;

import modelo.javabeans.Trabajo;

public class EmpresaDaoImplList implements IntGestionEmpresa{
	
	//Atributos privados
	private String nombre;
	private ArrayList<Empleado>listaEmpleados;
	private ArrayList<Trabajo>listaTrabajos;
	private ArrayList<Departamento>listaDepartamentos;
	
	//Constructor
	public EmpresaDaoImplList(String nombre) {
		this.nombre = nombre;
		listaEmpleados = new ArrayList();
		listaTrabajos = new ArrayList();
		listaDepartamentos = new ArrayList();
		cargarDatos();
	}
	
	//Método para cargar datos
	private void cargarDatos() {
		Localidad loc1 = new Localidad(11, "c/Hortensia 1", "Madrid", "España");
		Localidad loc2 = new Localidad(12,"C/Las flores","Sevilla","España");
		Localidad loc3 = new Localidad(13,"c/san miguel","Barcelona","España");
		Trabajo tra1 = new Trabajo("20a","Secretario",800 , 1000);
		Trabajo tra2 = new Trabajo("21b","Docente",900, 1200);
		Trabajo tra3 = new Trabajo("22c","Jefe estudios",1500, 2000);
		Trabajo tra4 = new Trabajo("23d","Limpiadora",700, 900);
		Trabajo tra5 = new Trabajo("24e","Conserje",800, 1000);
		Departamento dep1 = new Departamento(5, "Direccion", loc1);
		Departamento dep2 = new Departamento(3, "Docencia", loc3);
		Departamento dep3 = new Departamento(4, "Docencia", loc2);
		Departamento dep4 = new Departamento(6, "Administracion", loc1);
		Departamento dep5 = new Departamento(7, "servicios", loc3);
		Departamento dep6 = new Departamento(8, "servicios", loc2);
		
		listaEmpleados.add(new Empleado(111, "Ana", "Morales Nieves","anam@gmail.com", 10000, 5, 'm', tra2, dep3));
		listaEmpleados.add(new Empleado(112, "Antonio", "Torres Martin","ant@gmail.com", 10000, 5, 'H', tra2, dep3));
		listaEmpleados.add(new Empleado(113, "Cesar", "Garcia Camacho","ce@gmail.com", 25000, 1, 'h', tra3, dep1));
		listaEmpleados.add(new Empleado(114, "Sara", "Martin Ayala","sm@gmail.com", 9000,1 , 'm', tra4, dep6));
		listaEmpleados.add(new Empleado(115, "Miriam", "Ballesteros Nieves","mb@gmail.com", 10000, 1, 'm', tra1, dep1));
		listaEmpleados.add(new Empleado(116, "Alberto", "Escudero Hidalgo","aeh@gmail.com", 10000, 1, 'h', tra5, dep6));
		listaEmpleados.add(new Empleado(117, "Maria", "Escanes Expósito","mee@gmail.com", 12000, 1, 'M', tra2, dep2));
		
		listaTrabajos.add(tra1);
		listaTrabajos.add(tra2);
		listaTrabajos.add(tra3);
		listaTrabajos.add(tra4);
		listaTrabajos.add(tra5);
		
		listaDepartamentos.add(dep1);
		listaDepartamentos.add(dep2);
		listaDepartamentos.add(dep3);
		listaDepartamentos.add(dep4);
		listaDepartamentos.add(dep5);
		listaDepartamentos.add(dep6);
		
	}
	
	//Getter and setter
	public String getNombre() {
		return nombre;
	}
		
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	//Método para dar de alta un empleado
	public boolean altaEmpleado(Empleado empleado) {
		if(listaEmpleados.contains(empleado))
			return false;
		else 
			return listaEmpleados.add(empleado);
	}
	
	//Método para eliminar un empleado
	@Override
	public boolean eliminarUno(Empleado empleado) {
		return listaEmpleados.remove(empleado);
	}
		
	//Método para modificar un empleado
	public boolean modificarUno(Empleado empleado) { 
		int posicion = listaEmpleados.indexOf(empleado); 
		if (posicion == -1) 
			return false; 
		else 
			listaEmpleados.set(posicion, empleado); 
		return true;
		}
	
	@Override
	//Método para buscar un empleado
	public Empleado buscarUna(int idEmpleado) {
	     Empleado of = new Empleado();
	     of.setIdEmpleado(idEmpleado);
	     int posicion = listaEmpleados.indexOf(of);
	     
	     if (posicion == -1)
	    	 return null;
	     return listaEmpleados.get(posicion);
	     
	}
	
	@Override
	//Método que devuelve todos los empleados
	public ArrayList<Empleado> buscarTodos() {
		return listaEmpleados;
	}
	
	@Override
	//Método que devuelve la suma de todos los salarios y comisiones de todos los empleados
	public double masaSalarial() {
		double suma = 0;
		
		for(Empleado ele : listaEmpleados)
			suma += ele.getComision() + ele.getSalario();
		return suma;
	}
	
	@Override
	//Método para buscar por departamento
	public ArrayList<Empleado> buscarPorDepartamento(int idDepartamento) {
		ArrayList<Empleado> aux = new ArrayList();
		for(Empleado ele : listaEmpleados) {
			if(ele.getDepartamento().getIdDepar() == idDepartamento)
				aux.add(ele);
		}
		return aux;
	}
	
	@Override
	//Método para buscar por trabajo
	public ArrayList<Empleado> buscarPorTrabajo(String idTrabajo) {
		ArrayList<Empleado> aux = new ArrayList();
		for(Empleado empleado : listaEmpleados) {
			if(empleado.getTrabajo().getIdTrabajo().equals(idTrabajo))
				aux.add(empleado);
		}
			return aux;
	}
	
	//Método para buscar por país
	@Override
	public ArrayList<Empleado> buscarPorPais(String pais) {
		ArrayList<Empleado> aux = new ArrayList();
		for(Empleado empleado : listaEmpleados) {
			if(empleado.getDepartamento().getLocalidad().getPais().equals(pais))
				aux.add(empleado);
		}
			return aux;
	}
		
	//Método para buscar por sexo
	@Override
	public ArrayList<Empleado> buscarPorSexo(String literalSexo) {
		ArrayList<Empleado>aux =new ArrayList();
		for(Empleado empleado : listaEmpleados) {
			if(empleado.literalSexo().equalsIgnoreCase(literalSexo))
				aux.add(empleado);
		}
		return aux;
	}
	
	//Otros métodos que hemos utilizado para poder añadir idTrabajo e idDepartamento en la clase Principal
	//Método para añadir trabajo
	public Trabajo buscarTrabajo(String idTrabajo ) {
    	Trabajo resultado = new Trabajo();
    	for(Trabajo ele: listaTrabajos) {
    		if(idTrabajo.equalsIgnoreCase(ele.getIdTrabajo()))
    			resultado=ele;
    	}
    	return resultado ;
    }
	
	//Método para añadir departamentos
    public Departamento buscarDepartamento(int idDepartamento ) {
    	Departamento resultado=new Departamento();
    	for(Departamento ele: listaDepartamentos) {
    		if(idDepartamento == ele.getIdDepar())
    			resultado=ele;
    	}
    	return resultado ;
    }
    
}
