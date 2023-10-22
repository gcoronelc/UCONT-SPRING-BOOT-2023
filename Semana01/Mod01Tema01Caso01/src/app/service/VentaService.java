package app.service;

import app.dao.VentaDaoApi;

public class VentaService {
	
	private VentaDaoApi ventaDao;
	
	public void setVentaDao(VentaDaoApi ventaDao) {
		this.ventaDao = ventaDao;
	}
	
	public void insertar() {
		ventaDao.insertar();
	}

}
