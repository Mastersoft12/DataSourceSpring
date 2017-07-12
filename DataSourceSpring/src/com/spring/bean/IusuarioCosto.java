package com.spring.bean;

import javax.naming.NamingException;

import com.spring.model.UsuarioCentroCosto;

public interface IusuarioCosto {
	
	public UsuarioCentroCosto buscarUsuarioCentroCostoPorUsuario(String Usuario) throws IllegalArgumentException, NamingException;

}
