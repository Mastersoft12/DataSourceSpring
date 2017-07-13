package com.spring.bean;

import javax.naming.NamingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring.mapper.TipoDeCarteraMapper;
import com.spring.model.TipoDeCartera;

@Component("tipoDeCarteraDao")
public class TipoDeCarteraDao implements ITipoDeCartera {
	
	@Autowired
    @Qualifier("dataSourceSP")
    IDataSourceSp dataSource;
	
	@Autowired
    @Qualifier("jdbcTemplateConexion")
	private JdbcTemplateConexion jdbcTemplateConexion;

	public TipoDeCartera ObtenerTipoDeCartera(String codigo){
		String sql = "SELECT * FROM TIPOS_DE_CARTERA WHERE CODIGO = ?";
		TipoDeCartera  tipoDeCartera = null;
		JdbcTemplate jdbcTemplateObject;
		try {
			tipoDeCartera = jdbcTemplateConexion.obtenerJdbcTemplate().queryForObject(sql, new Object[]{codigo}, new TipoDeCarteraMapper());
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (NamingException e) {
			e.printStackTrace();
		}
		
		return tipoDeCartera;
		
	}
	
}
