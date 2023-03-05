package daos;

import javabeans.Cliente;

import java.util.List;

public interface ClienteDao {
    List<Cliente> buscarTodos();

    Cliente buscarUna(int cif);

    int altaAlojamientos(Cliente cliente);
}
