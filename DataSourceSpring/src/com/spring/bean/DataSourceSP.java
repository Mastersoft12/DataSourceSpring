package com.spring.bean;

import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jndi.JndiObjectFactoryBean;
import org.springframework.stereotype.Component;

@Component("dataSourceSP")
public class DataSourceSP implements IDataSourceSp {
	
	@Bean
	public DataSource dataSource() throws IllegalArgumentException, NamingException {
		JndiObjectFactoryBean jndiObjectFB = new JndiObjectFactoryBean();
		jndiObjectFB.setJndiName("jndi_cun");
		jndiObjectFB.setResourceRef(true);
		jndiObjectFB.setProxyInterface(javax.sql.DataSource.class);
		jndiObjectFB.afterPropertiesSet();
		return  (DataSource)jndiObjectFB.getObject();
	}

	
	
}
