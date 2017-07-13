package com.spring.bean;

import javax.naming.NamingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("jdbcTemplateConexion")
public class JdbcTemplateConexion {

	@Autowired
    @Qualifier("dataSourceSP")
    private IDataSourceSp dataSource;
	
	
	public JdbcTemplate obtenerJdbcTemplate() throws IllegalArgumentException, NamingException{
		return new JdbcTemplate(dataSource.dataSource());
	}
}
