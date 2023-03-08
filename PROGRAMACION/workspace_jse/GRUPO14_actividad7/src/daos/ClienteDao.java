package daos;

import java.util.List;

import javabeans.Cliente;

public interface ClienteDao {
	
	
	// declaración de métodos propios para las consultas sql
    List<Cliente> buscarTodos(); // devuelve todos los datos

    Cliente buscarUna(String cif); // busca un dato por cif

    int altaCliente(Cliente cliente); // agrega un cliente
     int eliminarCliente(String cif);
    //public List <Cliente>eliminarCliente(); // elimina un cliente
}


