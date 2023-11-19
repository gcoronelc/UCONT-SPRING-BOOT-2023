package pe.edu.ucont.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.ucont.app.entity.Categoria;
import pe.edu.ucont.app.repository.CategoriaRepository;
import pe.edu.ucont.app.service.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Override
	public List<Categoria> listarTodos() {
		List<Categoria> lista = (List<Categoria>) categoriaRepository.findAll();
		return lista;
	}

}
