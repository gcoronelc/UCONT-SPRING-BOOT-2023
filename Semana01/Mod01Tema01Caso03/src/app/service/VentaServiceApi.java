package app.service;

import app.dao.VentaDaoApi;

public interface VentaServiceApi {
	
	void injectVentaDao(VentaDaoApi ventaDao);
	
}
