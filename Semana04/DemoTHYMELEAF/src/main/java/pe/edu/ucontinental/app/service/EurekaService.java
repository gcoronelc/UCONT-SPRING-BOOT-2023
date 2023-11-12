package pe.edu.ucontinental.app.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import pe.edu.ucontinental.app.mappers.ClienteMapper;
import pe.edu.ucontinental.app.model.ClienteModel;

@Service
public class EurekaService {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Map<String, Object>> getClientes(String paterno, String materno){
		String sql = "select chr_cliecodigo codigo, vch_cliepaterno paterno,";
		sql += "vch_cliematerno materno, vch_clienombre nombre,";
		sql += "chr_cliedni dni, vch_clieemail email ";
		sql += "from cliente ";
		sql += "where UPPER(vch_cliepaterno) like ? and vch_cliematerno like ?";
		paterno = "%" + paterno.toUpperCase() + "%";
		materno = "%" + materno + "%";
		return jdbcTemplate.queryForList(sql,paterno,materno);
	}
	
	public List<ClienteModel> getClientes2(String paterno, String materno){
		String sql = "select chr_cliecodigo id, vch_cliepaterno paterno,";
		sql += "vch_cliematerno materno, vch_clienombre nombre,";
		sql += "chr_cliedni dni, vch_clieemail email ";
		sql += "from cliente ";
		sql += "where vch_cliepaterno like ? and vch_cliematerno like ?";
		paterno = "%" + paterno + "%";
		materno = "%" + materno + "%";
		return jdbcTemplate.query(sql, new ClienteMapper(),paterno,materno);
	}
	
	public List<ClienteModel> getClientes3(String paterno, String materno){
		String sql = "select chr_cliecodigo codigo, vch_cliepaterno paterno,";
		sql += "vch_cliematerno materno, vch_clienombre nombre,";
		sql += "chr_cliedni dni, vch_clieemail email ";
		sql += "from cliente ";
		sql += "where UPPER(vch_cliepaterno) like ? and vch_cliematerno like ?";
		paterno = "%" + paterno.toUpperCase() + "%";
		materno = "%" + materno + "%";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<ClienteModel>(ClienteModel.class),paterno,materno);
	}

}
