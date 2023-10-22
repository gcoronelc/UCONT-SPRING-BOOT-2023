package app.dao.mysql;

import app.dao.VentaDaoApi;

public class VentaDaoMySQL implements VentaDaoApi {

	@Override
	public void insertar() {
		System.out.println("Registro insertado en MySQL");
	}

}
