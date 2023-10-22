package app.service;

import app.dao.VentaDaoApi;

public class VentaService implements VentaServiceApi{
	
	private VentaDaoApi ventaDao;
	
	public VentaService() {
	}
	
	@Override
	public void injectVentaDao(VentaDaoApi ventaDao) {
		this.ventaDao = ventaDao;
	}
	
	public void insertar() {
		ventaDao.insertar();
	}

}
