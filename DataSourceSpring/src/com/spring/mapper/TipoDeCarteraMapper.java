package com.spring.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.model.TipoDeCartera;

public class TipoDeCarteraMapper implements RowMapper<TipoDeCartera> {

	@Override
	public TipoDeCartera mapRow(ResultSet arg0, int arg1) throws SQLException {
		TipoDeCartera tipoDeCartera = new TipoDeCartera();
		tipoDeCartera.setCodigo(arg0.getString("CODIGO"));
		tipoDeCartera.setNombre(arg0.getString("NOMBRE"));
		return tipoDeCartera;
	}

}
