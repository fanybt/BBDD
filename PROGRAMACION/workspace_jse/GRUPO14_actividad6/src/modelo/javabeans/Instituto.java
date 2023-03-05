package modelo.javabeans;

import java.util.ArrayList;
import java.util.List;

import modelo.dao.InstitutoDao;

public class Instituto implements InstitutoDao {
	
	ArrayList<Persona> personas = new ArrayList();
	
	
	

	public Instituto() {
		super();
	}
	
	

	public ArrayList<Persona> getPersonas() {
		return personas;
	}



	public void setPersonas(ArrayList<Persona> personas) {
		this.personas = personas;
	}

	
	


	@Override
	public boolean altaPersona(Persona persona) {
		personas.add(persona);
		return true;
	}

	@Override
	public Persona buscarPersona(String nif) {
		Persona p = null;
		for(Persona result : personas) {
			if (nif.equals(result.getNif())) {
				p=result;
				
			}
		}
		return p;
		
		
	}

	@Override
	public List<Persona> buscarTodas() {
		
		return personas;
	}

	@Override
	public boolean aliminarPersona(Persona persona) {
	     personas.remove(persona);
		return true;
	}

	@Override
	public List<Persona> buscarPersonasPorTipo(String tipoPersona) {
		List<Persona> aux = new ArrayList<Persona>();
		
		for(Persona result : personas) {
			System.out.println(result.toString());
			 if (result instanceof Profesor && tipoPersona.equals("Profesor")){
				aux.add(result);
				
				
			} else if(result instanceof Alumno && tipoPersona.equals("Alumno")){
				aux.add(result);
				
				
			} else if(result instanceof Administrativo && tipoPersona.equals("Administrativo")){
				aux.add(result);
			}
			 
		
		
	}
		return aux;
}}
