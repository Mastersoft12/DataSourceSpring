package com.spring.controller;

import java.sql.SQLException;

import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.bean.DataSourceSP;
import com.spring.bean.IDataSourceSp;

@Controller
public class SaludoController {
	
	
    @Autowired
    @Qualifier("dataSourceSP")
    IDataSourceSp dataSource;
	
	@RequestMapping( value =  "/", method=RequestMethod.GET)
	public String home(Model model){
		 
			  try {
				dataSource.dataSource().getConnection();
			} catch (IllegalArgumentException | NamingException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return "saludo";
	}

}
