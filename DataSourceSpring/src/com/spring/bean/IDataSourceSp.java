package com.spring.bean;

import javax.naming.NamingException;
import javax.sql.DataSource;

public interface IDataSourceSp {
	public DataSource dataSource() throws IllegalArgumentException, NamingException;

}
