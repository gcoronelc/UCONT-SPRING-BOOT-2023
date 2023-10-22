package pe.edu.ucontinental.demo02.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.ucontinental.demo02.dao.ProductoDao;

@Service
public class ProductoService {

	@Autowired
	private ProductoDao productoDao;
	
	public void registrar() {
		productoDao.registrar();
	}
	
}
