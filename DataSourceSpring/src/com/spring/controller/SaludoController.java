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
import com.spring.bean.UsuarioCentroCostoDao;
import com.spring.model.UsuarioCentroCosto;

@Controller
public class SaludoController {
	
	
    @Autowired()
    UsuarioCentroCostoDao usuarioCentroCostoDao;
	
	@RequestMapping( value =  "/", method=RequestMethod.GET)
	public String home(Model model){
		 UsuarioCentroCosto usuario = null;
		 try {
			usuario = 	usuarioCentroCostoDao.buscarUsuarioCentroCostoPorUsuario("FRALLOPE");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (NamingException e) {
			e.printStackTrace();
		}			
			return "saludo";
	}

}
