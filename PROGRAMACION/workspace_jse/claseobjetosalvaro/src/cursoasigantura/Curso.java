package cursoasigantura;

import java.util.*;

public class Curso {
	int alumnos = 0;
	int horas = 0; 
	String nombrecurso = " ";
	
	
	//Asignatura[] listaasignaturas = new Asignatura[10];
	ArrayList<Asignatura> listaasignatura = new ArrayList<Asignatura>();
	


	public Curso() {
		super();
	}


	public Curso( String nombrecurso , int alumnos) {
		super();
		this.alumnos = alumnos;
		this.horas = horas;
		this.nombrecurso = nombrecurso;
		this.listaasignatura = listaasignatura;
	}
	
	public void agregarasignatura (Asignatura asignatura) {
		listaasignatura.add(asignatura);
		horas+= asignatura.getHoras();
	}
	
	public void mostrarDatos () {
		System.out.println("nombre : "+ nombrecurso);
		System.out.println(" horas : "+ horas);
		System.out.println(" alumnos : "+ alumnos);
		
		for (int i=0; i<listaasignatura.size();i++) {
			System.out.println("-"+listaasignatura.get(i).getNombre());
		}
	}


	public int getAlumnos() {
		return alumnos;
	}


	public void setAlumnos(int alumnos) {
		this.alumnos = alumnos;
	}


	public int getHoras() {
		return horas;
	}


	public void setHoras(int horas) {
		this.horas = horas;
	}


	public String getNombrecurso() {
		return nombrecurso;
	}


	public void setNombrecurso(String nombrecurso) {
		this.nombrecurso = nombrecurso;
	}


	public ArrayList<Asignatura> getListaasignatura() {
		return listaasignatura;
	}


	public void setListaasignatura(ArrayList<Asignatura> listaasignatura) {
		this.listaasignatura = listaasignatura;
	}
	

}
