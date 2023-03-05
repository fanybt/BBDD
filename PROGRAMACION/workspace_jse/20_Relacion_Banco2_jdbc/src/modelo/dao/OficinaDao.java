package modelo.dao;

import java.util.ArrayList;
import java.util.List;

import modelo.javabeans.Oficina;

public interface OficinaDao {
	//primer paso//
	
	int altaOficina(Oficina oficina);
	int eliminarOficina(int idOficina );
	int modificarOficina(Oficina oficina);
	Oficina buscarUna(int idOficina);
	List<Oficina>buscarTodos();
	List<Oficina>buscarPorPrefijo(String prefijo);
    List<Oficina>buscarPorCiudad(String ciudad);
    
    
    

}
