package com.projetomaven.persistencia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.management.RuntimeErrorException;

public class ConexaoFactory {

	public static Connection getConnection() {
		
		try {
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/sistemaweb", "postgres", "bj@1996#");
		} catch (SQLException e) {
			
			throw new RuntimeException(e);
		}
	}

}
