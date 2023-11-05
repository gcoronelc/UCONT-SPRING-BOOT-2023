package pe.edu.ucontinental.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Producto {
	
	private Integer id;
	private String nombre;
	private Double precio;
	private Integer stock;

}
