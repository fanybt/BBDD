package modelo.dao;


import java.util.List;

import modelo.javabeans.Persona;

public interface InstitutoDao {
	boolean altaPersona (Persona persona);
	Persona buscarPersona (String nif );
	List<Persona> buscarTodas();
	boolean aliminarPersona(Persona persona);
	List<Persona> buscarPersonasPorTipo(String tipoPersona);
	

}
