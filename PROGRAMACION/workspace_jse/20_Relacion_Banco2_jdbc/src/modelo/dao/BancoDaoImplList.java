package modelo.dao;

import java.util.ArrayList;

import modelo.javabeans.Oficina;

public class BancoDaoImplList implements BancoDao {
	
	private String nombre;
	private ArrayList <Oficina> listaOficinas;
	public BancoDaoImplList(String nombre) {
		
		this.nombre = nombre;
		listaOficinas =new ArrayList();
		cargarDatos();
		
	}
	
	
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	private void cargarDatos() {
		listaOficinas.add(new Oficina(9001,"madrid 1" ,"c/Ayala 40", "madrid", "912545758"));
		listaOficinas.add(new Oficina(9002,"madrid 2" ,"c/vicente ferrer 12", "alcala", "912578158"));
		listaOficinas.add(new Oficina(9003,"barcelona 1" ,"c/ramal central 34", "barcelona", "932545758"));
		listaOficinas.add(new Oficina(9004,"barcelona 2" ,"c/puig 11", "barcelona", "932745128"));
	}



	@Override
	public boolean altaOficina(Oficina oficina) {
		if (listaOficinas.contains(oficina)){
			return false;
		}else {
			return listaOficinas.add(oficina);
		}
		
	}



	@Override
	public boolean eliminarOficina(Oficina oficina) {
		
		return listaOficinas.remove(oficina);
		
	}



	@Override
	public Oficina eliminarOficina(int postRelativa) {
		if (postRelativa >= listaOficinas.size())
		return null;
		return listaOficinas.remove(postRelativa);
	}



	@Override
	public Oficina modificarOficina(Oficina oficina) {
		int posicion = listaOficinas.indexOf(oficina);
		if ( posicion == -1)
		return null;
		
		return listaOficinas.set(posicion, oficina);
		
		
	}



	@Override
	public Oficina buscarUna(int idOficina) {
		Oficina of = new Oficina();
		of.setIdOficina(idOficina);
		
		int posicion = listaOficinas.indexOf(of);
		if ( posicion == -1)
		return null;
		
		return listaOficinas.get(posicion);
		
		
		
	}



	@Override
	public ArrayList<Oficina> buscarTodos() {
		// TODO Auto-generated method stub
		return listaOficinas;
	}



	@Override
	public ArrayList<Oficina> buscarPorPrefijo(String prefijo) {
		ArrayList<Oficina> aux =new ArrayList();
		for(Oficina oficina : listaOficinas){
			if (oficina.getTelefono().substring(0, prefijo.length()).equals(prefijo)) 
				aux.add(oficina);
		
	}
		return aux;
	}


	



	@Override
	public ArrayList<Oficina> buscarPorCiudad(String ciudad) {
		ArrayList<Oficina> aux =new ArrayList();
		for(Oficina oficina : listaOficinas){
			if (oficina.getCiudad().equalsIgnoreCase(ciudad)) 
				aux.add(oficina);
				
				
			}
		
		return aux;
	}

}
