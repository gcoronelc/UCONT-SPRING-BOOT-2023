package pe.edu.ucontinental.app.repository;

import org.springframework.data.repository.CrudRepository;

import pe.edu.ucontinental.app.model.Mensaje;

public interface MensajeRepository extends CrudRepository<Mensaje, Long>{
	
	
	Iterable<Mensaje> findByDe(String de);

}
