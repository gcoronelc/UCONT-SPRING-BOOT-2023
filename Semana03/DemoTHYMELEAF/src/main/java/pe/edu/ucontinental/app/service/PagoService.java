package pe.edu.ucontinental.app.service;

import org.springframework.stereotype.Service;

import pe.edu.ucontinental.app.model.PagoModel;

@Service
public class PagoService {

	
	public PagoModel procesar(PagoModel bean) {
		// Proceso
		 
		
		// Reporte
		bean.setSalario(500.00);
		bean.setAsignacion(500.00);
		bean.setNeto(500.00);
		bean.setIngresos(500.00);
		bean.setRenta(500.00);
		bean.setBono(500.00);
		return bean;
	}
	
}
