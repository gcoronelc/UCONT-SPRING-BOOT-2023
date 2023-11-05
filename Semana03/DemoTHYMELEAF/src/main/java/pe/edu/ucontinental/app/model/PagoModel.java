package pe.edu.ucontinental.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class PagoModel {
	
	// Datos de entrada
	private Integer horas;
	private Double pagoHora;
	private Integer hijos;
	
	// Calculos
	private Double salario;
	private Double asignacion;
	private Double bono;
	private Double ingresos;
	private Double renta;
	private Double neto;

}
