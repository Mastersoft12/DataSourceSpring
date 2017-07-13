package com.spring.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.NamingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.spring.model.UsuarioCentroCosto;

@Component("usuarioCentroCostoDao")
public class UsuarioCentroCostoDao implements IusuarioCosto {
	
	@Autowired
    @Qualifier("dataSourceSP")
    IDataSourceSp dataSource;
	
	private static final String SqlUsuarioCostoUser = "SELECT * FROM USUARIO_RED_CENTRO_COSTO WHERE USUARIO_DE_RED = ?";
	
	
	public UsuarioCentroCosto buscarUsuarioCentroCostoPorUsuario(String Usuario) throws IllegalArgumentException, NamingException{
		
		UsuarioCentroCosto usuario = new UsuarioCentroCosto();
		Connection con = null;
		PreparedStatement stm = null;
		ResultSet rs = null;
		try{
			con = dataSource.dataSource().getConnection();	
			stm = con.prepareStatement(SqlUsuarioCostoUser);
			stm.setString(1, Usuario);
			rs = stm.executeQuery();
			if(rs.next()){
				usuario.setCentroCosto(rs.getString("CENTRO_DE_COSTO"));
				usuario.setHabilitadi(rs.getString("HABILITADO"));
				usuario.setFechaCreacion(rs.getDate("FECHA_DE_CREACION"));
				usuario.setUsuarioCreador(rs.getString("USUARIO_CREADOR"));
				usuario.setUsuarioRed(rs.getString("USUARIO_DE_RED"));
			}
		}catch (SQLException e) {
			System.err.println("Error ejecutando el query: "+e);	
		}finally {
			try {
				if(null != con){				
						con.close();				
				}
				if(null != stm){
					stm.close();
				}
				if(null != rs){
					rs.close();
				}
			} catch (SQLException e) {
				 System.err.println("Erroral cerrar la conection: "+e);	
			}
		}
		
		return usuario;
		
	}

}
