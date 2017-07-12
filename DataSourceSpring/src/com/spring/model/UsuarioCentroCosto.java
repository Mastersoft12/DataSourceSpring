package com.spring.model;

import java.util.Date;

public class UsuarioCentroCosto {
	
	private String centroCosto;
	
	private Date fechaCreacion;
	
	private String habilitadi;
	
	private String usuarioCreador;
	
	private String usuarioRed;
	
	

	public UsuarioCentroCosto() {
		
	}

	public UsuarioCentroCosto(String centroCosto, String habilitadi, String usuarioCreador, String usuarioRed) {
		this.centroCosto = centroCosto;
		this.habilitadi = habilitadi;
		this.usuarioCreador = usuarioCreador;
		this.usuarioRed = usuarioRed;
	}

	public String getCentroCosto() {
		return centroCosto;
	}

	public void setCentroCosto(String centroCosto) {
		this.centroCosto = centroCosto;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getHabilitadi() {
		return habilitadi;
	}

	public void setHabilitadi(String habilitadi) {
		this.habilitadi = habilitadi;
	}

	public String getUsuarioCreador() {
		return usuarioCreador;
	}

	public void setUsuarioCreador(String usuarioCreador) {
		this.usuarioCreador = usuarioCreador;
	}

	public String getUsuarioRed() {
		return usuarioRed;
	}

	public void setUsuarioRed(String usuarioRed) {
		this.usuarioRed = usuarioRed;
	}
	
	

}
