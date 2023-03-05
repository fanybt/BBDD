package modelo.dao;

import java.util.ArrayList;

import modelo.javabeans.Cliente;
import modelo.javabeans.Oficina;

public class ClienteDaoImplList implements ClienteDao{
	private ArrayList<Cliente>lista;
	
	public ClienteDaoImplList() {
		lista =new ArrayList<>();
		cargarDatos();
		
	}
    private void cargarDatos() {
    	BancoDaoImplList bdao =new BancoDaoImplList(null);
    	lista.add(new Cliente("502258H", "Eva", "Garcia", "c/luz 12", "e.garcia@gmail.com", bdao.buscarUna(9001)));
    	lista.add(new Cliente("511258X", "Antonio", "Herranz", "c/boiro 1", "antonio.g@gmail.com", bdao.buscarUna(9002)));
    	lista.add(new Cliente("002258Z", "Emma", "Gutierrez", "c/levante 10", "e.ggh@gmail.com", bdao.buscarUna(9003)));
    	
    	
    }
	@Override
	public boolean alta(Cliente cliente) {
		if (lista.contains(cliente)){
			return false;
		}else {
			return lista.add(cliente);
		}
		
	}
	@Override
	public Cliente buscarUno(String idCliente) {
		Cliente cliente = new Cliente();
		cliente.setIdCliente(idCliente);
		
		int posicion = lista.indexOf(cliente);
		if ( posicion == -1)
		return null;
		
		return lista.get(posicion);
		
	}
	@Override
	public ArrayList<Cliente> buscarTodos() {
		// TODO Auto-generated method stub
		return lista;
	}
	
	@Override
	public ArrayList<Cliente> buscarClientesOficina(int idOficina){
		ArrayList<Cliente> aux =new ArrayList();
		for(Cliente ele : lista){
			if (ele.getOficina().getIdOficina()== idOficina); 
				aux.add(ele);
		
	}
		return aux;
	}
	
	
    
}
