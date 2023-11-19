package pe.edu.ucont.app.service;

import java.util.List;

import pe.edu.ucont.app.entity.Producto;

public interface ProductoService {

	List<Producto> listarTodos();

	void grabar(Producto producto);

	Producto buscarPorId(Long id);

	void eliminar(Long id);
	
}
