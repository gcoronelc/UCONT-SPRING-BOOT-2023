package pe.edu.ucontinental.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class ClienteModel {

	private String codigo;
	private String paterno;
	private String materno;
	private String nombre;
	private String dni;
	private String ciudad;
	private String direccion;
	private String telefono;
	private String email;

}
