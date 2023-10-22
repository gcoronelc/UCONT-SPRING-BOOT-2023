package app.prueba;

import app.factory.VentaFactory;
import app.service.VentaService;

public class Prueba {
	
	public static void main(String[] args) {
		
		VentaService ventaService = VentaFactory.getVentaService();
		ventaService.insertar();
		
	}

}
