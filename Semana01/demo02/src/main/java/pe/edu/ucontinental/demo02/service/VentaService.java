package pe.edu.ucontinental.demo02.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import pe.edu.ucontinental.demo02.dao.VentaDao;

@Service
public class VentaService {
	
	private String nombre;
	
	@Autowired
	private VentaDao ventaDao;
	
	@PostConstruct
	public void initObject() {
		this.nombre = "Gustavo";
	}
	
	
	public void registrarVenta() {
		System.err.println("Hola " + nombre);
		ventaDao.registrarVenta();
	}
}
