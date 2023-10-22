package pe.edu.ucontinental.demo02.service;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import pe.edu.ucontinental.demo02.dao.ProductoDao;

@Named
public class ProductoService {

	@Inject
	private ProductoDao productoDao;
	
	public void registrar() {
		productoDao.registrar();
	}
	
}
