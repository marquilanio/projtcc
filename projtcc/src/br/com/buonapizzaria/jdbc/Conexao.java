package br.com.buonapizzaria.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	static Connection con = null;
	
	public static Connection getConnection() {
		
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projtcc", "postgres","admin");
			System.out.println("Conectado com sucesso");
		} catch (SQLException e) {
			// Se n�o conectar no banco, ser� exibido essa mensagem de erro.
			// e.printStackTrace(); // mostra o caminho completo do problema.
			System.out.println("Falha ao se conectar com o banco:" + e.getMessage());;
		} catch (ClassNotFoundException e) {
			System.out.println("Driver n�o encontrado");
		}
		return con;
	}
	

}
