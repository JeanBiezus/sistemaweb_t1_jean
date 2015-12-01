package com.projetomaven;

import com.projetomaven.persistencia.entidade.Usuario;
import com.projetomaven.persistencia.jdbc.UsuarioDAO;

public class TesteUsuarioDAO {

	public static void main(String[] args) {
		testeExcluir();
		
	}
	
	public static void testeCadastrar(){

		//Criando o usuario
		Usuario usuario = new Usuario();
		usuario.setNome("Jean Biezus");
		usuario.setLogin("Jean Biezus");
		usuario.setSenha("jean123");
		
		//Cadastrando o usuario no banco de dados
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.cadastrar(usuario);
		
		System.out.println("Cadastrado com sucesso!");
	}
	
	public static void testeExcluir(){

		//Excluindo o usuario
		Usuario usuario = new Usuario();
		usuario.setId(3);
		
		//Alterando o usuario no banco de dados
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.excluir(usuario);
		
		System.out.println("Excluido com sucesso!");
	}
	
	public static void testeAlterar(){

		//Alterando o usuario
		Usuario usuario = new Usuario();
		usuario.setId(3);
		usuario.setNome("Jean CF Biezus");
		usuario.setLogin("Jean CF Biezus");
		usuario.setSenha("jean12345");
		
		//Alterando o usuario no banco de dados
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.alterar(usuario);
		
		System.out.println("Alterado com sucesso!");
	}

}
