package app.service;

import app.dao.VentaDaoApi;

public class VentaService {
	
	private VentaDaoApi ventaDao;
	
	public VentaService(VentaDaoApi ventaDao) {
		this.ventaDao = ventaDao;
	}
	
	public void insertar() {
		ventaDao.insertar();
	}

}
