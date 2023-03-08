package daos;

import java.util.List;

import javabeans.Perfil;

public interface PerfilDao {
	
	int altaPerfil (Perfil perfil);
	Perfil buscarUno (int idPerfil);
	int modificarPerfil (Perfil perfil);
	int eliminarPerfil (Perfil perfil);
	List<Perfil> buscarTodos();

}
