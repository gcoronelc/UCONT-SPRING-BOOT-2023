package pe.edu.ucontinental.app.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import pe.edu.ucontinental.app.model.ClienteModel;

public class ClienteMapper implements RowMapper<ClienteModel>{

	@Override
	public ClienteModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		ClienteModel model = new ClienteModel();
		model.setCodigo(rs.getString("id"));
		model.setPaterno(rs.getString("paterno"));
		model.setMaterno(rs.getString("materno"));
		model.setNombre(rs.getString("nombre"));
		return model;
	}

}
