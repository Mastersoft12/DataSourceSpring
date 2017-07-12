package com.spring.controller;

import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.bean.IusuarioCosto;
import com.spring.model.UsuarioCentroCosto;


@Controller
public class UsuarioCentroCostoController {
	
	@Autowired
    @Qualifier("usuarioCentroCostoDao")
	IusuarioCosto usuarioCentroCostoDao;

    private List<UsuarioCentroCosto> listUsuarioCosto;
	
	@RequestMapping( value = "/usuarioCosto", method=RequestMethod.GET)
	public String buscarUsuarioCosto(Model model){
		model.addAttribute(new UsuarioCentroCosto());
		return "BuscarUsuarioCosto";
	}
	
	@RequestMapping( value = "/usuarioCosto", method=RequestMethod.POST)
	public String registarPersona(UsuarioCentroCosto usuarioCentroCosto){
		try {
			UsuarioCentroCosto user = usuarioCentroCostoDao.buscarUsuarioCentroCostoPorUsuario(usuarioCentroCosto.getUsuarioRed());
			if(null != user){
				listUsuarioCosto = new ArrayList<>();
				this.listUsuarioCosto.add(user);
			}
		} catch (IllegalArgumentException | NamingException e) {
			e.printStackTrace();
		} 
		return "redirect:/UsuarioCostoAll/";
		
	}
	
	@RequestMapping( value = "/UsuarioCostoAll", method=RequestMethod.GET)
	public String buscarPersonaAll(Model model ){
		 model.addAttribute("UsuarioCostoList",listUsuarioCosto);
		 return "UsuarioCostoAll";
	}
	

	public List<UsuarioCentroCosto> getListUsuarioCosto() {
		return listUsuarioCosto;
	}

	public void setListUsuarioCosto(List<UsuarioCentroCosto> listUsuarioCosto) {
		this.listUsuarioCosto = listUsuarioCosto;
	}
	
	
}
