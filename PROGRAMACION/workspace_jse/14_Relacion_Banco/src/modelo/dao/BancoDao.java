package modelo.dao;

import java.util.ArrayList;

import modelo.javabeans.Oficina;

public interface BancoDao {
	
	boolean altaOficina(Oficina oficina);
	boolean eliminarOficina(Oficina oficina );
	Oficina eliminarOficina(int postRelativa);
	Oficina modificarOficina(Oficina oficina);
	Oficina buscarUna(int idOficina);
	ArrayList<Oficina>buscarTodos();
	ArrayList<Oficina>buscarPorPrefijo(String prefijo);
	ArrayList<Oficina>buscarPorCiudad(String ciudad);

}
