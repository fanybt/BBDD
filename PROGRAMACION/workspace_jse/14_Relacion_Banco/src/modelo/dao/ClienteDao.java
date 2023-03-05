package modelo.dao;

import java.util.ArrayList;

import modelo.javabeans.Cliente;
import modelo.javabeans.Oficina;

public interface ClienteDao {
	
	boolean alta (Cliente cliente);
	Cliente buscarUno (String idCliente);
	ArrayList<Cliente>buscarTodos();
	ArrayList<Cliente>buscarClientesOficina(int idOficina);

}
