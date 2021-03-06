package com.projetomaven.persistencia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.projetomaven.persistencia.entidade.Usuario;

public class UsuarioDAO {

	private Connection connection = ConexaoFactory.getConnection();
	
	
	public void cadastrar(Usuario usuario) {
		String sql = "insert into usuario (nome, login, senha) values (?,?,?)";
		
		try	(PreparedStatement preparador =  connection.prepareStatement(sql)) {
			preparador.setString(1, usuario.getNome()); //substitui o ? pelo dado do usuario
			preparador.setString(2, usuario.getLogin());
			preparador.setString(3, usuario.getSenha());
			
			//executa o comando sql no banco
			preparador.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}


	public void alterar(Usuario usuario) {
		String sql = "update usuario set nome=?, login=?, senha=? where id=?";
		
		try	(PreparedStatement preparador =  connection.prepareStatement(sql)) {
			preparador.setString(1, usuario.getNome()); //substitui o ? pelo dado do usuario
			preparador.setString(2, usuario.getLogin());
			preparador.setString(3, usuario.getSenha());
			preparador.setInt(4, usuario.getId());
			
			//executa o comando sql no banco
			preparador.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}


	public void excluir(Usuario usuario) {
		String sql = "delete from usuario where id=?";
		
		try	(PreparedStatement preparador =  connection.prepareStatement(sql)) {
			preparador.setInt(1, usuario.getId());
			
			//executa o comando sql no banco
			preparador.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
