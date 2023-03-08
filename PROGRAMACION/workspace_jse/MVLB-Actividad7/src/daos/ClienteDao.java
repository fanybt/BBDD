package daos;

import java.util.List;

import javabeans.Cliente;

public interface ClienteDao {
	
	//CRUD
	int altaCliente (Cliente cliente);
	Cliente buscarUno (String cif);
	int modificarCliente (Cliente cliente);
	int eliminarCliente (Cliente cliente);
	List<Cliente> buscarTodos();

}
