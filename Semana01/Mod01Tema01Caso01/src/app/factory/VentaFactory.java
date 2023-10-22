package app.factory;

import app.dao.VentaDaoApi;
import app.dao.mysql.VentaDaoMySQL;
import app.dao.oracle.VentaDaoOracle;
import app.service.VentaService;

public class VentaFactory {

	private static final int DB_MYSQL = 1;
	private static final int DB_ORACLE = 2;

	private static final int DB_ACTUAL = DB_ORACLE;

	private VentaFactory() {
	}

	public static VentaService getVentaService() {
		VentaDaoApi ventaDao = null;
		switch (DB_ACTUAL) {
		case DB_MYSQL:
			ventaDao = new VentaDaoMySQL();
			break;
		case DB_ORACLE:
			ventaDao = new VentaDaoOracle();
			break;

		}
		VentaService ventaService = new VentaService();
		ventaService.setVentaDao(ventaDao);
		return ventaService;
	}

}
