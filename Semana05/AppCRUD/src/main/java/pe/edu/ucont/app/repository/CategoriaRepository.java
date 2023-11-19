package pe.edu.ucont.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.edu.ucont.app.entity.Categoria;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Long>{

}
