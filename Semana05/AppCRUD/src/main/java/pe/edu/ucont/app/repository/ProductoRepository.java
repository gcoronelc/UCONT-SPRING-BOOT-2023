package pe.edu.ucont.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.edu.ucont.app.entity.Producto;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long>{

}
