package modelo.dao;

import java.util.List;

import modelo.javabeans.Alojamientos;

public interface AlojamientoDao {
	// para implementar todo esto hace falta una interface//
	List <Alojamientos> buscarTodos();
	Alojamientos buscarUna(int codAlojamiento);
	int altaAlojamientos(Alojamientos alojamiento);

}
